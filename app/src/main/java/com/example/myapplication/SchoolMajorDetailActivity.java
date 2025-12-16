package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.adapters.SubjectAdapter;
import com.example.myapplication.models.SchoolMajor;
import com.example.myapplication.models.Specialization;
import com.example.myapplication.models.Subject;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolMajorDetailActivity extends AppCompatActivity {

    private SchoolMajor major;
    private MaterialToolbar toolbar;
    private TextView tvMajorName;
    private TextView tvOverview, tvMajorCode, tvCredits, tvAdmissionQuota, tvBenchmarkHistory, tvAdmissionBlocks;
    private HorizontalScrollView specializationTabsScroll;
    private ChipGroup chipGroupSpecializations;
    private LinearLayout layoutCurriculum;
    private TextView tvCareerDepartments, tvCareerInstitutes, tvCareerCorporations, tvCareerDivisions, tvCareerProspects;
    private TextView tvTuitionFee, tvDuration, tvDegree;
    
    // Chuẩn đầu ra
    private CardView cardLearningOutcomes;
    private TextView tvLearningOutcomesKnowledge, tvLearningOutcomesSkills, tvLearningOutcomesSoftSkills;
    private TextView tvLearningOutcomesAutonomy, tvLearningOutcomesEthics, tvLearningOutcomesLanguage, tvLearningOutcomesCareers;
    
    private int currentSpecializationIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_major_detail_new);

        // Get major data
        major = (SchoolMajor) getIntent().getSerializableExtra("major");
        if (major == null) {
            finish();
            return;
        }

        initViews();
        setupToolbar();
        loadData();
    }

    private void initViews() {
        toolbar = findViewById(R.id.toolbar);
        tvMajorName = findViewById(R.id.tvMajorName);
        
        // Tổng quan
        tvOverview = findViewById(R.id.tvOverview);
        tvMajorCode = findViewById(R.id.tvMajorCode);
        tvCredits = findViewById(R.id.tvCredits);
        tvAdmissionQuota = findViewById(R.id.tvAdmissionQuota);
        tvBenchmarkHistory = findViewById(R.id.tvBenchmarkHistory);
        tvAdmissionBlocks = findViewById(R.id.tvAdmissionBlocks);
        
        // Chương trình đào tạo
        specializationTabsScroll = findViewById(R.id.specializationTabsScroll);
        chipGroupSpecializations = findViewById(R.id.chipGroupSpecializations);
        layoutCurriculum = findViewById(R.id.layoutCurriculum);
        
        // Nghề nghiệp
        tvCareerDepartments = findViewById(R.id.tvCareerDepartments);
        tvCareerInstitutes = findViewById(R.id.tvCareerInstitutes);
        tvCareerCorporations = findViewById(R.id.tvCareerCorporations);
        tvCareerDivisions = findViewById(R.id.tvCareerDivisions);
        tvCareerProspects = findViewById(R.id.tvCareerProspects);
        
        // Chuẩn đầu ra
        cardLearningOutcomes = findViewById(R.id.cardLearningOutcomes);
        tvLearningOutcomesKnowledge = findViewById(R.id.tvLearningOutcomesKnowledge);
        tvLearningOutcomesSkills = findViewById(R.id.tvLearningOutcomesSkills);
        tvLearningOutcomesSoftSkills = findViewById(R.id.tvLearningOutcomesSoftSkills);
        tvLearningOutcomesAutonomy = findViewById(R.id.tvLearningOutcomesAutonomy);
        tvLearningOutcomesEthics = findViewById(R.id.tvLearningOutcomesEthics);
        tvLearningOutcomesLanguage = findViewById(R.id.tvLearningOutcomesLanguage);
        tvLearningOutcomesCareers = findViewById(R.id.tvLearningOutcomesCareers);
        
        // Thông tin khác
        tvTuitionFee = findViewById(R.id.tvTuitionFee);
        tvDuration = findViewById(R.id.tvDuration);
        tvDegree = findViewById(R.id.tvDegree);
    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false); // Ẩn title "Tư Vấn Hướng Nghiệp"
        }
        toolbar.setNavigationOnClickListener(v -> onBackPressed());
        
        // Set tên ngành vào header
        if (major != null) {
            tvMajorName.setText(major.getName());
        }
    }

    private void loadData() {
        // === TỔNG QUAN ===
        // Mô tả tổng quan
        if (major.getOverview() != null && !major.getOverview().isEmpty()) {
            tvOverview.setText(major.getOverview());
        } else {
            tvOverview.setText("Chưa có thông tin");
        }

        // Mã ngành
        if (major.getCode() != null && !major.getCode().isEmpty()) {
            tvMajorCode.setText(major.getCode());
        } else {
            tvMajorCode.setText("Chưa có thông tin");
        }

        // Khối lượng chương trình
        if (major.getCredits() > 0) {
            tvCredits.setText(major.getCredits() + " tín chỉ (không bao gồm Giáo dục thể chất, Giáo dục quốc phòng và Kỹ năng mềm)");
        } else {
            tvCredits.setText("Chưa có thông tin");
        }

        // Chỉ tiêu tuyển sinh
        if (major.getAdmissionQuota() != null && !major.getAdmissionQuota().isEmpty()) {
            tvAdmissionQuota.setText(major.getAdmissionQuota());
        } else {
            tvAdmissionQuota.setText("Chưa có thông tin");
        }

        // Điểm trung tuyển
        if (major.getBenchmarkScoreHistory() != null && !major.getBenchmarkScoreHistory().isEmpty()) {
            tvBenchmarkHistory.setText(major.getBenchmarkScoreHistory());
        } else {
            tvBenchmarkHistory.setText("Chưa có thông tin");
        }

        // Tổ hợp xét tuyển
        if (major.getAdmissionBlocks() != null && !major.getAdmissionBlocks().isEmpty()) {
            tvAdmissionBlocks.setText(major.getAdmissionBlocks());
        } else {
            tvAdmissionBlocks.setText("Chưa có thông tin");
        }

        // === CHƯƠNG TRÌNH ĐÀO TẠO ===
        loadCurriculum();

        // === NGHỀ NGHIỆP ===
        boolean hasDetailedCareer = false;
        
        // Các Cục, Vụ
        if (major.getCareerDepartments() != null && !major.getCareerDepartments().isEmpty()) {
            tvCareerDepartments.setText("- Các Cục, Vụ: " + major.getCareerDepartments());
            tvCareerDepartments.setVisibility(android.view.View.VISIBLE);
            hasDetailedCareer = true;
        }

        // Các Viện, Trung tâm
        if (major.getCareerInstitutes() != null && !major.getCareerInstitutes().isEmpty()) {
            tvCareerInstitutes.setText("- Các Viện, Trung tâm: " + major.getCareerInstitutes());
            tvCareerInstitutes.setVisibility(android.view.View.VISIBLE);
            hasDetailedCareer = true;
        }

        // Các Tập đoàn, Tổng công ty
        if (major.getCareerCorporations() != null && !major.getCareerCorporations().isEmpty()) {
            tvCareerCorporations.setText("- Các Tập đoàn, Tổng công ty: " + major.getCareerCorporations());
            tvCareerCorporations.setVisibility(android.view.View.VISIBLE);
            hasDetailedCareer = true;
        }

        // Các phòng chức năng
        if (major.getCareerDivisions() != null && !major.getCareerDivisions().isEmpty()) {
            tvCareerDivisions.setText("- Các phòng chức năng: " + major.getCareerDivisions());
            tvCareerDivisions.setVisibility(android.view.View.VISIBLE);
            hasDetailedCareer = true;
        }

        // Nếu không có thông tin chi tiết, hiển thị thông tin tổng quát
        if (hasDetailedCareer) {
            tvCareerProspects.setVisibility(android.view.View.GONE);
        } else {
            if (major.getCareerProspects() != null && !major.getCareerProspects().isEmpty()) {
                tvCareerProspects.setText(major.getCareerProspects());
            } else {
                tvCareerProspects.setText("Chưa có thông tin");
            }
        }

        // === CHUẨN ĐẦU RA ===
        loadLearningOutcomes();

        // === THÔNG TIN KHÁC ===
        // Học phí
        if (major.getTuitionFee() != null && !major.getTuitionFee().isEmpty()) {
            tvTuitionFee.setText(major.getTuitionFee());
        } else {
            tvTuitionFee.setText("Chưa có thông tin");
        }

        // Thời gian đào tạo
        if (major.getDuration() > 0) {
            tvDuration.setText(major.getDuration() + " năm");
        } else {
            tvDuration.setText("Chưa có thông tin");
        }

        // Bằng cấp
        if (major.getDegree() != null && !major.getDegree().isEmpty()) {
            tvDegree.setText(major.getDegree());
        } else {
            tvDegree.setText("Chưa có thông tin");
        }
    }
    
    private void loadLearningOutcomes() {
        boolean hasLearningOutcomes = false;
        
        // Về Kiến thức
        if (major.getLearningOutcomesKnowledge() != null && !major.getLearningOutcomesKnowledge().isEmpty()) {
            tvLearningOutcomesKnowledge.setText(formatListWithNumbers(major.getLearningOutcomesKnowledge()));
            hasLearningOutcomes = true;
        }
        
        // Về Kỹ năng
        if (major.getLearningOutcomesSkills() != null && !major.getLearningOutcomesSkills().isEmpty()) {
            tvLearningOutcomesSkills.setText(formatListWithNumbers(major.getLearningOutcomesSkills()));
            hasLearningOutcomes = true;
        }
        
        // Về Kỹ năng mềm
        if (major.getLearningOutcomesSoftSkills() != null && !major.getLearningOutcomesSoftSkills().isEmpty()) {
            tvLearningOutcomesSoftSkills.setText(formatListWithNumbers(major.getLearningOutcomesSoftSkills()));
            hasLearningOutcomes = true;
        }
        
        // Về Năng lực tự chủ và trách nhiệm
        if (major.getLearningOutcomesAutonomy() != null && !major.getLearningOutcomesAutonomy().isEmpty()) {
            tvLearningOutcomesAutonomy.setText(formatListWithNumbers(major.getLearningOutcomesAutonomy()));
            hasLearningOutcomes = true;
        }
        
        // Về Hành vi đạo đức
        if (major.getLearningOutcomesEthics() != null && !major.getLearningOutcomesEthics().isEmpty()) {
            tvLearningOutcomesEthics.setText(formatListWithNumbers(major.getLearningOutcomesEthics()));
            hasLearningOutcomes = true;
        }
        
        // Về Ngoại ngữ (Tiếng Anh)
        if (major.getLearningOutcomesLanguage() != null && !major.getLearningOutcomesLanguage().isEmpty()) {
            tvLearningOutcomesLanguage.setText(formatListWithNumbers(major.getLearningOutcomesLanguage()));
            hasLearningOutcomes = true;
        }
        
        // Về Vị trí việc làm sau khi tốt nghiệp
        if (major.getLearningOutcomesCareers() != null && !major.getLearningOutcomesCareers().isEmpty()) {
            tvLearningOutcomesCareers.setText(formatListAsLetters(major.getLearningOutcomesCareers()));
            hasLearningOutcomes = true;
        }
        
        // Hiển thị hoặc ẩn card Chuẩn đầu ra
        if (hasLearningOutcomes) {
            cardLearningOutcomes.setVisibility(View.VISIBLE);
        } else {
            cardLearningOutcomes.setVisibility(View.GONE);
        }
    }
    
    private String formatListWithNumbers(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append("(").append(i + 1).append(") ").append(list.get(i));
            if (i < list.size() - 1) {
                sb.append("\n\n");
            }
        }
        return sb.toString();
    }
    
    private String formatListAsLetters(List<String> list) {
        StringBuilder sb = new StringBuilder();
        char letter = 'a';
        for (int i = 0; i < list.size(); i++) {
            sb.append(letter).append(". ").append(list.get(i));
            letter++;
            if (i < list.size() - 1) {
                sb.append("\n\n");
            }
        }
        return sb.toString();
    }

    private void loadCurriculum() {
        // Check if there are specializations
        if (major.getSpecializations() != null && !major.getSpecializations().isEmpty()) {
            // Show specialization tabs
            specializationTabsScroll.setVisibility(View.VISIBLE);
            setupSpecializationTabs();
            // Load curriculum for the first specialization
            loadCurriculumForSpecialization(currentSpecializationIndex);
        } else {
            // No specializations, load curriculum directly
            specializationTabsScroll.setVisibility(View.GONE);
            loadCurriculumDirect();
        }
    }
    
    private void setupSpecializationTabs() {
        chipGroupSpecializations.removeAllViews();
        List<Specialization> specializations = major.getSpecializations();
        
        for (int i = 0; i < specializations.size(); i++) {
            final int index = i;
            Specialization spec = specializations.get(i);
            
            Chip chip = new Chip(this);
            chip.setText(spec.getName());
            chip.setCheckable(true);
            chip.setTextColor(getResources().getColorStateList(R.color.chip_specialization_text));
            chip.setCheckedIconVisible(false);
            chip.setEnsureMinTouchTargetSize(false);
            chip.setChipMinHeight(48);
            chip.setChipStrokeWidth(0);
            
            // Set padding
            chip.setPadding(24, 16, 24, 16);
            
            // Set initial background
            if (i == currentSpecializationIndex) {
                chip.setChecked(true);
                chip.setChipBackgroundColorResource(android.R.color.transparent);
                chip.setBackground(getResources().getDrawable(R.drawable.chip_specialization_selected));
            } else {
                chip.setChipBackgroundColorResource(android.R.color.transparent);
                chip.setBackground(getResources().getDrawable(R.drawable.chip_specialization_unselected));
            }
            
            chip.setOnClickListener(v -> {
                currentSpecializationIndex = index;
                
                // Update all chips
                for (int j = 0; j < chipGroupSpecializations.getChildCount(); j++) {
                    Chip c = (Chip) chipGroupSpecializations.getChildAt(j);
                    if (j == index) {
                        c.setChecked(true);
                        c.setBackground(getResources().getDrawable(R.drawable.chip_specialization_selected));
                    } else {
                        c.setChecked(false);
                        c.setBackground(getResources().getDrawable(R.drawable.chip_specialization_unselected));
                    }
                }
                
                loadCurriculumForSpecialization(index);
            });
            
            chipGroupSpecializations.addView(chip);
        }
    }
    
    private void loadCurriculumForSpecialization(int index) {
        layoutCurriculum.removeAllViews();
        
        List<Specialization> specializations = major.getSpecializations();
        if (index >= 0 && index < specializations.size()) {
            Specialization spec = specializations.get(index);
            List<Subject> subjects = spec.getSubjects();
            
            if (subjects != null && !subjects.isEmpty()) {
                displaySubjects(subjects);
            } else {
                showNoDataMessage();
            }
        } else {
            showNoDataMessage();
        }
    }
    
    private void loadCurriculumDirect() {
        layoutCurriculum.removeAllViews();
        
        if (major.getSubjects() != null && !major.getSubjects().isEmpty()) {
            displaySubjects(major.getSubjects());
        } else {
            // Fallback to text description if no subjects
            TextView tvFallback = new TextView(this);
            if (major.getCurriculumDetails() != null && !major.getCurriculumDetails().isEmpty()) {
                tvFallback.setText(major.getCurriculumDetails());
            } else if (major.getCurriculum() != null && !major.getCurriculum().isEmpty()) {
                tvFallback.setText(major.getCurriculum());
            } else {
                tvFallback.setText("Chưa có thông tin");
            }
            tvFallback.setTextColor(getResources().getColor(android.R.color.darker_gray));
            tvFallback.setPadding(0, 16, 0, 16);
            layoutCurriculum.addView(tvFallback);
        }
    }
    
    private void displaySubjects(List<Subject> subjects) {
        // Group subjects by semester
        Map<Integer, List<Subject>> subjectsBySemester = new HashMap<>();
        int maxSemester = 0;
        
        for (Subject subject : subjects) {
            int semester = subject.getSemester();
            if (semester > maxSemester) {
                maxSemester = semester;
            }
            
            if (!subjectsBySemester.containsKey(semester)) {
                subjectsBySemester.put(semester, new ArrayList<>());
            }
            subjectsBySemester.get(semester).add(subject);
        }
        
        // Display subjects for each semester
        for (int sem = 1; sem <= maxSemester; sem++) {
            if (subjectsBySemester.containsKey(sem)) {
                addSemesterView(sem, subjectsBySemester.get(sem));
            }
        }
    }
    
    private void showNoDataMessage() {
        TextView tvFallback = new TextView(this);
        tvFallback.setText("Chưa có thông tin chương trình đào tạo");
        tvFallback.setTextColor(getResources().getColor(android.R.color.darker_gray));
        tvFallback.setPadding(0, 16, 0, 16);
        layoutCurriculum.addView(tvFallback);
    }

    private void addSemesterView(int semester, List<Subject> subjects) {
        // Semester header
        TextView tvSemesterHeader = new TextView(this);
        tvSemesterHeader.setText("Học kỳ " + semester);
        tvSemesterHeader.setTextSize(16);
        tvSemesterHeader.setTextColor(getResources().getColor(android.R.color.black));
        tvSemesterHeader.setTypeface(null, android.graphics.Typeface.BOLD);
        LinearLayout.LayoutParams headerParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        headerParams.setMargins(0, 24, 0, 12);
        tvSemesterHeader.setLayoutParams(headerParams);
        layoutCurriculum.addView(tvSemesterHeader);

        // RecyclerView for subjects in grid
        RecyclerView rvSubjects = new RecyclerView(this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        rvSubjects.setLayoutManager(gridLayoutManager);
        rvSubjects.setNestedScrollingEnabled(false);
        
        SubjectAdapter adapter = new SubjectAdapter(this, subjects);
        rvSubjects.setAdapter(adapter);
        
        LinearLayout.LayoutParams rvParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        rvSubjects.setLayoutParams(rvParams);
        layoutCurriculum.addView(rvSubjects);
    }
}

