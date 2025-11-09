package com.example.myapplication.services;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.example.myapplication.config.ApiConfig;
import com.example.myapplication.models.Question;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.util.concurrent.TimeUnit;

/**
 * Service để gọi Gemini API và nhận gợi ý nghề nghiệp
 */
public class GeminiService {
    private static final String TAG = "GeminiService";
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    
    private final OkHttpClient client;
    private final ExecutorService executor;
    private final Handler mainHandler;
    
    public GeminiService() {
        // Tăng timeout lên 60 giây (mặc định là 10 giây)
        this.client = new OkHttpClient.Builder()
                .connectTimeout(75, TimeUnit.SECONDS)    // Timeout khi kết nối
                .readTimeout(75, TimeUnit.SECONDS)       // Timeout khi đọc response
                .writeTimeout(75, TimeUnit.SECONDS)      // Timeout khi gửi request
                .build();
        this.executor = Executors.newSingleThreadExecutor();
        this.mainHandler = new Handler(Looper.getMainLooper());
    }
    
    /**
     * Interface callback để nhận kết quả
     */
    public interface GeminiCallback {
        void onSuccess(String response);
        void onError(String error);
    }
    
    /**
     * Gọi Gemini API để phân tích câu trả lời và gợi ý nghề nghiệp
     * 
     * @param selectedQuestions Danh sách câu hỏi người dùng đã chọn
     * @param callback Callback để nhận kết quả
     */
    public void getCareerRecommendation(List<Question> selectedQuestions, GeminiCallback callback) {
        if (!ApiConfig.isApiKeyConfigured()) {
            mainHandler.post(() -> callback.onError("API Key chưa được cấu hình. Vui lòng thêm GEMINI_API_KEY vào ApiConfig.java"));
            return;
        }
        
        executor.execute(() -> {
            try {
                // Tạo prompt
                String prompt = buildPrompt(selectedQuestions);
                
                // Tạo request body
                JSONObject requestBody = new JSONObject();
                JSONArray contents = new JSONArray();
                JSONObject content = new JSONObject();
                JSONArray parts = new JSONArray();
                JSONObject part = new JSONObject();
                
                part.put("text", prompt);
                parts.put(part);
                content.put("parts", parts);
                contents.put(content);
                requestBody.put("contents", contents);
                
                // Thêm generation config
                JSONObject generationConfig = new JSONObject();
                generationConfig.put("temperature", 0.7);
                generationConfig.put("maxOutputTokens", 16384);
                requestBody.put("generationConfig", generationConfig);
                
                Log.d(TAG, "Request: " + requestBody.toString());
                
                // Tạo request
                String url = ApiConfig.GEMINI_API_URL + "?key=" + ApiConfig.GEMINI_API_KEY;
                Request request = new Request.Builder()
                        .url(url)
                        .post(RequestBody.create(requestBody.toString(), JSON))
                        .build();
                
                // Gọi API
                Response response = client.newCall(request).execute();
                String responseBody = response.body().string();
                
                Log.d(TAG, "Response code: " + response.code());
                Log.d(TAG, "Response body length: " + responseBody.length());
                Log.d(TAG, "Response preview: " + responseBody.substring(0, Math.min(500, responseBody.length())));
                
                if (response.isSuccessful()) {
                    // Parse response
                    String result = parseGeminiResponse(responseBody);
                    Log.d(TAG, "Parsed result length: " + result.length());
                    mainHandler.post(() -> callback.onSuccess(result));
                } else {
                    Log.e(TAG, "API returned error code: " + response.code());
                    mainHandler.post(() -> callback.onError("API Error: " + response.code() + " - " + responseBody));
                }
                
            } catch (Exception e) {
                Log.e(TAG, "Error calling Gemini API", e);
                mainHandler.post(() -> callback.onError("Lỗi: " + e.getMessage()));
            }
        });
    }
    
