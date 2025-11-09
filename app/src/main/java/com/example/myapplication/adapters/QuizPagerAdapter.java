package com.example.myapplication.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.fragments.QuestionFragment;
import com.example.myapplication.models.Question;

import java.util.List;
import java.util.Map;

public class QuizPagerAdapter extends FragmentStateAdapter {

    private final List<Question> questions;
    private final Map<Integer, Integer> answers;
    private QuestionFragment.OnAnswerSelectedListener listener;

    public QuizPagerAdapter(@NonNull FragmentActivity fragmentActivity, 
                           List<Question> questions,
                           Map<Integer, Integer> answers) {
        super(fragmentActivity);
        this.questions = questions;
        this.answers = answers;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Question question = questions.get(position);
        int savedAnswer = answers.getOrDefault(position, 0);
        QuestionFragment fragment = QuestionFragment.newInstance(question, position, savedAnswer);
        
        if (listener != null) {
            fragment.setOnAnswerSelectedListener(listener);
        }
        
        return fragment;
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }

    public void setOnAnswerSelectedListener(QuestionFragment.OnAnswerSelectedListener listener) {
        this.listener = listener;
    }
}



