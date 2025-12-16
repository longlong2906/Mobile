package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.adapters.SchoolMajorAdapter;
import com.example.myapplication.models.School;
import com.example.myapplication.models.SchoolMajor;
import com.example.myapplication.repositories.SchoolMajorRepository;
import com.google.android.material.appbar.MaterialToolbar;

import java.util.List;
import java.util.ArrayList;

public class SchoolMajorsActivity extends AppCompatActivity {

    private School school;
    private MaterialToolbar toolbar;
    private TextView tvPageTitle;
    private RecyclerView rvMajors;
    private SchoolMajorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_majors);

        // Get school data
        school = (School) getIntent().getSerializableExtra("school");
        if (school == null) {
            finish();
            return;
        }

        initViews();
        setupToolbar();
        loadMajors();
    }

    private void initViews() {
        toolbar = findViewById(R.id.toolbar);
        tvPageTitle = findViewById(R.id.tvPageTitle);
        rvMajors = findViewById(R.id.rvMajors);
    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false); // Ẩn title "Tư Vấn Hướng Nghiệp"
        }
        toolbar.setNavigationOnClickListener(v -> onBackPressed());
    }

    private void loadMajors() {
        // Khởi tạo danh sách rỗng trước
        List<SchoolMajor> majors = new ArrayList<>();
        adapter = new SchoolMajorAdapter(this, majors);
        rvMajors.setLayoutManager(new LinearLayoutManager(this));
        rvMajors.setAdapter(adapter);
        
        // Lấy majors từ Firebase
        SchoolMajorRepository.getInstance().getMajorsBySchoolId(school.getId(), 
            new SchoolMajorRepository.OnSchoolMajorsLoadedListener() {
                @Override
                public void onSuccess(List<SchoolMajor> loadedMajors) {
                    // Cập nhật adapter với dữ liệu mới
                    adapter.updateData(loadedMajors);
                }
                
                @Override
                public void onFailure(String error) {
                    // Giữ danh sách rỗng nếu load thất bại
                }
            });
    }
}




