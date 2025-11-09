package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.models.Major;
import com.google.android.material.chip.Chip;

import java.util.List;

public class MajorDetailActivity extends AppCompatActivity {

    private TextView tvMajorName, tvDescription, tvCareerPath, tvSkills, tvSalary, tvMarketDemand, tvSchools;
    private Chip chipCategory;
    private ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_major_detail);

        initViews();
        loadData();
        setClickListeners();
    }

    private void initViews() {
        tvMajorName = findViewById(R.id.tvMajorName);
        chipCategory = findViewById(R.id.chipCategory);
        tvDescription = findViewById(R.id.tvDescription);
        tvCareerPath = findViewById(R.id.tvCareerPath);
        tvSkills = findViewById(R.id.tvSkills);
        tvSalary = findViewById(R.id.tvSalary);
        tvMarketDemand = findViewById(R.id.tvMarketDemand);
        tvSchools = findViewById(R.id.tvSchools);
        btnBack = findViewById(R.id.btnBack);
    }

    private void loadData() {
        Major major = (Major) getIntent().getSerializableExtra("major");
        
        if (major == null) {
            finish();
            return;
        }

        tvMajorName.setText(major.getName());
        chipCategory.setText(major.getCategory());
        tvDescription.setText(major.getDescription());

        // Career Path
        if (major.getCareerPath() != null && !major.getCareerPath().isEmpty()) {
            tvCareerPath.setText(formatList(major.getCareerPath()));
        }

        // Skills
        if (major.getRequiredSkills() != null && !major.getRequiredSkills().isEmpty()) {
            tvSkills.setText(formatList(major.getRequiredSkills()));
        }

        // Salary
        if (major.getSalaryRange() != null) {
            tvSalary.setText(major.getSalaryRange());
        }

        // Market Demand
        if (major.getMarketDemand() != null) {
            tvMarketDemand.setText(major.getMarketDemand());
        }

        // Schools
        if (major.getSchools() != null && !major.getSchools().isEmpty()) {
            tvSchools.setText(formatList(major.getSchools()));
        }
    }

    private String formatList(List<String> list) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            builder.append("• ").append(list.get(i));
            if (i < list.size() - 1) {
                builder.append("\n");
            }
        }
        return builder.toString();
    }

    private void setClickListeners() {
        btnBack.setOnClickListener(v -> finish());
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}


