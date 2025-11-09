package com.example.myapplication.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.models.Question;
import com.example.myapplication.models.QuizAnswer;
import com.example.myapplication.models.QuizPage;

/**
 * Fragment hiển thị một trang quiz với 5 câu hỏi dạng checkbox
 */
public class QuizPageFragment extends Fragment {

    private static final String ARG_PAGE = "page";
    private static final String ARG_ANSWERS = "answers";

    private QuizPage page;
    private QuizAnswer quizAnswer;
    
    private TextView tvPageTitle;
    private CheckBox[] checkBoxes = new CheckBox[5];
    private TextView[] tvQuestions = new TextView[5];
    
    private OnAnswersChangedListener listener;

    public interface OnAnswersChangedListener {
        void onAnswersChanged(QuizAnswer answers);
    }

    public static QuizPageFragment newInstance(QuizPage page, QuizAnswer answers) {
        QuizPageFragment fragment = new QuizPageFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PAGE, page);
        args.putSerializable(ARG_ANSWERS, answers);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, 
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quiz_page, container, false);

        if (getArguments() != null) {
            page = (QuizPage) getArguments().getSerializable(ARG_PAGE);
            quizAnswer = (QuizAnswer) getArguments().getSerializable(ARG_ANSWERS);
        }

        initViews(view);
        setupQuestions();
        
        return view;
    }

    private void initViews(View view) {
        tvPageTitle = view.findViewById(R.id.tvPageTitle);
        
        // Khởi tạo các checkbox và TextView
        checkBoxes[0] = view.findViewById(R.id.cbQuestion1);
        checkBoxes[1] = view.findViewById(R.id.cbQuestion2);
        checkBoxes[2] = view.findViewById(R.id.cbQuestion3);
        checkBoxes[3] = view.findViewById(R.id.cbQuestion4);
        checkBoxes[4] = view.findViewById(R.id.cbQuestion5);
        
        tvQuestions[0] = view.findViewById(R.id.tvQuestion1);
        tvQuestions[1] = view.findViewById(R.id.tvQuestion2);
        tvQuestions[2] = view.findViewById(R.id.tvQuestion3);
        tvQuestions[3] = view.findViewById(R.id.tvQuestion4);
        tvQuestions[4] = view.findViewById(R.id.tvQuestion5);
    }

    private void setupQuestions() {
        if (page == null || quizAnswer == null) return;
        
        tvPageTitle.setText(page.getTitle());
        
        // Hiển thị 5 câu hỏi
        for (int i = 0; i < page.getQuestions().size() && i < 5; i++) {
            final Question question = page.getQuestions().get(i);
            
            tvQuestions[i].setText((i + 1) + ". " + question.getQuestionText());
            checkBoxes[i].setChecked(quizAnswer.isQuestionSelected(question.getId()));
            
            // Listener cho checkbox
            final int index = i;
            checkBoxes[i].setOnCheckedChangeListener((buttonView, isChecked) -> {
                if (isChecked) {
                    quizAnswer.selectQuestion(question.getId());
                } else {
                    quizAnswer.deselectQuestion(question.getId());
                }
                
                if (listener != null) {
                    listener.onAnswersChanged(quizAnswer);
                }
            });
            
            checkBoxes[i].setVisibility(View.VISIBLE);
            tvQuestions[i].setVisibility(View.VISIBLE);
        }
        
        // Ẩn các câu hỏi không dùng (nếu có ít hơn 5 câu)
        for (int i = page.getQuestions().size(); i < 5; i++) {
            checkBoxes[i].setVisibility(View.GONE);
            tvQuestions[i].setVisibility(View.GONE);
        }
    }

    public void setOnAnswersChangedListener(OnAnswersChangedListener listener) {
        this.listener = listener;
    }

    public QuizAnswer getQuizAnswer() {
        return quizAnswer;
    }
}
