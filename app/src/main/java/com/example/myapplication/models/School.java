package com.example.myapplication.models;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class School implements Serializable {
    private String id;
    private String name;
    private String shortName;
    private String region; // "Bắc", "Trung", "Nam"
    private String type; // "Công lập", "Dân lập", "Quốc tế"
    private String address;
    private String phone;
    private String email;
    private String website;
    private String description;
    private int imageResId; // ID của ảnh trường trong drawable
    private String imageUrl; // URL ảnh từ internet
    
    // Tab 1: Thông tin chung
    private List<String> images; // URLs of school images
    private List<String> majors; // Các ngành đào tạo
    private String tuitionRange; // Học phí
    private List<String> facilities; // Cơ sở vật chất
    private List<String> clubs; // Các CLB
    
    // Tab 2: Thông tin tuyển sinh
    private String admissionPolicy; // Quy chế tuyển sinh
    private Map<String, Double> benchmarkScores; // Điểm chuẩn theo ngành (năm gần nhất)
    private String admissionQuota; // Chỉ tiêu tuyển sinh
    private List<String> admissionMethods; // Phương thức tuyển sinh

    // Constructor mặc định cho Firestore
    public School() {
    }

    public School(String id, String name, String shortName, String region, String type) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.region = region;
        this.type = type;
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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<String> getMajors() {
        return majors;
    }

    public void setMajors(List<String> majors) {
        this.majors = majors;
    }

    public String getTuitionRange() {
        return tuitionRange;
    }

    public void setTuitionRange(String tuitionRange) {
        this.tuitionRange = tuitionRange;
    }

    public List<String> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<String> facilities) {
        this.facilities = facilities;
    }

    public List<String> getClubs() {
        return clubs;
    }

    public void setClubs(List<String> clubs) {
        this.clubs = clubs;
    }

    public String getAdmissionPolicy() {
        return admissionPolicy;
    }

    public void setAdmissionPolicy(String admissionPolicy) {
        this.admissionPolicy = admissionPolicy;
    }

    public Map<String, Double> getBenchmarkScores() {
        return benchmarkScores;
    }

    public void setBenchmarkScores(Map<String, Double> benchmarkScores) {
        this.benchmarkScores = benchmarkScores;
    }

    public String getAdmissionQuota() {
        return admissionQuota;
    }

    public void setAdmissionQuota(String admissionQuota) {
        this.admissionQuota = admissionQuota;
    }

    public List<String> getAdmissionMethods() {
        return admissionMethods;
    }

    public void setAdmissionMethods(List<String> admissionMethods) {
        this.admissionMethods = admissionMethods;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

