# TÍCH HỢP GEMINI API - GỢI Ý NGHỀ NGHIỆP TỰ ĐỘNG

## 📋 Tổng quan

Hệ thống đã được tích hợp Gemini API để phân tích câu trả lời trắc nghiệm Holland và tự động gợi ý nghề nghiệp phù hợp.

## 🎯 Luồng hoạt động

```
1. Người dùng làm quiz (6 trang, mỗi trang 5 câu checkbox)
   ↓
2. Hệ thống thu thập các câu đã chọn
   ↓
3. Hiển thị trang tổng hợp (QuizSummaryFragment)
   ↓
4. Người dùng nhấn "Nhận gợi ý nghề nghiệp từ AI"
   ↓
5. GeminiService gửi prompt + dữ liệu đến Gemini API
   ↓
6. Gemini API phân tích và trả về:
      - Mã Holland (VD: RIA, SAE)
      - Mô tả tính cách nghề nghiệp
      - Danh sách 5-7 ngành nghề gợi ý
      - Giải thích chi tiết
   ↓
7. Hiển thị kết quả cho người dùng
```

## 📁 Cấu trúc file mới

### 1. **ApiConfig.java** (`config/ApiConfig.java`)
- Quản lý API key và endpoints
- **QUAN TRỌNG**: Phải cập nhật `GEMINI_API_KEY` trước khi sử dụng

### 2. **GeminiService.java** (`services/GeminiService.java`)
- Service gọi Gemini API
- Xây dựng prompt tự động từ câu trả lời
- Parse response và trả về kết quả

### 3. **CareerRecommendation.java** (`models/CareerRecommendation.java`)
- Model chứa kết quả gợi ý nghề nghiệp
- Bao gồm: Holland Code, mô tả, danh sách ngành, giải thích

### 4. **QuizSummaryFragment.java** (đã cập nhật)
- Thêm nút "Nhận gợi ý nghề nghiệp từ AI"
- Tích hợp GeminiService
- Hiển thị kết quả từ API

### 5. **fragment_quiz_summary.xml** (đã cập nhật)
- Thêm Button để gọi API
- Thêm CardView để hiển thị kết quả
- Responsive layout với ScrollView

## 🔧 Cấu hình

### Bước 1: Lấy Gemini API Key (MIỄN PHÍ)

1. Truy cập: https://makersuite.google.com/app/apikey
2. Đăng nhập bằng tài khoản Google
3. Click "Create API Key"
4. Copy API key

### Bước 2: Cập nhật API Key

Mở file `app/src/main/java/com/example/myapplication/config/ApiConfig.java`:

```java
public static final String GEMINI_API_KEY = "AIzaSy..."; // Thay bằng API key của bạn
```

### Bước 3: Build và chạy

```bash
./gradlew build
```

## 📦 Dependencies đã thêm

```gradle
// Gemini API
implementation("com.google.ai.client.generativeai:generativeai:0.1.2")
implementation("com.google.guava:guava:31.1-android")
implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

// HTTP client
implementation("com.squareup.okhttp3:okhttp:4.12.0")
implementation("com.google.code.gson:gson:2.10.1")
```

## 💡 Cách hoạt động của Prompt

### Prompt được xây dựng tự động gồm 3 phần:

**1. System Prompt (Fixed - bạn có thể chỉnh sửa)**
```
Bạn là chuyên gia tư vấn hướng nghiệp dựa trên lý thuyết Holland Code...
```

**2. Dữ liệu người dùng (Dynamic)**
- Danh sách câu hỏi đã chọn
- Phân bố theo Holland Type (R, I, A, S, E, C)
- Chi tiết từng câu

**3. Format yêu cầu (Fixed)**
```
**MÃ HOLLAND:** [Mã 1-3 chữ cái]
**MÔ TẢ TÍNH CÁCH:** [...]
**NGÀNH NGHỀ GỢI Ý:** [...]
**GIẢI THÍCH:** [...]
```

### Tùy chỉnh Prompt

Mở `GeminiService.java`, tìm method `buildPrompt()` và chỉnh sửa:

```java
private String buildPrompt(List<Question> selectedQuestions) {
    StringBuilder prompt = new StringBuilder();
    
    // PHẦN NÀY BẠN CÓ THỂ TÙY CHỈNH
    prompt.append("Bạn là chuyên gia tư vấn hướng nghiệp...\n");
    
    // ... phần còn lại
}
```

## 🎨 UI/UX Flow

