package com.example.myapplication.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.fragments.QuizPageFragment;
import com.example.myapplication.fragments.QuizSummaryFragment;
import com.example.myapplication.models.QuizAnswer;
import com.example.myapplication.models.QuizPage;

import java.util.List;

/**
 * Adapter cho ViewPager2 hiển thị 6 trang quiz + 1 trang tổng hợp
 */
public class NewQuizPagerAdapter extends FragmentStateAdapter {

    private final List<QuizPage> pages;
    private final QuizAnswer quizAnswer;
    private QuizPageFragment.OnAnswersChangedListener listener;

    public NewQuizPagerAdapter(@NonNull FragmentActivity fragmentActivity,
                               List<QuizPage> pages,
                               QuizAnswer quizAnswer) {
        super(fragmentActivity);
        this.pages = pages;
        this.quizAnswer = quizAnswer;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // 6 trang đầu là quiz, trang thứ 7 là summary
        if (position < pages.size()) {
            QuizPageFragment fragment = QuizPageFragment.newInstance(pages.get(position), quizAnswer);
            if (listener != null) {
                fragment.setOnAnswersChangedListener(listener);
            }
            return fragment;
        } else {
            // Trang cuối: Summary
            return QuizSummaryFragment.newInstance(quizAnswer);
        }
    }

    @Override
    public int getItemCount() {
        return pages.size() + 1; // 6 trang quiz + 1 trang summary = 7
    }

    public void setOnAnswersChangedListener(QuizPageFragment.OnAnswersChangedListener listener) {
        this.listener = listener;
    }
}
