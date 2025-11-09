package com.example.myapplication.models;

import java.io.Serializable;
import java.util.List;

public class Major implements Serializable {
    private String id;
    private String name;
    private String category;
    private String description;
    private String imageUrl;
    private List<String> careerPath;
    private List<String> requiredSkills;
    private String salaryRange;
    private String marketDemand;
    private List<String> schools;
    private String hollandType; // Holland type code (R, I, A, S, E, C)

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
}

