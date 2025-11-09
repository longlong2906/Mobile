package com.example.myapplication.models;

import java.io.Serializable;
import java.util.List;

/**
 * Model đại diện cho một trang quiz gồm nhiều câu hỏi
 */
public class QuizPage implements Serializable {
    private final int pageNumber;
    private final List<Question> questions;
    private final String title;

    public QuizPage(int pageNumber, List<Question> questions) {
        this.pageNumber = pageNumber;
        this.questions = questions;
        this.title = "Trang " + pageNumber + "/6";
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public String getTitle() {
        return title;
    }

    public int getQuestionCount() {
        return questions.size();
    }
}
