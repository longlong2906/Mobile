package com.example.myapplication.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

import java.util.ArrayList;
import java.util.List;

/**
 * Fragment hiển thị tổng hợp các câu hỏi đã chọn
 */
public class QuizSummaryFragment extends Fragment {

    private static final String ARG_ANSWERS = "answers";

    private QuizAnswer quizAnswer;
    private TextView tvSummaryTitle, tvSelectedCount;
    private RecyclerView rvSelectedQuestions;
    private SelectedQuestionAdapter adapter;

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

        initViews(view);
        setupRecyclerView();
        displaySummary();

        return view;
    }

    private void initViews(View view) {
        tvSummaryTitle = view.findViewById(R.id.tvSummaryTitle);
        tvSelectedCount = view.findViewById(R.id.tvSelectedCount);
        rvSelectedQuestions = view.findViewById(R.id.rvSelectedQuestions);
    }

    private void setupRecyclerView() {
        rvSelectedQuestions.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void displaySummary() {
        if (quizAnswer == null)
            return;

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

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
