package com.example.myapplication.fragments;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.adapters.SelectedQuestionAdapter;
import com.example.myapplication.data.QuestionData;
import com.example.myapplication.models.Question;
import com.example.myapplication.models.QuizAnswer;
import com.example.myapplication.services.GeminiService;

import java.util.ArrayList;
import java.util.List;

/**
 * Fragment hiển thị tổng hợp các câu hỏi đã chọn
 */
public class QuizSummaryFragment extends Fragment {

    private static final String ARG_ANSWERS = "answers";

    private QuizAnswer quizAnswer;
    private TextView tvSummaryTitle, tvSelectedCount, tvRecommendationResult;
    private RecyclerView rvSelectedQuestions;
    private Button btnGetRecommendation;
    private SelectedQuestionAdapter adapter;
    private GeminiService geminiService;
    private ProgressDialog progressDialog;

    public static QuizSummaryFragment newInstance(QuizAnswer answers) {
        QuizSummaryFragment fragment = new QuizSummaryFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_ANSWERS, answers);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quiz_summary, container, false);

        if (getArguments() != null) {
            quizAnswer = (QuizAnswer) getArguments().getSerializable(ARG_ANSWERS);
        }

        geminiService = new GeminiService();
        
        initViews(view);
        setupRecyclerView();
        displaySummary();
        setupListeners();

        return view;
    }

    private void initViews(View view) {
        tvSummaryTitle = view.findViewById(R.id.tvSummaryTitle);
        tvSelectedCount = view.findViewById(R.id.tvSelectedCount);
        tvRecommendationResult = view.findViewById(R.id.tvRecommendationResult);
        rvSelectedQuestions = view.findViewById(R.id.rvSelectedQuestions);
        btnGetRecommendation = view.findViewById(R.id.btnGetRecommendation);
    }

    private void setupRecyclerView() {
        rvSelectedQuestions.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void displaySummary() {
        if (quizAnswer == null) return;

        // Hiển thị số câu đã chọn
        int selectedCount = quizAnswer.getSelectedCount();
        tvSelectedCount.setText("Bạn đã chọn " + selectedCount + " câu");

        // Lấy danh sách các câu hỏi đã chọn
        List<Question> selectedQuestions = getSelectedQuestions();
        
        // Hiển thị danh sách
        adapter = new SelectedQuestionAdapter(selectedQuestions);
        rvSelectedQuestions.setAdapter(adapter);
    }

    private List<Question> getSelectedQuestions() {
        List<Question> allQuestions = QuestionData.getQuestions();
        List<Question> selectedQuestions = new ArrayList<>();

        for (Integer questionId : quizAnswer.getSelectedQuestionIds()) {
            for (Question question : allQuestions) {
                if (question.getId() == questionId) {
                    selectedQuestions.add(question);
                    break;
                }
            }
        }

        return selectedQuestions;
    }

    public QuizAnswer getQuizAnswer() {
        return quizAnswer;
    }
    
    private void setupListeners() {
        btnGetRecommendation.setOnClickListener(v -> getCareerRecommendation());
    }
    
    /**
     * Gọi Gemini API để lấy gợi ý nghề nghiệp
     */
    private void getCareerRecommendation() {
        List<Question> selectedQuestions = getSelectedQuestions();
        
        if (selectedQuestions.isEmpty()) {
            Toast.makeText(getContext(), "Vui lòng chọn ít nhất một câu hỏi", Toast.LENGTH_SHORT).show();
            return;
        }
        
        // Hiển thị loading
        showLoading("Đang phân tích câu trả lời của bạn...");
        
        // Gọi Gemini API
        geminiService.getCareerRecommendation(selectedQuestions, new GeminiService.GeminiCallback() {
            @Override
            public void onSuccess(String response) {
                hideLoading();
                displayRecommendation(response);
            }
            
            @Override
            public void onError(String error) {
                hideLoading();
                Toast.makeText(getContext(), error, Toast.LENGTH_LONG).show();
            }
        });
    }
    
    /**
     * Hiển thị kết quả gợi ý từ Gemini
     */
    private void displayRecommendation(String recommendation) {
        tvRecommendationResult.setVisibility(View.VISIBLE);
        tvRecommendationResult.setText(recommendation);
        
        // Ẩn nút sau khi đã lấy kết quả
        btnGetRecommendation.setVisibility(View.GONE);
        
        Toast.makeText(getContext(), "Đã nhận được gợi ý nghề nghiệp!", Toast.LENGTH_SHORT).show();
    }
    
    private void showLoading(String message) {
        if (getContext() == null) return;
        
        progressDialog = new ProgressDialog(getContext());
        progressDialog.setMessage(message);
        progressDialog.setCancelable(false);
        progressDialog.show();
    }
    
    private void hideLoading() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (geminiService != null) {
            geminiService.shutdown();
        }
        hideLoading();
    }
}
