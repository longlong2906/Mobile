package com.example.myapplication.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.models.Question;
import com.google.android.material.card.MaterialCardView;

public class QuestionFragment extends Fragment {

    private static final String ARG_QUESTION = "question";
    private static final String ARG_POSITION = "position";
    private static final String ARG_ANSWER = "answer";

    private Question question;
    private int position;
    private int currentAnswer = 0;

    private TextView tvQuestionNumber, tvQuestionText;
    private MaterialCardView cardRating1, cardRating2, cardRating3, cardRating4, cardRating5;

    private OnAnswerSelectedListener listener;

    public interface OnAnswerSelectedListener {
        void onAnswerSelected(int questionPosition, int rating);
    }

    public static QuestionFragment newInstance(Question question, int position, int savedAnswer) {
        QuestionFragment fragment = new QuestionFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_QUESTION, question.getHollandType());
        args.putString("questionText", question.getQuestionText());
        args.putInt("questionId", question.getId());
        args.putInt(ARG_POSITION, position);
        args.putInt(ARG_ANSWER, savedAnswer);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_question, container, false);

        // Get arguments
        if (getArguments() != null) {
            position = getArguments().getInt(ARG_POSITION);
            currentAnswer = getArguments().getInt(ARG_ANSWER, 0);
            
            // Reconstruct question from arguments
            String questionText = getArguments().getString("questionText");
            int questionId = getArguments().getInt("questionId");
            Question.HollandType type = (Question.HollandType) getArguments().getSerializable(ARG_QUESTION);
            question = new Question(questionId, questionText, type);
        }

        initViews(view);
        updateUI();
        setClickListeners();

        return view;
    }

    private void initViews(View view) {
        tvQuestionNumber = view.findViewById(R.id.tvQuestionNumber);
        tvQuestionText = view.findViewById(R.id.tvQuestionText);
        cardRating1 = view.findViewById(R.id.cardRating1);
        cardRating2 = view.findViewById(R.id.cardRating2);
        cardRating3 = view.findViewById(R.id.cardRating3);
        cardRating4 = view.findViewById(R.id.cardRating4);
        cardRating5 = view.findViewById(R.id.cardRating5);
    }

    private void updateUI() {
        tvQuestionNumber.setText("Câu " + (position + 1));
        tvQuestionText.setText(question.getQuestionText());
        
        // Highlight selected answer
        highlightSelectedCard(currentAnswer);
    }

    private void setClickListeners() {
        cardRating5.setOnClickListener(v -> selectRating(5));
        cardRating4.setOnClickListener(v -> selectRating(4));
        cardRating3.setOnClickListener(v -> selectRating(3));
        cardRating2.setOnClickListener(v -> selectRating(2));
        cardRating1.setOnClickListener(v -> selectRating(1));
    }

    private void selectRating(int rating) {
        currentAnswer = rating;
        highlightSelectedCard(rating);
        
        if (listener != null) {
            listener.onAnswerSelected(position, rating);
        }
    }

    private void highlightSelectedCard(int rating) {
        // Reset all cards
        resetCard(cardRating1);
        resetCard(cardRating2);
        resetCard(cardRating3);
        resetCard(cardRating4);
        resetCard(cardRating5);

        // Highlight selected card
        MaterialCardView selectedCard = null;
        switch (rating) {
            case 5: selectedCard = cardRating5; break;
            case 4: selectedCard = cardRating4; break;
            case 3: selectedCard = cardRating3; break;
            case 2: selectedCard = cardRating2; break;
            case 1: selectedCard = cardRating1; break;
        }

        if (selectedCard != null && getContext() != null) {
            selectedCard.setStrokeColor(ContextCompat.getColor(getContext(), R.color.black));
            selectedCard.setCardBackgroundColor(ContextCompat.getColor(getContext(), R.color.white));
        }
    }

    private void resetCard(MaterialCardView card) {
        if (getContext() != null) {
            card.setStrokeColor(android.graphics.Color.TRANSPARENT);
            card.setCardBackgroundColor(ContextCompat.getColor(getContext(), R.color.white));
        }
    }

    public void setOnAnswerSelectedListener(OnAnswerSelectedListener listener) {
        this.listener = listener;
    }

    public int getCurrentAnswer() {
        return currentAnswer;
    }
}

