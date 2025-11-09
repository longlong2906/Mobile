package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.myapplication.adapters.NewQuizPagerAdapter;
import com.example.myapplication.data.QuizPageData;
import com.example.myapplication.fragments.QuizPageFragment;
import com.example.myapplication.models.Question;
import com.example.myapplication.models.QuizAnswer;
import com.example.myapplication.models.QuizPage;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity implements QuizPageFragment.OnAnswersChangedListener {

    private ViewPager2 viewPager;
    private TextView tvProgress;
    private ProgressBar progressBar;
    private MaterialButton btnPrevious, btnNext;
    private ImageButton btnBack;

    private List<QuizPage> pages;
    private QuizAnswer quizAnswer;
    private NewQuizPagerAdapter adapter;
    private int currentPosition = 0;
    private static final int TOTAL_PAGES = 7; // 6 trang quiz + 1 trang summary

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        // Initialize data
        pages = QuizPageData.getQuizPages();
        quizAnswer = new QuizAnswer();

        // Initialize views
        initViews();
        setupViewPager();
        setClickListeners();
        updateProgress();
    }

    private void initViews() {
        viewPager = findViewById(R.id.viewPager);
        tvProgress = findViewById(R.id.tvProgress);
        progressBar = findViewById(R.id.progressBar);
        btnPrevious = findViewById(R.id.btnPrevious);
        btnNext = findViewById(R.id.btnNext);
        btnBack = findViewById(R.id.btnBack);

        progressBar.setMax(TOTAL_PAGES);
    }

    private void setupViewPager() {
        adapter = new NewQuizPagerAdapter(this, pages, quizAnswer);
        adapter.setOnAnswersChangedListener(this);
        viewPager.setAdapter(adapter);
        viewPager.setUserInputEnabled(false); // Disable swipe, use buttons only

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                currentPosition = position;
                updateProgress();
                updateButtons();
            }
        });
    }

    private void setClickListeners() {
        btnBack.setOnClickListener(v -> showExitConfirmDialog());

        btnPrevious.setOnClickListener(v -> {
            if (currentPosition > 0) {
                viewPager.setCurrentItem(currentPosition - 1, true);
            }
        });

        btnNext.setOnClickListener(v -> {
            if (currentPosition < TOTAL_PAGES - 1) {
                // Next page
                viewPager.setCurrentItem(currentPosition + 1, true);
            } else {
                // Last page (summary) - finish quiz
                finishQuiz();
            }
        });
    }

    private void updateProgress() {
        int current = currentPosition + 1;
        int total = TOTAL_PAGES;
        
        if (currentPosition < pages.size()) {
            tvProgress.setText("Trang " + current + "/" + total);
        } else {
            tvProgress.setText("Tổng hợp");
        }
        progressBar.setProgress(current);
    }

    private void updateButtons() {
        // Previous button
        btnPrevious.setEnabled(currentPosition > 0);
        btnPrevious.setAlpha(currentPosition > 0 ? 1.0f : 0.5f);

        // Next button text
        if (currentPosition == TOTAL_PAGES - 1) {
            btnNext.setText("Hoàn thành");
        } else {
            btnNext.setText("Tiếp");
        }
    }

    @Override
    public void onAnswersChanged(QuizAnswer answers) {
        // Cập nhật câu trả lời
        this.quizAnswer = answers;
    }

    private void finishQuiz() {
        // Tính toán kết quả Holland dựa trên các câu đã chọn
        Question.HollandType result = QuizPageData.calculateHollandResult(
                new ArrayList<>(quizAnswer.getSelectedQuestionIds())
        );

        // Navigate to ResultActivity
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("hollandType", result.name());
        intent.putExtra("hollandName", result.getName());
        intent.putExtra("hollandDescription", result.getDescription());
        startActivity(intent);
        finish();
    }

    private void showExitConfirmDialog() {
        new AlertDialog.Builder(this)
                .setTitle("Thoát bài test?")
                .setMessage("Kết quả sẽ không được lưu. Bạn có chắc muốn thoát?")
                .setPositiveButton("Thoát", (dialog, which) -> finish())
                .setNegativeButton("Tiếp tục", null)
                .show();
    }

    @Override
    public void onBackPressed() {
        showExitConfirmDialog();
    }
}



