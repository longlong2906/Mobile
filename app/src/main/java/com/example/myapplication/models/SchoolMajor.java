package com.example.myapplication.models;

import java.io.Serializable;
import java.util.List;

/**
 * Model đại diện cho ngành đào tạo của một trường
 */
public class SchoolMajor implements Serializable {
    private String id;
    private String schoolId; // ID của trường
    private String name; // Tên ngành
    private String code; // Mã ngành
    private String overview; // Tổng quan về ngành
    private String curriculum; // Chương trình đào tạo
    private String careerProspects; // Nghề nghiệp sau khi tốt nghiệp
    private String tuitionFee; // Học phí
    private double benchmarkScore; // Điểm chuẩn
    private double duration; // Thời gian đào tạo (năm)
    private String degree; // Bằng cấp (Cử nhân, Kỹ sư, ...)

    // Thông tin chi tiết cho Tổng quan
    private int credits; // Khối lượng chương trình (tín chỉ)
    private String admissionQuota; // Chỉ tiêu tuyển sinh theo năm
    private String benchmarkScoreHistory; // Điểm trung tuyển theo năm
    private String admissionBlocks; // Tổ hợp xét tuyển

    // Chương trình đào tạo chi tiết
    private String curriculumDetails; // Chi tiết chương trình theo học kỳ
    private List<Subject> subjects; // Danh sách môn học chi tiết
    private List<Specialization> specializations; // Danh sách các chuyên ngành

    // Nghề nghiệp chi tiết
    private String careerDepartments; // Các Cục, Vụ
    private String careerInstitutes; // Các Viện, Trung tâm
    private String careerCorporations; // Các Tập đoàn, Tổng công ty
    private String careerDivisions; // Các phòng chức năng

    // Chuẩn đầu ra
    private List<String> learningOutcomesKnowledge; // Về Kiến thức
    private List<String> learningOutcomesSkills; // Về Kỹ năng
    private List<String> learningOutcomesSoftSkills; // Về Kỹ năng mềm
    private List<String> learningOutcomesAutonomy; // Về Năng lực tự chủ và trách nhiệm
    private List<String> learningOutcomesEthics; // Về Hành vi đạo đức
    private List<String> learningOutcomesLanguage; // Về Ngoại ngữ (Tiếng Anh)
    private List<String> learningOutcomesCareers; // Về Vị trí việc làm sau khi tốt nghiệp

    public SchoolMajor() {
    }

    public SchoolMajor(String id, String schoolId, String name) {
        this.id = id;
        this.schoolId = schoolId;
        this.name = name;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public String getCareerProspects() {
        return careerProspects;
    }

    public void setCareerProspects(String careerProspects) {
        this.careerProspects = careerProspects;
    }

    public String getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(String tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public double getBenchmarkScore() {
        return benchmarkScore;
    }

    public void setBenchmarkScore(double benchmarkScore) {
        this.benchmarkScore = benchmarkScore;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getAdmissionQuota() {
        return admissionQuota;
    }

    public void setAdmissionQuota(String admissionQuota) {
        this.admissionQuota = admissionQuota;
    }

    public String getBenchmarkScoreHistory() {
        return benchmarkScoreHistory;
    }

    public void setBenchmarkScoreHistory(String benchmarkScoreHistory) {
        this.benchmarkScoreHistory = benchmarkScoreHistory;
    }

    public String getAdmissionBlocks() {
        return admissionBlocks;
    }

    public void setAdmissionBlocks(String admissionBlocks) {
        this.admissionBlocks = admissionBlocks;
    }

    public String getCurriculumDetails() {
        return curriculumDetails;
    }

    public void setCurriculumDetails(String curriculumDetails) {
        this.curriculumDetails = curriculumDetails;
    }

    public String getCareerDepartments() {
        return careerDepartments;
    }

    public void setCareerDepartments(String careerDepartments) {
        this.careerDepartments = careerDepartments;
    }

    public String getCareerInstitutes() {
        return careerInstitutes;
    }

    public void setCareerInstitutes(String careerInstitutes) {
        this.careerInstitutes = careerInstitutes;
    }

    public String getCareerCorporations() {
        return careerCorporations;
    }

    public void setCareerCorporations(String careerCorporations) {
        this.careerCorporations = careerCorporations;
    }

    public String getCareerDivisions() {
        return careerDivisions;
    }

    public void setCareerDivisions(String careerDivisions) {
        this.careerDivisions = careerDivisions;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Specialization> getSpecializations() {
        return specializations;
    }

    public void setSpecializations(List<Specialization> specializations) {
        this.specializations = specializations;
    }

    public List<String> getLearningOutcomesKnowledge() {
        return learningOutcomesKnowledge;
    }

    public void setLearningOutcomesKnowledge(List<String> learningOutcomesKnowledge) {
        this.learningOutcomesKnowledge = learningOutcomesKnowledge;
    }

    public List<String> getLearningOutcomesSkills() {
        return learningOutcomesSkills;
    }

    public void setLearningOutcomesSkills(List<String> learningOutcomesSkills) {
        this.learningOutcomesSkills = learningOutcomesSkills;
    }

    public List<String> getLearningOutcomesSoftSkills() {
        return learningOutcomesSoftSkills;
    }

    public void setLearningOutcomesSoftSkills(List<String> learningOutcomesSoftSkills) {
        this.learningOutcomesSoftSkills = learningOutcomesSoftSkills;
    }

    public List<String> getLearningOutcomesAutonomy() {
        return learningOutcomesAutonomy;
    }

    public void setLearningOutcomesAutonomy(List<String> learningOutcomesAutonomy) {
        this.learningOutcomesAutonomy = learningOutcomesAutonomy;
    }

    public List<String> getLearningOutcomesEthics() {
        return learningOutcomesEthics;
    }

    public void setLearningOutcomesEthics(List<String> learningOutcomesEthics) {
        this.learningOutcomesEthics = learningOutcomesEthics;
    }

    public List<String> getLearningOutcomesLanguage() {
        return learningOutcomesLanguage;
    }

    public void setLearningOutcomesLanguage(List<String> learningOutcomesLanguage) {
        this.learningOutcomesLanguage = learningOutcomesLanguage;
    }

    public List<String> getLearningOutcomesCareers() {
        return learningOutcomesCareers;
    }

    public void setLearningOutcomesCareers(List<String> learningOutcomesCareers) {
        this.learningOutcomesCareers = learningOutcomesCareers;
    }
}
