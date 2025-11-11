package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.models.Major;
import com.google.android.material.chip.Chip;

import java.util.List;

public class MajorDetailActivity extends AppCompatActivity {

    private TextView tvMajorName, tvDescription, tvEducationRequirement;
    private TextView tvTechnicalSkills, tvSoftSkills, tvSuitableFor;
    private TextView tvCareerPath, tvWorkEnvironments;
    private TextView tvSalary, tvJobOpportunities, tvChallenges, tvSchools;
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
        tvEducationRequirement = findViewById(R.id.tvEducationRequirement);
        tvTechnicalSkills = findViewById(R.id.tvTechnicalSkills);
        tvSoftSkills = findViewById(R.id.tvSoftSkills);
        tvSuitableFor = findViewById(R.id.tvSuitableFor);
        tvCareerPath = findViewById(R.id.tvCareerPath);
        tvWorkEnvironments = findViewById(R.id.tvWorkEnvironments);
        tvSalary = findViewById(R.id.tvSalary);
        tvJobOpportunities = findViewById(R.id.tvJobOpportunities);
        tvChallenges = findViewById(R.id.tvChallenges);
        tvSchools = findViewById(R.id.tvSchools);
        btnBack = findViewById(R.id.btnBack);
    }

    private void loadData() {
        Major major = (Major) getIntent().getSerializableExtra("major");
        
        if (major == null) {
            finish();
            return;
        }

        // Basic info
        tvMajorName.setText(major.getName());
        chipCategory.setText(major.getCategory());
        
        // Mô tả công việc
        if (major.getDescription() != null) {
            tvDescription.setText(major.getDescription());
        }

        // Yêu cầu trình độ học vấn
        if (major.getEducationRequirement() != null) {
            tvEducationRequirement.setText(major.getEducationRequirement());
        } else {
            tvEducationRequirement.setText("Chưa có thông tin");
        }

        // Kỹ năng chuyên môn
        if (major.getTechnicalSkills() != null && !major.getTechnicalSkills().isEmpty()) {
            tvTechnicalSkills.setText(formatList(major.getTechnicalSkills()));
        } else {
            tvTechnicalSkills.setText("Chưa có thông tin");
        }

        // Kỹ năng mềm
        if (major.getSoftSkills() != null && !major.getSoftSkills().isEmpty()) {
            tvSoftSkills.setText(formatList(major.getSoftSkills()));
        } else {
            tvSoftSkills.setText("Chưa có thông tin");
        }

        // Đối tượng phù hợp
        if (major.getSuitableFor() != null) {
            tvSuitableFor.setText(major.getSuitableFor());
        } else {
            tvSuitableFor.setText("Chưa có thông tin");
        }

        // Lộ trình phát triển nghề nghiệp
        if (major.getCareerPath() != null && !major.getCareerPath().isEmpty()) {
            tvCareerPath.setText(formatList(major.getCareerPath()));
        } else {
            tvCareerPath.setText("Chưa có thông tin");
        }

        // Môi trường làm việc
        if (major.getWorkEnvironments() != null && !major.getWorkEnvironments().isEmpty()) {
            tvWorkEnvironments.setText(formatList(major.getWorkEnvironments()));
        } else {
            tvWorkEnvironments.setText("Chưa có thông tin");
        }

        // Mức lương
        if (major.getSalaryRange() != null) {
            tvSalary.setText(major.getSalaryRange());
        } else {
            tvSalary.setText("Chưa có thông tin");
        }

        // Cơ hội việc làm
        if (major.getJobOpportunities() != null) {
            tvJobOpportunities.setText(major.getJobOpportunities());
        } else {
            tvJobOpportunities.setText("Chưa có thông tin");
        }

        // Thách thức
        if (major.getChallenges() != null && !major.getChallenges().isEmpty()) {
            tvChallenges.setText(formatList(major.getChallenges()));
        } else {
            tvChallenges.setText("Chưa có thông tin");
        }

        // Trường đào tạo
        if (major.getSchools() != null && !major.getSchools().isEmpty()) {
            tvSchools.setText(formatList(major.getSchools()));
        } else {
            tvSchools.setText("Chưa có thông tin");
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