1. **Trang tổng hợp ban đầu**
   - Hiển thị danh sách câu đã chọn
   - Nút "Nhận gợi ý nghề nghiệp từ AI"

2. **Khi nhấn nút**
   - Hiển thị ProgressDialog: "Đang phân tích câu trả lời của bạn..."
   - Gọi API (async, không block UI)

3. **Khi có kết quả**
   - Ẩn ProgressDialog
   - Hiển thị kết quả trong CardView
   - Ẩn nút (đã nhận gợi ý rồi)

4. **Khi có lỗi**
   - Hiển thị Toast với thông báo lỗi
   - Nút vẫn còn để người dùng thử lại

## 📊 Ví dụ Response từ Gemini

```
**MÃ HOLLAND:** RIA

**MÔ TẢ TÍNH CÁCH:**
Bạn là người thích làm việc thực tế với công cụ và máy móc, đồng thời có 
khả năng tư duy logic và phân tích tốt. Bạn thích tìm hiểu cách thức hoạt 
động của mọi thứ và giải quyết vấn đề một cách có hệ thống.

**NGÀNH NGHỀ GỢI Ý:**
1. Kỹ sư Cơ khí
2. Kỹ sư Điện - Điện tử
3. Công nghệ Thông tin
4. Kiến trúc sư
5. Khoa học Máy tính
6. Kỹ sư Xây dựng

**GIẢI THÍCH:**
Các ngành nghề trên phù hợp với bạn vì kết hợp giữa kỹ năng thực hành 
(R - Realistic) và khả năng tư duy phân tích (I - Investigative)...
```

## 🔒 Bảo mật API Key

### ⚠️ CẢNH BÁO

**KHÔNG** commit API key lên Git/GitHub!

### Giải pháp cho Production:

**Option 1: Sử dụng local.properties**

```properties
# local.properties (file này nên thêm vào .gitignore)
GEMINI_API_KEY=AIzaSy...
```

```gradle
// build.gradle.kts
android {
    defaultConfig {
        // Load từ local.properties
        val properties = Properties()
        properties.load(project.rootProject.file("local.properties").inputStream())
        buildConfigField("String", "GEMINI_API_KEY", "\"${properties.getProperty("GEMINI_API_KEY")}\"")
    }
}
```

**Option 2: Environment Variables**

```java
String apiKey = System.getenv("GEMINI_API_KEY");
```

## 🧪 Testing

### Test thủ công:

1. Mở app → Làm quiz
2. Chọn ít nhất 5 câu hỏi
3. Hoàn thành 6 trang
4. Trang tổng hợp → Nhấn "Nhận gợi ý nghề nghiệp từ AI"
5. Đợi 3-5 giây
6. Xem kết quả hiển thị

### Debug logs:

Check Logcat với tag `GeminiService`:
```
D/GeminiService: Request: {...}
D/GeminiService: Response code: 200
D/GeminiService: Response: {...}
```

## 🚀 Tối ưu hóa

### 1. Cache kết quả
Lưu kết quả vào SharedPreferences hoặc Firestore để tránh gọi API lại

### 2. Retry mechanism
Tự động retry khi API fail

### 3. Rate limiting
Gemini API free có giới hạn 60 requests/phút

### 4. Error handling
- Không có internet → Thông báo rõ ràng
- API key sai → Hướng dẫn cấu hình
- Timeout → Cho phép thử lại

## 📝 TODO

- [ ] Lưu kết quả vào Firebase Firestore
- [ ] Hiển thị history các lần phân tích
- [ ] Export kết quả thành PDF
- [ ] Tích hợp với module Majors (gợi ý ngành đã có sẵn)
- [ ] A/B testing các prompt khác nhau
- [ ] Analytics: track success rate, response time

## 🐛 Troubleshooting

### Lỗi: "API Key chưa được cấu hình"
→ Kiểm tra `ApiConfig.GEMINI_API_KEY`

### Lỗi: "API Error: 400"
→ API key sai hoặc request format không đúng

### Lỗi: "API Error: 429"
→ Vượt quá rate limit, đợi 1 phút

### Lỗi: Network timeout
→ Kiểm tra kết nối internet

### Response trống
→ Check Logcat xem Gemini trả về gì

## 📚 Tài liệu tham khảo

- Gemini API Docs: https://ai.google.dev/docs
- Holland Code Theory: https://en.wikipedia.org/wiki/Holland_Codes
- OkHttp: https://square.github.io/okhttp/

---

**Tác giả**: AI Assistant  
**Ngày tạo**: November 3, 2025  
**Version**: 1.0
