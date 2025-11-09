package com.example.myapplication.models;

import java.io.Serializable;

public class Question implements Serializable {
    private int id;
    private String questionText;
    private HollandType hollandType;

    public Question(int id, String questionText, HollandType hollandType) {
        this.id = id;
        this.questionText = questionText;
        this.hollandType = hollandType;
    }

    public int getId() {
        return id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public HollandType getHollandType() {
        return hollandType;
    }

    public enum HollandType {
        REALISTIC("R", "Thực tế", "Người làm việc với tay, máy móc, công cụ"),
        INVESTIGATIVE("I", "Nghiên cứu", "Người thích tư duy, phân tích, giải quyết vấn đề"),
        ARTISTIC("A", "Nghệ thuật", "Người sáng tạo, thích nghệ thuật và tự do"),
        SOCIAL("S", "Xã hội", "Người thích giúp đỡ, dạy dỗ và chăm sóc người khác"),
        ENTERPRISING("E", "Doanh nghiệp", "Người thích lãnh đạo, thuyết phục và kinh doanh"),
        CONVENTIONAL("C", "Truyền thống", "Người thích tổ chức, xử lý dữ liệu và tuân thủ quy tắc");

        private final String code;
        private final String name;
        private final String description;

        HollandType(String code, String name, String description) {
            this.code = code;
            this.name = name;
            this.description = description;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }
    }
}



