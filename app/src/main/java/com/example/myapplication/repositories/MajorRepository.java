package com.example.myapplication.repositories;

import android.util.Log;

import com.example.myapplication.models.Major;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.List;

/**
 * Repository để lấy dữ liệu Major từ Firebase Firestore
 */
public class MajorRepository {
    private static final String TAG = "MajorRepository";
    private static final String COLLECTION_MAJORS = "majors";
    
    private FirebaseFirestore db;
    private static MajorRepository instance;
    
    private MajorRepository() {
        this.db = FirebaseFirestore.getInstance();
    }
    
    public static synchronized MajorRepository getInstance() {
        if (instance == null) {
            instance = new MajorRepository();
        }
        return instance;
    }
    
    /**
     * Lấy tất cả majors từ Firebase
     */
    public void getAllMajors(OnMajorsLoadedListener listener) {
        db.collection(COLLECTION_MAJORS)
            .get()
            .addOnSuccessListener(queryDocumentSnapshots -> {
                List<Major> majors = new ArrayList<>();
                
                for (QueryDocumentSnapshot document : queryDocumentSnapshots) {
                    Major major = document.toObject(Major.class);
                    majors.add(major);
                }
                
                Log.d(TAG, "Đã lấy " + majors.size() + " majors từ Firebase");
                
                if (listener != null) {
                    listener.onSuccess(majors);
                }
            })
            .addOnFailureListener(e -> {
                Log.e(TAG, "Lỗi khi lấy majors từ Firebase", e);
                
                if (listener != null) {
                    listener.onFailure(e.getMessage());
                }
            });
    }
    
    /**
     * Lấy major theo ID
     */
    public void getMajorById(String majorId, OnMajorLoadedListener listener) {
        db.collection(COLLECTION_MAJORS)
            .document(majorId)
            .get()
            .addOnSuccessListener(documentSnapshot -> {
                if (documentSnapshot.exists()) {
                    Major major = documentSnapshot.toObject(Major.class);
                    
                    if (listener != null) {
                        listener.onSuccess(major);
                    }
                } else {
                    if (listener != null) {
                        listener.onFailure("Không tìm thấy major");
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
     * Lấy majors theo category
     */
    public void getMajorsByCategory(String category, OnMajorsLoadedListener listener) {
        if (category == null || category.equals("Tất cả")) {
            getAllMajors(listener);
            return;
        }
        
        db.collection(COLLECTION_MAJORS)
            .whereEqualTo("category", category)
            .get()
            .addOnSuccessListener(queryDocumentSnapshots -> {
                List<Major> majors = new ArrayList<>();
                
                for (QueryDocumentSnapshot document : queryDocumentSnapshots) {
                    Major major = document.toObject(Major.class);
                    majors.add(major);
                }
                
                if (listener != null) {
                    listener.onSuccess(majors);
                }
            })
            .addOnFailureListener(e -> {
                if (listener != null) {
                    listener.onFailure(e.getMessage());
                }
            });
    }
    
    /**
     * Lấy majors theo Holland Type
     */
    public void getMajorsByHollandType(String hollandCode, OnMajorsLoadedListener listener) {
        db.collection(COLLECTION_MAJORS)
            .whereEqualTo("hollandType", hollandCode)
            .get()
            .addOnSuccessListener(queryDocumentSnapshots -> {
                List<Major> majors = new ArrayList<>();
                
                for (QueryDocumentSnapshot document : queryDocumentSnapshots) {
                    Major major = document.toObject(Major.class);
                    majors.add(major);
                }
                
                if (listener != null) {
                    listener.onSuccess(majors);
                }
            })
            .addOnFailureListener(e -> {
                if (listener != null) {
                    listener.onFailure(e.getMessage());
                }
            });
    }
    
    /**
     * Tìm kiếm majors theo tên
     */
    public void searchMajorsByName(String query, OnMajorsLoadedListener listener) {
        getAllMajors(new OnMajorsLoadedListener() {
            @Override
            public void onSuccess(List<Major> majors) {
                List<Major> filteredMajors = new ArrayList<>();
                String lowerQuery = query.toLowerCase();
                
                for (Major major : majors) {
                    if (major.getName().toLowerCase().contains(lowerQuery)) {
                        filteredMajors.add(major);
                    }
                }
                
                if (listener != null) {
                    listener.onSuccess(filteredMajors);
                }
            }
            
            @Override
            public void onFailure(String error) {
                if (listener != null) {
                    listener.onFailure(error);
                }
            }
        });
    }
    
    // Interfaces cho callbacks
    public interface OnMajorsLoadedListener {
        void onSuccess(List<Major> majors);
        void onFailure(String error);
    }
    
    public interface OnMajorLoadedListener {
        void onSuccess(Major major);
        void onFailure(String error);
    }
}