    /**
     * Xây dựng prompt cho Gemini API
     */
    private String buildPrompt(List<Question> selectedQuestions) {
        StringBuilder prompt = new StringBuilder();
        
        // Phần 1: System prompt (hướng dẫn cho AI)
        prompt.append("Bạn là chuyên gia tư vấn hướng nghiệp dựa trên lý thuyết Holland Code (RIASEC).\n\n");
        
        prompt.append("=== NHIỆM VỤ ===\n");
        prompt.append("Phân tích danh sách câu hỏi mà người dùng đã chọn dưới đây và:\n");
        prompt.append("1. Xác định mã Holland (RIASEC) phù hợp nhất (1-3 chữ cái, ví dụ: RIA, SAE)\n");
        prompt.append("2. Mô tả ngắn gọn tính cách nghề nghiệp của người dùng\n");
        prompt.append("3. Gợi ý 5-7 ngành nghề/chuyên ngành cụ thể phù hợp nhất\n");
        prompt.append("4. Giải thích về lý do chọn nghề trên\n\n");
        
        prompt.append("=== LÝ THUYẾT HOLLAND CODE ===\n");
        prompt.append("R (Realistic): Thực tế - Làm việc với tay, máy móc, công cụ\n");
        prompt.append("I (Investigative): Nghiên cứu - Tư duy, phân tích, giải quyết vấn đề\n");
        prompt.append("A (Artistic): Nghệ thuật - Sáng tạo, nghệ thuật, tự do\n");
        prompt.append("S (Social): Xã hội - Giúp đỡ, dạy dỗ, chăm sóc người khác\n");
        prompt.append("E (Enterprising): Doanh nghiệp - Lãnh đạo, thuyết phục, kinh doanh\n");
        prompt.append("C (Conventional): Truyền thống - Tổ chức, xử lý dữ liệu, tuân thủ quy tắc\n\n");
        prompt.append("Hãy phản hồi dưới dạng 1 câu miêu tả về người dùng, xong hãy list ra 5 nghề nhé");
        
        // Phần 2: Dữ liệu từ người dùng
        prompt.append("=== CÁC CÂU HỎI NGƯỜI DÙNG ĐÃ CHỌN ===\n");
        prompt.append("Tổng số câu: ").append(selectedQuestions.size()).append("/30\n\n");
        
        // Đếm số câu theo từng loại Holland
        int[] counts = new int[6]; // R, I, A, S, E, C
        for (Question q : selectedQuestions) {
            switch (q.getHollandType()) {
                case REALISTIC: counts[0]++; break;
                case INVESTIGATIVE: counts[1]++; break;
                case ARTISTIC: counts[2]++; break;
                case SOCIAL: counts[3]++; break;
                case ENTERPRISING: counts[4]++; break;
                case CONVENTIONAL: counts[5]++; break;
            }
        }
        
        prompt.append("Phân bố theo Holland Type:\n");
        prompt.append("- R (Realistic): ").append(counts[0]).append(" câu\n");
        prompt.append("- I (Investigative): ").append(counts[1]).append(" câu\n");
        prompt.append("- A (Artistic): ").append(counts[2]).append(" câu\n");
        prompt.append("- S (Social): ").append(counts[3]).append(" câu\n");
        prompt.append("- E (Enterprising): ").append(counts[4]).append(" câu\n");
        prompt.append("- C (Conventional): ").append(counts[5]).append(" câu\n\n");
        
        prompt.append("Chi tiết các câu đã chọn:\n");
        for (int i = 0; i < selectedQuestions.size(); i++) {
            Question q = selectedQuestions.get(i);
            prompt.append(String.format("%d. [%s] %s\n", 
                i + 1, 
                q.getHollandType().getCode(), 
                q.getQuestionText()));
        }
        
        // Phần 3: Format đầu ra
        prompt.append("\n=== YÊU CẦU FORMAT TRẢ LỜI ===\n");
        prompt.append("Vui lòng trả lời theo format sau (chính xác):\n\n");
        prompt.append("**MÃ HOLLAND:** [Mã 1-3 chữ cái]\n\n");
        prompt.append("**MÔ TẢ TÍNH CÁCH:**\n");
        prompt.append("[Mô tả 2-3 câu về tính cách nghề nghiệp]\n\n");
        prompt.append("**NGÀNH NGHỀ GỢI Ý:**\n");
        prompt.append("1. [Tên ngành 1]\n");
        prompt.append("2. [Tên ngành 2]\n");
        prompt.append("3. [Tên ngành 3]\n");
        prompt.append("4. [Tên ngành 4]\n");
        prompt.append("5. [Tên ngành 5]\n\n");
        prompt.append("**GIẢI THÍCH:**\n");
        prompt.append("[Giải thích vì sao những ngành này phù hợp với người dùng]\n");
        
        return prompt.toString();
    }
    
    /**
     * Parse response từ Gemini API
     */
    private String parseGeminiResponse(String responseBody) throws Exception {
        JSONObject json = new JSONObject(responseBody);
        
        // Kiểm tra có lỗi từ API không
        if (json.has("error")) {
            JSONObject error = json.getJSONObject("error");
            String errorMessage = error.optString("message", "Unknown error");
            int errorCode = error.optInt("code", 0);
            throw new Exception("Gemini API Error [" + errorCode + "]: " + errorMessage);
        }
        
        // Parse response thành công
        if (json.has("candidates")) {
            JSONArray candidates = json.getJSONArray("candidates");
            if (candidates.length() > 0) {
                JSONObject candidate = candidates.getJSONObject(0);
                
                // Kiểm tra có bị block không (safety ratings)
                if (candidate.has("finishReason")) {
                    String finishReason = candidate.getString("finishReason");
                    if (!finishReason.equals("STOP")) {
                        throw new Exception("Response bị chặn. Lý do: " + finishReason);
                    }
                }
                
                // Lấy content
                if (candidate.has("content")) {
                    JSONObject content = candidate.getJSONObject("content");
                    if (content.has("parts")) {
                        JSONArray parts = content.getJSONArray("parts");
                        if (parts.length() > 0) {
                            JSONObject part = parts.getJSONObject(0);
                            if (part.has("text")) {
                                return part.getString("text");
                            }
                        }
                    }
                }
            }
        }
        
        // Nếu không parse được, trả về toàn bộ response để debug
        throw new Exception("Không thể parse response. Raw response: " + responseBody.substring(0, Math.min(500, responseBody.length())));
    }
    
    /**
     * Cleanup resources
     */
    public void shutdown() {
        executor.shutdown();
    }
}
