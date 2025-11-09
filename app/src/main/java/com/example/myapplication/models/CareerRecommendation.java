package com.example.myapplication.models;

import java.io.Serializable;

/**
 * Response từ Gemini API chứa gợi ý nghề nghiệp
 */
public class CareerRecommendation implements Serializable {
    private String hollandCode;           // Mã Holland (ví dụ: "RIA")
    private String description;           // Mô tả tính cách
    private String[] recommendedMajors;   // Danh sách ngành nghề gợi ý
    private String explanation;           // Giải thích chi tiết
    
    public CareerRecommendation() {
    }
    
    public CareerRecommendation(String hollandCode, String description, 
                                String[] recommendedMajors, String explanation) {
        this.hollandCode = hollandCode;
        this.description = description;
        this.recommendedMajors = recommendedMajors;
        this.explanation = explanation;
    }
    
    // Getters and Setters
    public String getHollandCode() {
        return hollandCode;
    }
    
    public void setHollandCode(String hollandCode) {
        this.hollandCode = hollandCode;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String[] getRecommendedMajors() {
        return recommendedMajors;
    }
    
    public void setRecommendedMajors(String[] recommendedMajors) {
        this.recommendedMajors = recommendedMajors;
    }
    
    public String getExplanation() {
        return explanation;
    }
    
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
