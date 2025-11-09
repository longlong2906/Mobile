package com.example.myapplication.models;

import java.util.List;

public class User {
    private String uid;
    private String fullName;
    private String email;
    private String hollandType;
    private List<String> suggestedMajors;
    private long createdAt;

    // Constructor mặc định cần thiết cho Firestore
    public User() {
    }

    public User(String uid, String fullName, String email) {
        this.uid = uid;
        this.fullName = fullName;
        this.email = email;
        this.createdAt = System.currentTimeMillis();
    }

    // Getters and Setters
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHollandType() {
        return hollandType;
    }

    public void setHollandType(String hollandType) {
        this.hollandType = hollandType;
    }

    public List<String> getSuggestedMajors() {
        return suggestedMajors;
    }

    public void setSuggestedMajors(List<String> suggestedMajors) {
        this.suggestedMajors = suggestedMajors;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }
}





