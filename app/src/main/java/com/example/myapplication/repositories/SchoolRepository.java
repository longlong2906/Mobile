package com.example.myapplication.repositories;

import android.util.Log;

import com.example.myapplication.models.School;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.List;

/**
 * Repository để lấy dữ liệu School từ Firebase Firestore
 */
public class SchoolRepository {
    private static final String TAG = "SchoolRepository";
    private static final String COLLECTION_SCHOOLS = "schools";
    
    private FirebaseFirestore db;
    private static SchoolRepository instance;
    
    private SchoolRepository() {
        this.db = FirebaseFirestore.getInstance();
    }
    
    public static synchronized SchoolRepository getInstance() {
        if (instance == null) {
            instance = new SchoolRepository();
        }
        return instance;
    }
    
    /**
     * Lấy tất cả schools từ Firebase
     */
    public void getAllSchools(OnSchoolsLoadedListener listener) {
        db.collection(COLLECTION_SCHOOLS)
            .get()
            .addOnSuccessListener(queryDocumentSnapshots -> {
                List<School> schools = new ArrayList<>();
                
                for (QueryDocumentSnapshot document : queryDocumentSnapshots) {
                    School school = document.toObject(School.class);
                    schools.add(school);
                }
                
                Log.d(TAG, "Đã lấy " + schools.size() + " schools từ Firebase");
                
                if (listener != null) {
                    listener.onSuccess(schools);
                }
            })
            .addOnFailureListener(e -> {
                Log.e(TAG, "Lỗi khi lấy schools từ Firebase", e);
                
                if (listener != null) {
                    listener.onFailure(e.getMessage());
                }
            });
    }
    
    /**
     * Lấy school theo ID
     */
    public void getSchoolById(String schoolId, OnSchoolLoadedListener listener) {
        db.collection(COLLECTION_SCHOOLS)
            .document(schoolId)
            .get()
            .addOnSuccessListener(documentSnapshot -> {
                if (documentSnapshot.exists()) {
                    School school = documentSnapshot.toObject(School.class);
                    
                    if (listener != null) {
                        listener.onSuccess(school);
                    }
                } else {
                    if (listener != null) {
                        listener.onFailure("Không tìm thấy school");
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
     * Lấy schools theo region
     */
    public void getSchoolsByRegion(String region, OnSchoolsLoadedListener listener) {
        if (region == null || region.equals("Tất cả")) {
            getAllSchools(listener);
            return;
        }
        
        db.collection(COLLECTION_SCHOOLS)
            .whereEqualTo("region", region)
            .get()
            .addOnSuccessListener(queryDocumentSnapshots -> {
                List<School> schools = new ArrayList<>();
                
                for (QueryDocumentSnapshot document : queryDocumentSnapshots) {
                    School school = document.toObject(School.class);
                    schools.add(school);
                }
                
                if (listener != null) {
                    listener.onSuccess(schools);
                }
            })
            .addOnFailureListener(e -> {
                if (listener != null) {
                    listener.onFailure(e.getMessage());
                }
            });
    }
    
    /**
     * Lấy schools theo type
     */
    public void getSchoolsByType(String type, OnSchoolsLoadedListener listener) {
        if (type == null || type.equals("Tất cả")) {
            getAllSchools(listener);
            return;
        }
        
        db.collection(COLLECTION_SCHOOLS)
            .whereEqualTo("type", type)
            .get()
            .addOnSuccessListener(queryDocumentSnapshots -> {
                List<School> schools = new ArrayList<>();
                
                for (QueryDocumentSnapshot document : queryDocumentSnapshots) {
                    School school = document.toObject(School.class);
                    schools.add(school);
                }
                
                if (listener != null) {
                    listener.onSuccess(schools);
                }
            })
            .addOnFailureListener(e -> {
                if (listener != null) {
                    listener.onFailure(e.getMessage());
                }
            });
    }
    
    /**
     * Lấy schools theo region và type
     */
    public void getSchoolsByRegionAndType(String region, String type, OnSchoolsLoadedListener listener) {
        // Nếu cả 2 đều "Tất cả"
        if ((region == null || region.equals("Tất cả")) && (type == null || type.equals("Tất cả"))) {
            getAllSchools(listener);
            return;
        }
        
        // Nếu chỉ filter region
        if (type == null || type.equals("Tất cả")) {
            getSchoolsByRegion(region, listener);
            return;
        }
        
        // Nếu chỉ filter type
        if (region == null || region.equals("Tất cả")) {
            getSchoolsByType(type, listener);
            return;
        }
        
        // Filter cả 2
        db.collection(COLLECTION_SCHOOLS)
            .whereEqualTo("region", region)
            .whereEqualTo("type", type)
            .get()
            .addOnSuccessListener(queryDocumentSnapshots -> {
                List<School> schools = new ArrayList<>();
                
                for (QueryDocumentSnapshot document : queryDocumentSnapshots) {
                    School school = document.toObject(School.class);
                    schools.add(school);
                }
                
                if (listener != null) {
                    listener.onSuccess(schools);
                }
            })
            .addOnFailureListener(e -> {
                if (listener != null) {
                    listener.onFailure(e.getMessage());
                }
            });
    }
    
    /**
     * Tìm kiếm schools theo tên
     */
    public void searchSchoolsByName(String query, OnSchoolsLoadedListener listener) {
        getAllSchools(new OnSchoolsLoadedListener() {
            @Override
            public void onSuccess(List<School> schools) {
                List<School> filteredSchools = new ArrayList<>();
                String lowerQuery = query.toLowerCase();
                
                for (School school : schools) {
                    if (school.getName().toLowerCase().contains(lowerQuery) ||
                        school.getShortName().toLowerCase().contains(lowerQuery)) {
                        filteredSchools.add(school);
                    }
                }
                
                if (listener != null) {
                    listener.onSuccess(filteredSchools);
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
    public interface OnSchoolsLoadedListener {
        void onSuccess(List<School> schools);
        void onFailure(String error);
    }
    
    public interface OnSchoolLoadedListener {
        void onSuccess(School school);
        void onFailure(String error);
    }
}

