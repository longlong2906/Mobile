package com.example.myapplication.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatbotData {

    // Keywords mapping to responses
    private static final Map<String, String> responses = new HashMap<>();

    static {
        // Greeting
        responses.put("xin chào|chào|hello|hi", 
            "Xin chào! 👋 Tôi là trợ lý tư vấn hướng nghiệp. Tôi có thể giúp gì cho bạn?");
        
        responses.put("cảm ơn|thank|thanks", 
            "Rất vui được giúp đỡ bạn! 😊 Nếu có thắc mắc gì, đừng ngần ngại hỏi nhé!");

        // Holland Test
        responses.put("holland|trắc nghiệm|test nghề", 
            "Bài trắc nghiệm Holland giúp bạn khám phá ngành nghề phù hợp với tính cách. " +
            "Bạn có thể làm bài test tại tab Quiz. Bài test có 30 câu hỏi và mất khoảng 5-7 phút. 📝");

        responses.put("làm test|làm bài test|bắt đầu test", 
            "Bạn có thể bắt đầu làm bài trắc nghiệm Holland bằng cách:\n" +
            "1. Nhấn vào tab 'Quiz' ở thanh điều hướng\n" +
            "2. Hoặc nhấn vào nút 'Bắt đầu Test' ở trang chủ\n" +
            "Chúc bạn làm bài tốt! 🎯");

        // Majors
        responses.put("ngành học|ngành nghề|chuyên ngành", 
            "Chúng tôi có thông tin về nhiều ngành học phổ biến như:\n" +
            "• Công nghệ thông tin 💻\n" +
            "• Kỹ thuật phần mềm\n" +
            "• Quản trị kinh doanh 💼\n" +
            "• Marketing\n" +
            "• Thiết kế đồ họa 🎨\n" +
            "• Y khoa 🏥\n" +
            "Bạn có thể xem chi tiết tại tab 'Ngành học'!");

        responses.put("cntt|công nghệ thông tin|it", 
            "Ngành Công nghệ thông tin (CNTT) là một trong những ngành hot nhất hiện nay! 💻\n\n" +
            "📚 Bạn sẽ học:\n" +
            "- Lập trình (Java, Python, C++...)\n" +
            "- Cơ sở dữ liệu\n" +
            "- Mạng máy tính\n" +
            "- AI & Machine Learning\n\n" +
            "💰 Mức lương: 12-40 triệu/tháng\n" +
            "📈 Nhu cầu tuyển dụng: Rất cao!");

        responses.put("marketing", 
            "Marketing là ngành học về cách quảng bá sản phẩm và xây dựng thương hiệu! 📢\n\n" +
            "📚 Bạn sẽ học:\n" +
            "- Digital Marketing\n" +
            "- Brand Management\n" +
            "- Consumer Behavior\n" +
            "- Social Media Marketing\n\n" +
            "💰 Mức lương: 8-35 triệu/tháng\n" +
            "📈 Đặc biệt hot với Digital Marketing!");

        // Schools
        responses.put("trường đại học|trường học|đại học", 
            "Chúng tôi có thông tin về 10 trường đại học uy tín tại Việt Nam:\n\n" +
            "🏫 Miền Bắc: Bách Khoa HN, Quốc gia HN, FPT\n" +
            "🏫 Miền Trung: Đà Nẵng, Huế\n" +
            "🏫 Miền Nam: Bách Khoa HCM, Kinh tế HCM, RMIT...\n\n" +
            "Xem chi tiết tại tab 'Trường học'!");

        responses.put("bách khoa|đhbk|hust", 
            "ĐH Bách Khoa Hà Nội là trường kỹ thuật hàng đầu VN! 🏆\n\n" +
            "📍 Địa chỉ: Số 1 Đại Cồ Việt, HN\n" +
            "🎓 Các ngành nổi bật: CNTT, Cơ khí, Điện tử\n" +
            "💰 Học phí: 10-15 triệu/năm\n" +
            "📊 Điểm chuẩn: 27-29 điểm\n\n" +
            "Xem thêm thông tin chi tiết tại tab 'Trường học'!");

        responses.put("fpt", 
            "ĐH FPT là trường tư thục hàng đầu về CNTT và kinh doanh! 🌟\n\n" +
            "📍 Campus: Khu Công nghệ cao Hòa Lạc\n" +
            "🎓 Các ngành: CNTT, Marketing, Thiết kế\n" +
            "💰 Học phí: 50-70 triệu/năm\n" +
            "✨ Đặc điểm: Môi trường quốc tế, thực hành cao\n\n" +
            "Điểm chuẩn: ~18 điểm (linh hoạt)");

        // Career advice
        responses.put("học gì|chọn ngành|lựa chọn ngành", 
            "Để chọn ngành phù hợp, bạn nên:\n\n" +
            "1️⃣ Làm bài test Holland để hiểu về bản thân\n" +
            "2️⃣ Tìm hiểu về các ngành nghề (tab Ngành học)\n" +
            "3️⃣ Xem thông tin các trường đào tạo\n" +
            "4️⃣ Cân nhắc về sở thích & khả năng tài chính\n\n" +
            "Tôi có thể giúp bạn khám phá! 🎯");

        responses.put("điểm chuẩn|điểm thi", 
            "Điểm chuẩn phụ thuộc vào từng trường và ngành. Một số tham khảo:\n\n" +
            "📊 CNTT Bách Khoa HN: ~28.5 điểm\n" +
            "📊 Y Dược: ~28-29 điểm\n" +
            "📊 Kinh tế: ~25-27 điểm\n\n" +
            "Xem chi tiết tại tab 'Trường học' → Chọn trường → Tab 'Tuyển sinh'!");

        responses.put("học phí|chi phí", 
            "Học phí dao động tùy trường:\n\n" +
            "💰 Công lập: 8-15 triệu/năm\n" +
            "💰 Dân lập: 15-30 triệu/năm\n" +
            "💰 Quốc tế: 200-500 triệu/năm\n\n" +
            "Xem chi tiết từng trường tại tab 'Trường học'!");

        // Other questions
        responses.put("tư vấn|hỏi|giúp", 
            "Tôi có thể tư vấn cho bạn về:\n\n" +
            "🎯 Trắc nghiệm hướng nghiệp Holland\n" +
            "📚 Thông tin các ngành học\n" +
            "🏫 Thông tin trường đại học\n" +
            "💡 Tư vấn chọn ngành phù hợp\n\n" +
            "Bạn quan tâm về điều gì nhất?");

        // Farewell
        responses.put("tạm biệt|bye|goodbye", 
            "Tạm biệt và chúc bạn thành công trên con đường sự nghiệp! 🌟\n" +
            "Hẹn gặp lại bạn!");
    }

    public static String getResponse(String userMessage) {
        if (userMessage == null || userMessage.trim().isEmpty()) {
            return "Xin lỗi, tôi không nhận được tin nhắn của bạn. Bạn có thể nói rõ hơn được không? 🤔";
        }

        String message = userMessage.toLowerCase().trim();

        // Check each keyword pattern
        for (Map.Entry<String, String> entry : responses.entrySet()) {
            String[] keywords = entry.getKey().split("\\|");
            for (String keyword : keywords) {
                if (message.contains(keyword.trim())) {
                    return entry.getValue();
                }
            }
        }

        // Default response if no match
        return "Xin lỗi, tôi chưa hiểu câu hỏi của bạn. 😅\n\n" +
               "Bạn có thể hỏi tôi về:\n" +
               "• Trắc nghiệm Holland\n" +
               "• Thông tin ngành học\n" +
               "• Thông tin trường đại học\n" +
               "• Tư vấn chọn ngành\n\n" +
               "Hoặc gõ 'giúp' để xem các chủ đề tôi có thể tư vấn!";
    }

    public static List<String> getQuickReplies() {
        return Arrays.asList(
            "Bài test Holland là gì?",
            "Gợi ý ngành học",
            "Thông tin trường học",
            "Tư vấn chọn ngành"
        );
    }

    public static String getWelcomeMessage() {
        return "Xin chào! 👋 Tôi là trợ lý tư vấn hướng nghiệp.\n\n" +
               "Tôi có thể giúp bạn:\n" +
               "• Tìm hiểu về bài test Holland 🎯\n" +
               "• Khám phá các ngành nghề 📚\n" +
               "• Tìm trường phù hợp 🏫\n" +
               "• Tư vấn chọn ngành 💡\n\n" +
               "Bạn muốn tìm hiểu về điều gì?";
    }
}

