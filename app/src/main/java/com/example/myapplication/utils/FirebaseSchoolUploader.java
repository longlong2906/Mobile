package com.example.myapplication.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.myapplication.data.SchoolData;
import com.example.myapplication.models.School;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Utility class để upload dữ liệu từ SchoolData.java lên Firebase Firestore
 */
public class FirebaseSchoolUploader {
    private static final String TAG = "FirebaseSchoolUploader";
    private static final String COLLECTION_SCHOOLS = "schools";
    
    /**
     * Upload tất cả schools từ SchoolData lên Firebase
     */
    public static void uploadSchoolsToFirebase(Context context) {
        Log.d(TAG, "📋 Khởi tạo Firebase...");
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        
        Log.d(TAG, "📋 Lấy dữ liệu từ SchoolData...");
        List<School> schools = SchoolData.getSampleSchools();
        
        if (schools == null || schools.isEmpty()) {
            Log.e(TAG, "❌ Không có dữ liệu để upload");
            Toast.makeText(context, "❌ Không có dữ liệu schools để upload", Toast.LENGTH_LONG).show();
            return;
        }
        
        final int totalCount = schools.size();
        final AtomicInteger successCount = new AtomicInteger(0);
        final AtomicInteger failCount = new AtomicInteger(0);
        
        Log.d(TAG, "🚀 Bắt đầu upload " + totalCount + " schools lên Firebase...");
        Log.d(TAG, "📍 Collection: " + COLLECTION_SCHOOLS);
        Toast.makeText(context, "🚀 Đang upload " + totalCount + " schools lên Firebase...", Toast.LENGTH_LONG).show();
        
        for (int i = 0; i < schools.size(); i++) {
            School school = schools.get(i);
            
            // Tạo final reference để tránh lambda closure issue
            final String schoolName = school.getName();
            final String schoolId = school.getId();
            final int index = i + 1;
            
            Log.d(TAG, "📤 [" + index + "/" + totalCount + "] Đang upload: " + schoolName + " (ID: " + schoolId + ")");
            
            // Log chi tiết về school
            Log.d(TAG, "  └─ Region: " + school.getRegion());
            Log.d(TAG, "  └─ Type: " + school.getType());
            
            db.collection(COLLECTION_SCHOOLS)
                .document(schoolId)
                .set(school)
                .addOnSuccessListener(aVoid -> {
                    int success = successCount.incrementAndGet();
                    Log.d(TAG, "✅ [" + success + "/" + totalCount + "] Upload thành công: " + schoolName);
                    
                    // Kiểm tra xem đã upload hết chưa
                    checkUploadComplete(context, totalCount, successCount.get(), failCount.get());
                })
                .addOnFailureListener(e -> {
                    int fail = failCount.incrementAndGet();
                    Log.e(TAG, "❌ [" + fail + " failed] Upload thất bại: " + schoolName);
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
            String message = "✅ Upload Schools hoàn tất!\n" +
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

