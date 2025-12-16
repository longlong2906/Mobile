package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.myapplication.models.School;
import com.google.android.material.card.MaterialCardView;

public class SchoolDetailActivity extends AppCompatActivity {

    private static final String TAG = "SchoolDetailActivity";
    private School school;
    private ImageView ivSchoolImage;
    private TextView tvSchoolName;
    private TextView tvAddress, tvWebsite, tvDescription;
    private MaterialCardView cardAdmission, cardMajors, cardClubs;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_detail_new);

        // Get school data from intent
        school = (School) getIntent().getSerializableExtra("school");
        if (school == null) {
            finish();
            return;
        }

        initViews();
        setupToolbar();
        loadData();
        setupClickListeners();
    }

    private void initViews() {
        ivSchoolImage = findViewById(R.id.ivSchoolImage);
        tvSchoolName = findViewById(R.id.tvSchoolName);
        tvAddress = findViewById(R.id.tvAddress);
        tvWebsite = findViewById(R.id.tvWebsite);
        tvDescription = findViewById(R.id.tvDescription);
        cardAdmission = findViewById(R.id.cardAdmission);
        cardMajors = findViewById(R.id.cardMajors);
        cardClubs = findViewById(R.id.cardClubs);
        toolbar = findViewById(R.id.toolbar);
    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle("");
        }

        toolbar.setNavigationOnClickListener(v -> onBackPressed());
        tvSchoolName.setText(school.getName());
        
        // Load school image
        loadSchoolImage();
    }

    private void loadSchoolImage() {
        Log.d(TAG, "loadSchoolImage() called");
        Log.d(TAG, "School name: " + school.getName());
        Log.d(TAG, "Image URL: " + school.getImageUrl());
        Log.d(TAG, "Image Res ID: " + school.getImageResId());
        
        // Ưu tiên load ảnh từ URL nếu có
        if (school.getImageUrl() != null && !school.getImageUrl().isEmpty()) {
            Log.d(TAG, "Loading image from URL: " + school.getImageUrl());
            Glide.with(this)
                    .load(school.getImageUrl())
                    .placeholder(R.drawable.bg_school_default)
                    .error(school.getImageResId() != 0 ? school.getImageResId() : R.drawable.bg_school_default)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .centerCrop()
                    .into(ivSchoolImage);
        } else if (school.getImageResId() != 0) {
            Log.d(TAG, "Loading image from resource ID: " + school.getImageResId());
            ivSchoolImage.setImageResource(school.getImageResId());
        } else {
            Log.d(TAG, "Using default image");
            ivSchoolImage.setImageResource(R.drawable.bg_school_default);
        }
    }

    private void loadData() {
        // Load contact information
        tvAddress.setText(school.getAddress() != null ? school.getAddress() : "Chưa có thông tin");
        tvWebsite.setText(school.getWebsite() != null ? school.getWebsite() : "Chưa có thông tin");
        tvDescription.setText(school.getDescription() != null ? school.getDescription() : "Chưa có thông tin");
    }

    private void setupClickListeners() {
        // Tuyển sinh
        cardAdmission.setOnClickListener(v -> {
            Intent intent = new Intent(this, SchoolAdmissionActivity.class);
            intent.putExtra("school", school);
            startActivity(intent);
        });

        // Các ngành đào tạo
        cardMajors.setOnClickListener(v -> {
            Intent intent = new Intent(this, SchoolMajorsActivity.class);
            intent.putExtra("school", school);
            startActivity(intent);
        });

        // Các câu lạc bộ
        cardClubs.setOnClickListener(v -> {
            Intent intent = new Intent(this, SchoolClubsActivity.class);
            intent.putExtra("school", school);
            startActivity(intent);
        });
    }
}

