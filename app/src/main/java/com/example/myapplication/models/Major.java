package com.example.myapplication.models;

import java.io.Serializable;
import java.util.List;

public class Major implements Serializable {
    private String id;
    private String name;
    private String category;  // Mảng/Lĩnh vực liên quan
    private String description;  // Mô tả công việc
    private String imageUrl;
    
    // Yêu cầu
    private String educationRequirement;  // Yêu cầu trình độ học vấn
    private List<String> technicalSkills;  // Kỹ năng chuyên môn
    private List<String> softSkills;  // Kỹ năng mềm phù hợp
    private String suitableFor;  // Đối tượng phù hợp
    
    // Phát triển nghề nghiệp
    private List<String> careerPath;  // Lộ trình phát triển nghề nghiệp
    private List<String> workEnvironments;  // Các môi trường làm việc
    
    // Thu nhập và cơ hội
    private String salaryRange;  // Mức lương trung bình
    private String jobOpportunities;  // Cơ hội việc làm hiện tại và tiềm năng tương lai
    
    // Thách thức
    private List<String> challenges;  // Những khó khăn, thách thức thường gặp
    
    // Đào tạo
    private List<String> schools;  // Các trường đại học đào tạo hàng đầu
    
    // Holland Test
    private String hollandType; // Holland type code (R, I, A, S, E, C)
    
    // Legacy field for backward compatibility
    private List<String> requiredSkills;
    private String marketDemand;

    // Constructor mặc định cho Firestore
    public Major() {
    }

    public Major(String id, String name, String category, String description) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<String> getCareerPath() {
        return careerPath;
    }

    public void setCareerPath(List<String> careerPath) {
        this.careerPath = careerPath;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(List<String> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public String getSalaryRange() {
        return salaryRange;
    }

    public void setSalaryRange(String salaryRange) {
        this.salaryRange = salaryRange;
    }

    public String getMarketDemand() {
        return marketDemand;
    }

    public void setMarketDemand(String marketDemand) {
        this.marketDemand = marketDemand;
    }

    public List<String> getSchools() {
        return schools;
    }

    public void setSchools(List<String> schools) {
        this.schools = schools;
    }

    public String getHollandType() {
        return hollandType;
    }

    public void setHollandType(String hollandType) {
        this.hollandType = hollandType;
    }

    public String getEducationRequirement() {
        return educationRequirement;
    }

    public void setEducationRequirement(String educationRequirement) {
        this.educationRequirement = educationRequirement;
    }

    public List<String> getTechnicalSkills() {
        return technicalSkills;
    }

    public void setTechnicalSkills(List<String> technicalSkills) {
        this.technicalSkills = technicalSkills;
    }

    public List<String> getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(List<String> softSkills) {
        this.softSkills = softSkills;
    }

    public String getSuitableFor() {
        return suitableFor;
    }

    public void setSuitableFor(String suitableFor) {
        this.suitableFor = suitableFor;
    }

    public List<String> getWorkEnvironments() {
        return workEnvironments;
    }

    public void setWorkEnvironments(List<String> workEnvironments) {
        this.workEnvironments = workEnvironments;
    }

    public String getJobOpportunities() {
        return jobOpportunities;
    }

    public void setJobOpportunities(String jobOpportunities) {
        this.jobOpportunities = jobOpportunities;
    }

    public List<String> getChallenges() {
        return challenges;
    }

    public void setChallenges(List<String> challenges) {
        this.challenges = challenges;
    }
}

