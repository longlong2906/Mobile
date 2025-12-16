package com.example.myapplication.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.myapplication.data.MajorData;
import com.example.myapplication.models.Major;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Utility class để upload dữ liệu từ MajorData.java lên Firebase Firestore
 * Gọi uploadMajorsToFirebase() một lần để đẩy dữ liệu lên
 */
public class FirebaseDataUploader {
    private static final String TAG = "FirebaseDataUploader";
    private static final String COLLECTION_MAJORS = "majors";
    
    /**
     * Upload tất cả majors từ MajorData lên Firebase
     * Gọi method này một lần (ví dụ trong MainActivity onCreate với flag debug)
     */
    public static void uploadMajorsToFirebase(Context context) {
        Log.d(TAG, "📋 Khởi tạo Firebase...");
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        
        Log.d(TAG, "📋 Lấy dữ liệu từ MajorData...");
        List<Major> majors = MajorData.getSampleMajors();
        
        if (majors == null || majors.isEmpty()) {
            Log.e(TAG, "❌ Không có dữ liệu để upload");
            Toast.makeText(context, "❌ Không có dữ liệu để upload", Toast.LENGTH_LONG).show();
            return;
        }
        
        final int totalCount = majors.size();
        final AtomicInteger successCount = new AtomicInteger(0);
        final AtomicInteger failCount = new AtomicInteger(0);
        
        Log.d(TAG, "🚀 Bắt đầu upload " + totalCount + " majors lên Firebase...");
        Log.d(TAG, "📍 Collection: " + COLLECTION_MAJORS);
        Toast.makeText(context, "🚀 Đang upload " + totalCount + " majors lên Firebase...", Toast.LENGTH_LONG).show();
        
        for (int i = 0; i < majors.size(); i++) {
            Major major = majors.get(i);
            
            // Tạo final reference để tránh lambda closure issue
            final String majorName = major.getName();
            final String majorId = major.getId();
            final int index = i + 1;
            
            Log.d(TAG, "📤 [" + index + "/" + totalCount + "] Đang upload: " + majorName + " (ID: " + majorId + ")");
            
            // Log chi tiết về major
            Log.d(TAG, "  └─ Category: " + major.getCategory());
            Log.d(TAG, "  └─ Holland Type: " + major.getHollandType());
            
            db.collection(COLLECTION_MAJORS)
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
            String message = "✅ Upload hoàn tất!\n" +
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

