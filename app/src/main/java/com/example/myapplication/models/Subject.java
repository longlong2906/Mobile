package com.example.myapplication.models;

import java.io.Serializable;

/**
 * Model đại diện cho một môn học trong chương trình đào tạo
 */
public class Subject implements Serializable {
    private String name; // Tên môn học
    private int credits; // Số tín chỉ
    private int semester; // Học kỳ
    private String type; // Loại môn: "BAT_BUOC_CHUNG", "BAT_BUOC_NGANH", "CO_SO_NGANH", "CHUYEN_NGANH",
                         // "THUC_TAP", "GDCN", "LUAN_VAN"

    private String code; // Mã học phần

    public Subject() {
    }

    public Subject(String name, int credits, int semester, String type) {
        this.name = name;
        this.credits = credits;
        this.semester = semester;
        this.type = type;
    }

    // Constructor mới cho dữ liệu Bách Khoa (có mã học phần)
    public Subject(String code, String name, int credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.semester = 1; // Mặc định
        this.type = "CHUYEN_NGANH"; // Mặc định
    }

    public Subject(String code, String name, int credits, int semester) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.semester = semester;
        this.type = "CHUYEN_NGANH"; // Mặc định loại chuyên ngành hoặc tự động xử lý sau
    }

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Get color based on type
    public int getBorderColor() {
        switch (type) {
            case "BAT_BUOC_CHUNG":
                return 0xFF42A5F5; // Blue
            case "BAT_BUOC_NGANH":
                return 0xFF26C6DA; // Cyan
            case "CO_SO_NGANH":
                return 0xFFEF5350; // Red
            case "CHUYEN_NGANH":
                return 0xFFFFA726; // Orange
            case "THUC_TAP":
                return 0xFF5C6BC0; // Indigo
            case "GDCN":
                return 0xFFAB47BC; // Purple
            case "LUAN_VAN":
                return 0xFF66BB6A; // Green
            default:
                return 0xFF9E9E9E; // Gray
        }
    }
}
