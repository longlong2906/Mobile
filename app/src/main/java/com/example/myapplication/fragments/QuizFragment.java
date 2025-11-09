package com.example.myapplication.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.QuizActivity;
import com.example.myapplication.R;
import com.google.android.material.button.MaterialButton;

public class QuizFragment extends Fragment {

    private MaterialButton btnStartQuiz;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);

        btnStartQuiz = view.findViewById(R.id.btnStartQuiz);
        
        btnStartQuiz.setOnClickListener(v -> {
            // Navigate to QuizActivity
            Intent intent = new Intent(getActivity(), QuizActivity.class);
            startActivity(intent);
        });

        return view;
    }
}

