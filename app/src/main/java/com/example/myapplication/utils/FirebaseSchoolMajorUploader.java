package com.example.myapplication.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.myapplication.data.SchoolData;
import com.example.myapplication.models.SchoolMajor;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Utility class để upload dữ liệu SchoolMajor (ngành đào tạo của trường) lên Firebase
 */
public class FirebaseSchoolMajorUploader {
    private static final String TAG = "FirebaseSchoolMajorUploader";
    private static final String COLLECTION_SCHOOL_MAJORS = "school_majors";
    
    /**
     * Upload tất cả school majors từ SchoolData lên Firebase
     * Lấy majors của tất cả schools và upload
     */
    public static void uploadSchoolMajorsToFirebase(Context context) {
        Log.d(TAG, "📋 Khởi tạo Firebase...");
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        
        Log.d(TAG, "📋 Lấy dữ liệu School Majors từ SchoolData...");
        
        // Lấy majors của tất cả schools
        List<SchoolMajor> allMajors = new ArrayList<>();
        
        // School IDs từ SchoolData
        String[] schoolIds = {"1", "3", "11"}; // Các school có detailed major data
        
        for (String schoolId : schoolIds) {
            List<SchoolMajor> majors = SchoolData.getMajorsForSchool(schoolId);
            if (majors != null && !majors.isEmpty()) {
                allMajors.addAll(majors);
                Log.d(TAG, "  └─ School ID " + schoolId + ": " + majors.size() + " majors");
            }
        }
        
        if (allMajors.isEmpty()) {
            Log.e(TAG, "❌ Không có dữ liệu school majors để upload");
            Toast.makeText(context, "❌ Không có dữ liệu school majors", Toast.LENGTH_LONG).show();
            return;
        }
        
        final int totalCount = allMajors.size();
        final AtomicInteger successCount = new AtomicInteger(0);
        final AtomicInteger failCount = new AtomicInteger(0);
        
        Log.d(TAG, "🚀 Bắt đầu upload " + totalCount + " school majors lên Firebase...");
        Log.d(TAG, "📍 Collection: " + COLLECTION_SCHOOL_MAJORS);
        Toast.makeText(context, "🚀 Đang upload " + totalCount + " school majors lên Firebase...", Toast.LENGTH_LONG).show();
        
        for (int i = 0; i < allMajors.size(); i++) {
            SchoolMajor major = allMajors.get(i);
            
            // Tạo final reference để tránh lambda closure issue
            final String majorName = major.getName();
            final String majorId = major.getId();
            final String schoolId = major.getSchoolId();
            final int index = i + 1;
            
            Log.d(TAG, "📤 [" + index + "/" + totalCount + "] Đang upload: " + majorName + " (School: " + schoolId + ", ID: " + majorId + ")");
            
            // Log chi tiết
            Log.d(TAG, "  └─ Code: " + major.getCode());
            if (major.getSpecializations() != null) {
                Log.d(TAG, "  └─ Specializations: " + major.getSpecializations().size());
            }
            
            db.collection(COLLECTION_SCHOOL_MAJORS)
                .document(majorId)
                .set(major)
                .addOnSuccessListener(aVoid -> {
                    int success = successCount.incrementAndGet();
                    Log.d(TAG, "✅ [" + success + "/" + totalCount + "] Upload thành công: " + majorName);
                    
                    // Kiểm tra xem đã upload hết chưa
                    checkUploadComplete(context, totalCount, successCount.get(), failCount.get());
                })
                .addOnFailureListener(e -> {
                    int fail = failCount.incrementAndGet();
                    Log.e(TAG, "❌ [" + fail + " failed] Upload thất bại: " + majorName);
                    Log.e(TAG, "  └─ Error type: " + e.getClass().getSimpleName());
                    Log.e(TAG, "  └─ Error message: " + e.getMessage());
                    e.printStackTrace();
                    
                    // Kiểm tra xem đã upload hết chưa
                    checkUploadComplete(context, totalCount, successCount.get(), failCount.get());
                });
        }
        
        Log.d(TAG, "📤 Đã gửi tất cả " + totalCount + " requests upload. Đợi response...");
    }
    
    private static void checkUploadComplete(Context context, int total, int success, int fail) {
        if (success + fail == total) {
            String message = "✅ Upload School Majors hoàn tất!\n" +
                           "✓ Thành công: " + success + "\n" +
                           "✗ Thất bại: " + fail;
            
            Log.d(TAG, "==================================================");
            Log.d(TAG, message);
            Log.d(TAG, "==================================================");
            
            if (context != null) {
                Toast.makeText(context, message, Toast.LENGTH_LONG).show();
            }
        }
    }
}

