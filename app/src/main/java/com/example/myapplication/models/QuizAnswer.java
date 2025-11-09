package com.example.myapplication.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Model lưu trữ các câu hỏi được chọn trong quiz
 */
public class QuizAnswer implements Serializable {
    private Set<Integer> selectedQuestionIds; // Set các ID câu hỏi đã chọn

    public QuizAnswer() {
        this.selectedQuestionIds = new HashSet<>();
    }

    public void selectQuestion(int questionId) {
        selectedQuestionIds.add(questionId);
    }

    public void deselectQuestion(int questionId) {
        selectedQuestionIds.remove(questionId);
    }

    public boolean isQuestionSelected(int questionId) {
        return selectedQuestionIds.contains(questionId);
    }

    public Set<Integer> getSelectedQuestionIds() {
        return selectedQuestionIds;
    }

    public int getSelectedCount() {
        return selectedQuestionIds.size();
    }

    public void clear() {
        selectedQuestionIds.clear();
    }
}
