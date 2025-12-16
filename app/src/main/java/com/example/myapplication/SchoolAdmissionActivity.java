package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.models.School;
import com.google.android.material.appbar.MaterialToolbar;

import java.util.Map;

public class SchoolAdmissionActivity extends AppCompatActivity {

    private School school;
    private MaterialToolbar toolbar;
    private TextView tvSchoolName;
    private TextView tvAdmissionPolicy, tvAdmissionQuota;
    private LinearLayout layoutAdmissionMethods, layoutBenchmarkScores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_admission);

        // Get school data
        school = (School) getIntent().getSerializableExtra("school");
        if (school == null) {
            finish();
            return;
        }

        initViews();
        setupToolbar();
        loadData();
    }

    private void initViews() {
        toolbar = findViewById(R.id.toolbar);
        tvSchoolName = findViewById(R.id.tvSchoolName);
        tvAdmissionPolicy = findViewById(R.id.tvAdmissionPolicy);
        tvAdmissionQuota = findViewById(R.id.tvAdmissionQuota);
        layoutAdmissionMethods = findViewById(R.id.layoutAdmissionMethods);
        layoutBenchmarkScores = findViewById(R.id.layoutBenchmarkScores);
    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        toolbar.setNavigationOnClickListener(v -> onBackPressed());
    }

    private void loadData() {
        // Quy chế tuyển sinh
        if (school.getAdmissionPolicy() != null) {
            tvAdmissionPolicy.setText(school.getAdmissionPolicy());
        } else {
            tvAdmissionPolicy.setText("Chưa có thông tin");
        }

        // Chỉ tiêu tuyển sinh
        if (school.getAdmissionQuota() != null) {
            tvAdmissionQuota.setText(school.getAdmissionQuota());
        } else {
            tvAdmissionQuota.setText("Chưa có thông tin");
        }

        // Phương thức tuyển sinh
        layoutAdmissionMethods.removeAllViews();
        if (school.getAdmissionMethods() != null && !school.getAdmissionMethods().isEmpty()) {
            for (String method : school.getAdmissionMethods()) {
                TextView tv = new TextView(this);
                tv.setText("• " + method);
                tv.setTextSize(15);
                tv.setTextColor(getResources().getColor(android.R.color.black));
                tv.setPadding(0, 8, 0, 8);
                layoutAdmissionMethods.addView(tv);
            }
        } else {
            TextView tv = new TextView(this);
            tv.setText("Chưa có thông tin");
            tv.setTextColor(getResources().getColor(android.R.color.darker_gray));
            layoutAdmissionMethods.addView(tv);
        }

        // Điểm chuẩn các ngành
        layoutBenchmarkScores.removeAllViews();
        if (school.getBenchmarkScores() != null && !school.getBenchmarkScores().isEmpty()) {
            for (Map.Entry<String, Double> entry : school.getBenchmarkScores().entrySet()) {
                LinearLayout row = new LinearLayout(this);
                row.setOrientation(LinearLayout.HORIZONTAL);
                row.setPadding(0, 8, 0, 8);
                
                TextView tvMajor = new TextView(this);
                tvMajor.setText(entry.getKey());
                tvMajor.setTextSize(15);
                tvMajor.setTextColor(getResources().getColor(android.R.color.black));
                tvMajor.setLayoutParams(new LinearLayout.LayoutParams(0, 
                    LinearLayout.LayoutParams.WRAP_CONTENT, 1));
                
                TextView tvScore = new TextView(this);
                tvScore.setText(String.format("%.1f điểm", entry.getValue()));
                tvScore.setTextSize(15);
                tvScore.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                tvScore.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
                
                row.addView(tvMajor);
                row.addView(tvScore);
                layoutBenchmarkScores.addView(row);
            }
        } else {
            TextView tv = new TextView(this);
            tv.setText("Chưa có thông tin");
            tv.setTextColor(getResources().getColor(android.R.color.darker_gray));
            layoutBenchmarkScores.addView(tv);
        }
    }
}




