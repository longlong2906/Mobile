package com.example.myapplication.models;

import java.io.Serializable;
import java.util.List;

/**
 * Model đại diện cho chuyên ngành trong một ngành đào tạo
 */
public class Specialization implements Serializable {
    private String id;
    private String name; // Tên chuyên ngành
    private List<Subject> subjects; // Danh sách môn học của chuyên ngành

    public Specialization() {
    }

    public Specialization(String id, String name, List<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
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

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}










