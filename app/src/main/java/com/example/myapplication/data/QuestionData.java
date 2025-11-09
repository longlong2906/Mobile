package com.example.myapplication.data;

import com.example.myapplication.models.Question;
import com.example.myapplication.models.Question.HollandType;

import java.util.ArrayList;
import java.util.List;

public class QuestionData {
    
    public static List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();

        // Realistic (R) - 5 câu
        questions.add(new Question(1, 
            "Tôi thích làm việc với máy móc, thiết bị và công cụ", 
            HollandType.REALISTIC));
        
        questions.add(new Question(2, 
            "Tôi thích sửa chữa đồ vật, xe máy hoặc thiết bị điện tử", 
            HollandType.REALISTIC));
        
        questions.add(new Question(3, 
            "Tôi thích làm việc ngoài trời hơn là trong văn phòng", 
            HollandType.REALISTIC));
        
        questions.add(new Question(4, 
            "Tôi thích xây dựng hoặc lắp ráp đồ vật", 
            HollandType.REALISTIC));
        
        questions.add(new Question(5, 
            "Tôi thích các công việc đòi hỏi kỹ năng thủ công", 
            HollandType.REALISTIC));

        // Investigative (I) - 5 câu
        questions.add(new Question(6, 
            "Tôi thích tìm hiểu cách thức hoạt động của mọi thứ", 
            HollandType.INVESTIGATIVE));
        
        questions.add(new Question(7, 
            "Tôi thích giải các bài toán khó và phức tạp", 
            HollandType.INVESTIGATIVE));
        
        questions.add(new Question(8, 
            "Tôi thích làm thí nghiệm và nghiên cứu khoa học", 
            HollandType.INVESTIGATIVE));
        
        questions.add(new Question(9, 
            "Tôi thích phân tích dữ liệu và tìm ra quy luật", 
            HollandType.INVESTIGATIVE));
        
        questions.add(new Question(10, 
            "Tôi thích đọc sách về khoa học, công nghệ", 
            HollandType.INVESTIGATIVE));

        // Artistic (A) - 5 câu
        questions.add(new Question(11, 
            "Tôi thích vẽ, thiết kế hoặc sáng tạo nghệ thuật", 
            HollandType.ARTISTIC));
        
        questions.add(new Question(12, 
            "Tôi thích viết truyện, thơ hoặc sáng tác nhạc", 
            HollandType.ARTISTIC));
        
        questions.add(new Question(13, 
            "Tôi thích biểu diễn trước đám đông", 
            HollandType.ARTISTIC));
        
        questions.add(new Question(14, 
            "Tôi thích trang trí và làm đẹp không gian", 
            HollandType.ARTISTIC));
        
        questions.add(new Question(15, 
            "Tôi thích thể hiện cảm xúc qua nghệ thuật", 
            HollandType.ARTISTIC));

        // Social (S) - 5 câu
        questions.add(new Question(16, 
            "Tôi thích giúp đỡ người khác giải quyết vấn đề", 
            HollandType.SOCIAL));
        
        questions.add(new Question(17, 
            "Tôi thích dạy hoặc hướng dẫn người khác", 
            HollandType.SOCIAL));
        
        questions.add(new Question(18, 
            "Tôi thích làm việc với trẻ em hoặc người cao tuổi", 
            HollandType.SOCIAL));
        
        questions.add(new Question(19, 
            "Tôi thích tham gia các hoạt động tình nguyện", 
            HollandType.SOCIAL));
        
        questions.add(new Question(20, 
            "Tôi thích lắng nghe và tư vấn cho người khác", 
            HollandType.SOCIAL));

        // Enterprising (E) - 5 câu
        questions.add(new Question(21, 
            "Tôi thích lãnh đạo và quản lý nhóm", 
            HollandType.ENTERPRISING));
        
        questions.add(new Question(22, 
            "Tôi thích thuyết phục người khác về ý tưởng của mình", 
            HollandType.ENTERPRISING));
        
        questions.add(new Question(23, 
            "Tôi thích khởi nghiệp và kinh doanh", 
            HollandType.ENTERPRISING));
        
        questions.add(new Question(24, 
            "Tôi thích đàm phán và bán hàng", 
            HollandType.ENTERPRISING));
        
        questions.add(new Question(25, 
            "Tôi thích đặt mục tiêu và đạt được thành công", 
            HollandType.ENTERPRISING));

        // Conventional (C) - 5 câu
        questions.add(new Question(26, 
            "Tôi thích tổ chức và sắp xếp mọi thứ ngăn nắp", 
            HollandType.CONVENTIONAL));
        
        questions.add(new Question(27, 
            "Tôi thích làm việc với số liệu và báo cáo", 
            HollandType.CONVENTIONAL));
        
        questions.add(new Question(28, 
            "Tôi thích làm theo quy trình và hướng dẫn rõ ràng", 
            HollandType.CONVENTIONAL));
        
        questions.add(new Question(29, 
            "Tôi thích kiểm tra và đảm bảo độ chính xác", 
            HollandType.CONVENTIONAL));
        
        questions.add(new Question(30, 
            "Tôi thích lưu trữ và quản lý hồ sơ, tài liệu", 
            HollandType.CONVENTIONAL));

        return questions;
    }

    // Gợi ý ngành nghề cho từng nhóm Holland
    public static String[] getSuggestedMajors(HollandType type) {
        switch (type) {
            case REALISTIC:
                return new String[]{
                    "Kỹ thuật cơ khí",
                    "Kỹ thuật điện - điện tử",
                    "Kỹ thuật xây dựng",
                    "Công nghệ ô tô",
                    "Kỹ thuật hàng không",
                    "Nông nghiệp"
                };
            
            case INVESTIGATIVE:
                return new String[]{
                    "Khoa học máy tính",
                    "Công nghệ thông tin",
                    "Toán học",
                    "Vật lý",
                    "Hóa học",
                    "Y khoa",
                    "Dược học"
                };
            
            case ARTISTIC:
                return new String[]{
                    "Thiết kế đồ họa",
                    "Kiến trúc",
                    "Mỹ thuật",
                    "Âm nhạc",
                    "Điện ảnh - Truyền hình",
                    "Thiết kế thời trang",
                    "Văn học"
                };
            
            case SOCIAL:
                return new String[]{
                    "Sư phạm",
                    "Tâm lý học",
                    "Công tác xã hội",
                    "Điều dưỡng",
                    "Nhân sự",
                    "Tư vấn giáo dục"
                };
            
            case ENTERPRISING:
                return new String[]{
                    "Quản trị kinh doanh",
                    "Marketing",
                    "Kinh tế",
                    "Luật",
                    "Quan hệ công chúng",
                    "Bất động sản"
                };
            
            case CONVENTIONAL:
                return new String[]{
                    "Kế toán",
                    "Tài chính - Ngân hàng",
                    "Quản trị văn phòng",
                    "Thư viện - Lưu trữ",
                    "Thống kê",
                    "Thuế"
                };
            
            default:
                return new String[]{"Chưa xác định"};
        }
    }
}



