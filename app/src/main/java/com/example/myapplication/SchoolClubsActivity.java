package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.models.School;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.card.MaterialCardView;

public class SchoolClubsActivity extends AppCompatActivity {

    private School school;
    private MaterialToolbar toolbar;
    private TextView tvPageTitle;
    private LinearLayout layoutClubs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_clubs);

        // Get school data
        school = (School) getIntent().getSerializableExtra("school");
        if (school == null) {
            finish();
            return;
        }

        initViews();
        setupToolbar();
        loadClubs();
    }

    private void initViews() {
        toolbar = findViewById(R.id.toolbar);
        tvPageTitle = findViewById(R.id.tvPageTitle);
        layoutClubs = findViewById(R.id.layoutClubs);
    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
        toolbar.setNavigationOnClickListener(v -> onBackPressed());
    }

    private void loadClubs() {
        layoutClubs.removeAllViews();

        if (school.getClubs() != null && !school.getClubs().isEmpty()) {
            for (String club : school.getClubs()) {
                addClubCard(club);
            }
        } else {
            // Show empty message
            TextView tvEmpty = new TextView(this);
            tvEmpty.setText("Chưa có thông tin về các câu lạc bộ");
            tvEmpty.setTextSize(16);
            tvEmpty.setTextColor(getResources().getColor(android.R.color.darker_gray));
            tvEmpty.setPadding(16, 16, 16, 16);
            layoutClubs.addView(tvEmpty);
        }
    }

    private void addClubCard(String clubName) {
        View cardView = LayoutInflater.from(this).inflate(R.layout.item_club, layoutClubs, false);
        
        TextView tvClubName = cardView.findViewById(R.id.tvClubName);
        tvClubName.setText(clubName);
        
        layoutClubs.addView(cardView);
    }
}




