package com.example.myapplication.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.adapters.HorizontalMajorAdapter;
import com.example.myapplication.data.MajorData;
import com.example.myapplication.models.Major;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.List;

public class HomeFragment extends Fragment {

    private TextView tvWelcome, tvHollandResult;
    private MaterialButton btnStartQuiz;
    private MaterialCardView cardMajors, cardSchools, cardRecommendedMajors, cardChatbot;
    private RecyclerView rvRecommendedMajors;

    private FirebaseAuth mAuth;
    private FirebaseFirestore db;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();

        initViews(view);
        loadUserData();
        setClickListeners();

        return view;
    }

    private void initViews(View view) {
        tvWelcome = view.findViewById(R.id.tvWelcome);
        tvHollandResult = view.findViewById(R.id.tvHollandResult);
        btnStartQuiz = view.findViewById(R.id.btnStartQuiz);
        cardMajors = view.findViewById(R.id.cardMajors);
        cardSchools = view.findViewById(R.id.cardSchools);
        cardChatbot = view.findViewById(R.id.cardChatbot);
        cardRecommendedMajors = view.findViewById(R.id.cardRecommendedMajors);
        rvRecommendedMajors = view.findViewById(R.id.rvRecommendedMajors);

        // Setup horizontal RecyclerView
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        rvRecommendedMajors.setLayoutManager(layoutManager);
    }

    private void loadUserData() {
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            db.collection("users").document(currentUser.getUid())
                    .get()
                    .addOnSuccessListener(documentSnapshot -> {
                        if (documentSnapshot.exists()) {
                            String fullName = documentSnapshot.getString("fullName");
                            String hollandType = documentSnapshot.getString("hollandType");
                            String hollandCode = documentSnapshot.getString("hollandCode");
                            
                            if (fullName != null) {
                                tvWelcome.setText(getString(R.string.home_welcome, fullName));
                            }
                            
                            // Load and display recommended majors if test completed
                            if (hollandType != null && hollandCode != null && !hollandCode.isEmpty()) {
                                loadRecommendedMajors(hollandType, hollandCode);
                            } else {
                                cardRecommendedMajors.setVisibility(View.GONE);
                            }
                        }
                    });
        }
    }

    private void loadRecommendedMajors(String hollandType, String hollandCode) {
        List<Major> recommendedMajors = MajorData.getMajorsByHollandType(hollandCode);
        
        if (recommendedMajors != null && !recommendedMajors.isEmpty()) {
            cardRecommendedMajors.setVisibility(View.VISIBLE);
            tvHollandResult.setText("Nhóm: " + hollandType);
            
            HorizontalMajorAdapter adapter = new HorizontalMajorAdapter(getContext(), recommendedMajors);
            rvRecommendedMajors.setAdapter(adapter);
        } else {
            cardRecommendedMajors.setVisibility(View.GONE);
        }
    }

    private void setClickListeners() {
        btnStartQuiz.setOnClickListener(v -> {
            // Navigate to QuizActivity
            Intent intent = new Intent(getActivity(), com.example.myapplication.QuizActivity.class);
            startActivity(intent);
        });

        cardMajors.setOnClickListener(v -> {
            // Navigate to Majors tab
            Toast.makeText(getContext(), "Chức năng đang phát triển", Toast.LENGTH_SHORT).show();
        });

        cardSchools.setOnClickListener(v -> {
            // Navigate to Schools tab
            Toast.makeText(getContext(), "Chức năng đang phát triển", Toast.LENGTH_SHORT).show();
        });

        cardChatbot.setOnClickListener(v -> {
            // Navigate to ChatbotActivity
            Intent intent = new Intent(getActivity(), com.example.myapplication.ChatbotActivity.class);
            startActivity(intent);
        });
    }
}

