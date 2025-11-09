package com.example.myapplication.data;

import com.example.myapplication.models.Question;
import com.example.myapplication.models.Question.HollandType;
import com.example.myapplication.models.QuizPage;

import java.util.ArrayList;
import java.util.List;

/**
 * Cung cấp dữ liệu câu hỏi được phân chia thành các trang
 */
public class QuizPageData {
    
    /**
     * Lấy danh sách 6 trang quiz, mỗi trang có 5 câu hỏi
     */
    public static List<QuizPage> getQuizPages() {
        List<Question> allQuestions = QuestionData.getQuestions();
        List<QuizPage> pages = new ArrayList<>();
        
        // Chia 30 câu hỏi thành 6 trang, mỗi trang 5 câu
        int questionsPerPage = 5;
        int totalPages = 6;
        
        for (int i = 0; i < totalPages; i++) {
            int startIndex = i * questionsPerPage;
            int endIndex = Math.min(startIndex + questionsPerPage, allQuestions.size());
            
            List<Question> pageQuestions = allQuestions.subList(startIndex, endIndex);
            pages.add(new QuizPage(i + 1, pageQuestions));
        }
        
        return pages;
    }
    
    /**
     * Lấy một trang cụ thể
     */
    public static QuizPage getPage(int pageNumber) {
        if (pageNumber < 1 || pageNumber > 6) {
            return null;
        }
        return getQuizPages().get(pageNumber - 1);
    }
    
    /**
     * Tính toán kết quả Holland dựa trên các câu đã chọn
     */
    public static HollandType calculateHollandResult(List<Integer> selectedQuestionIds) {
        List<Question> allQuestions = QuestionData.getQuestions();
        
        // Đếm số câu hỏi đã chọn cho mỗi nhóm Holland
        int[] scores = new int[6]; // R, I, A, S, E, C
        
        for (Integer questionId : selectedQuestionIds) {
            // Tìm câu hỏi theo ID
            for (Question question : allQuestions) {
                if (question.getId() == questionId) {
                    HollandType type = question.getHollandType();
                    scores[getTypeIndex(type)]++;
                    break;
                }
            }
        }
        
        // Tìm nhóm có điểm cao nhất
        int maxScore = 0;
        int maxIndex = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxIndex = i;
            }
        }
        
        return getTypeByIndex(maxIndex);
    }
    
    private static int getTypeIndex(HollandType type) {
        switch (type) {
            case REALISTIC: return 0;
            case INVESTIGATIVE: return 1;
            case ARTISTIC: return 2;
            case SOCIAL: return 3;
            case ENTERPRISING: return 4;
            case CONVENTIONAL: return 5;
            default: return 0;
        }
    }
    
    private static HollandType getTypeByIndex(int index) {
        switch (index) {
            case 0: return HollandType.REALISTIC;
            case 1: return HollandType.INVESTIGATIVE;
            case 2: return HollandType.ARTISTIC;
            case 3: return HollandType.SOCIAL;
            case 4: return HollandType.ENTERPRISING;
            case 5: return HollandType.CONVENTIONAL;
            default: return HollandType.REALISTIC;
        }
    }
}
