package com.example.myapplication.repositories;

import android.util.Log;

import com.example.myapplication.models.SchoolMajor;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.List;

/**
 * Repository để lấy dữ liệu SchoolMajor từ Firebase Firestore
 */
public class SchoolMajorRepository {
    private static final String TAG = "SchoolMajorRepository";
    private static final String COLLECTION_SCHOOL_MAJORS = "school_majors";
    
    private FirebaseFirestore db;
    private static SchoolMajorRepository instance;
    
    private SchoolMajorRepository() {
        this.db = FirebaseFirestore.getInstance();
    }
    
    public static synchronized SchoolMajorRepository getInstance() {
        if (instance == null) {
            instance = new SchoolMajorRepository();
        }
        return instance;
    }
    
    /**
     * Lấy tất cả school majors từ Firebase
     */
    public void getAllSchoolMajors(OnSchoolMajorsLoadedListener listener) {
        db.collection(COLLECTION_SCHOOL_MAJORS)
            .get()
            .addOnSuccessListener(queryDocumentSnapshots -> {
                List<SchoolMajor> majors = new ArrayList<>();
                
                for (QueryDocumentSnapshot document : queryDocumentSnapshots) {
                    SchoolMajor major = document.toObject(SchoolMajor.class);
                    majors.add(major);
                }
                
                Log.d(TAG, "Đã lấy " + majors.size() + " school majors từ Firebase");
                
                if (listener != null) {
                    listener.onSuccess(majors);
                }
            })
            .addOnFailureListener(e -> {
                Log.e(TAG, "Lỗi khi lấy school majors từ Firebase", e);
                
                if (listener != null) {
                    listener.onFailure(e.getMessage());
                }
            });
    }
    
    /**
     * Lấy school major theo ID
     */
    public void getSchoolMajorById(String majorId, OnSchoolMajorLoadedListener listener) {
        db.collection(COLLECTION_SCHOOL_MAJORS)
            .document(majorId)
            .get()
            .addOnSuccessListener(documentSnapshot -> {
                if (documentSnapshot.exists()) {
                    SchoolMajor major = documentSnapshot.toObject(SchoolMajor.class);
                    
                    if (listener != null) {
                        listener.onSuccess(major);
                    }
                } else {
                    if (listener != null) {
                        listener.onFailure("Không tìm thấy school major");
                    }
                }
            })
            .addOnFailureListener(e -> {
                if (listener != null) {
                    listener.onFailure(e.getMessage());
                }
            });
    }
    
    /**
     * Lấy majors theo school ID
     */
    public void getMajorsBySchoolId(String schoolId, OnSchoolMajorsLoadedListener listener) {
        db.collection(COLLECTION_SCHOOL_MAJORS)
            .whereEqualTo("schoolId", schoolId)
            .get()
            .addOnSuccessListener(queryDocumentSnapshots -> {
                List<SchoolMajor> majors = new ArrayList<>();
                
                for (QueryDocumentSnapshot document : queryDocumentSnapshots) {
                    SchoolMajor major = document.toObject(SchoolMajor.class);
                    majors.add(major);
                }
                
                Log.d(TAG, "Đã lấy " + majors.size() + " majors cho school ID: " + schoolId);
                
                if (listener != null) {
                    listener.onSuccess(majors);
                }
            })
            .addOnFailureListener(e -> {
                Log.e(TAG, "Lỗi khi lấy majors cho school", e);
                
                if (listener != null) {
                    listener.onFailure(e.getMessage());
                }
            });
    }
    
    // Interfaces cho callbacks
    public interface OnSchoolMajorsLoadedListener {
        void onSuccess(List<SchoolMajor> majors);
        void onFailure(String error);
    }
    
    public interface OnSchoolMajorLoadedListener {
        void onSuccess(SchoolMajor major);
        void onFailure(String error);
    }
}

