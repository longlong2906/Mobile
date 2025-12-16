package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.adapters.RecommendedMajorAdapter;
import com.example.myapplication.models.Major;
import com.example.myapplication.models.Question;
import com.example.myapplication.repositories.MajorRepository;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    private TextView tvHollandType, tvDescription;
    private RecyclerView rvMajors;
    private MaterialButton btnRetake, btnFinish;

    private FirebaseAuth mAuth;
    private FirebaseFirestore db;

    private String hollandType;
    private String hollandName;
    private String hollandDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();

        // Get data from intent
        hollandType = getIntent().getStringExtra("hollandType");
        hollandName = getIntent().getStringExtra("hollandName");
        hollandDescription = getIntent().getStringExtra("hollandDescription");

        initViews();
        displayResults();
        setClickListeners();
    }

    private void initViews() {
        tvHollandType = findViewById(R.id.tvHollandType);
        tvDescription = findViewById(R.id.tvDescription);
        rvMajors = findViewById(R.id.rvMajors);
        btnRetake = findViewById(R.id.btnRetake);
        btnFinish = findViewById(R.id.btnFinish);

        // Setup RecyclerView
        rvMajors.setLayoutManager(new LinearLayoutManager(this));
    }

    private void displayResults() {
        // Display Holland type
        tvHollandType.setText(hollandName);
        tvDescription.setText(hollandDescription);

        // Get suggested majors based on Holland type
        Question.HollandType type = Question.HollandType.valueOf(hollandType);
        String hollandCode = type.getCode(); // Get code (R, I, A, S, E, C)
        
        // Lấy dữ liệu từ Firebase
        MajorRepository.getInstance().getMajorsByHollandType(hollandCode, new MajorRepository.OnMajorsLoadedListener() {
            @Override
            public void onSuccess(List<Major> recommendedMajors) {
                // Display majors in RecyclerView with detailed cards
                RecommendedMajorAdapter adapter = new RecommendedMajorAdapter(ResultActivity.this, recommendedMajors);
                rvMajors.setLayoutManager(new LinearLayoutManager(ResultActivity.this));
                rvMajors.setAdapter(adapter);
                
                // Save result sau khi đã load được majors
                saveResultToFirestore(recommendedMajors);
            }
            
            @Override
            public void onFailure(String error) {
                Toast.makeText(ResultActivity.this, "Không thể tải ngành gợi ý: " + error, Toast.LENGTH_SHORT).show();
                // Vẫn save result nhưng không có majors
                saveResultToFirestore(new ArrayList<>());
            }
        });
    }

    private void saveResultToFirestore(List<Major> recommendedMajors) {
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser == null) {
            return;
        }

        // Get Holland type info
        Question.HollandType type = Question.HollandType.valueOf(hollandType);
        String hollandCode = type.getCode();
        
        // Convert to major names list
        String[] majorNames = new String[recommendedMajors.size()];
        for (int i = 0; i < recommendedMajors.size(); i++) {
            majorNames[i] = recommendedMajors.get(i).getName();
        }

        // Prepare data to save
        Map<String, Object> updates = new HashMap<>();
        updates.put("hollandType", hollandName);
        updates.put("hollandCode", hollandCode);
        updates.put("suggestedMajors", Arrays.asList(majorNames));
        updates.put("testCompletedAt", System.currentTimeMillis());

        // Update user document in Firestore
        db.collection("users").document(currentUser.getUid())
                .update(updates)
                .addOnSuccessListener(aVoid -> {
                    Toast.makeText(ResultActivity.this, 
                            "Kết quả đã được lưu!", 
                            Toast.LENGTH_SHORT).show();
                })
                .addOnFailureListener(e -> {
                    Toast.makeText(ResultActivity.this, 
                            "Lưu kết quả thất bại: " + e.getMessage(), 
                            Toast.LENGTH_SHORT).show();
                });
    }

    private void setClickListeners() {
        btnRetake.setOnClickListener(v -> {
            // Go back to QuizActivity
            Intent intent = new Intent(ResultActivity.this, QuizActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });

        btnFinish.setOnClickListener(v -> {
            // Go back to MainActivity
            Intent intent = new Intent(ResultActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });
    }

    @Override
    public void onBackPressed() {
        // Go to MainActivity instead of back
        Intent intent = new Intent(ResultActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}


