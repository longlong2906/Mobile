package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.example.myapplication.fragments.SchoolAdmissionFragment;
import com.example.myapplication.fragments.SchoolInfoFragment;
import com.example.myapplication.models.School;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class SchoolDetailActivity extends AppCompatActivity {

    private School school;
    private TextView tvSchoolName;
    private TabLayout tabLayout;
    private ViewPager2 viewPager;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_detail);

        // Get school data from intent
        school = (School) getIntent().getSerializableExtra("school");
        if (school == null) {
            finish();
            return;
        }

        initViews();
        setupToolbar();
        setupViewPager();
    }

    private void initViews() {
        tvSchoolName = findViewById(R.id.tvSchoolName);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
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
    }

    private void setupViewPager() {
        SchoolPagerAdapter adapter = new SchoolPagerAdapter(this, school);
        viewPager.setAdapter(adapter);

        // Link TabLayout with ViewPager2
        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Thông tin chung");
                    break;
                case 1:
                    tab.setText("Tuyển sinh");
                    break;
            }
        }).attach();
    }

    // ViewPager2 Adapter
    private static class SchoolPagerAdapter extends FragmentStateAdapter {
        private final School school;

        public SchoolPagerAdapter(@NonNull FragmentActivity fragmentActivity, School school) {
            super(fragmentActivity);
            this.school = school;
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0:
                    return SchoolInfoFragment.newInstance(school);
                case 1:
                    return SchoolAdmissionFragment.newInstance(school);
                default:
                    return SchoolInfoFragment.newInstance(school);
            }
        }

        @Override
        public int getItemCount() {
            return 2;
        }
    }
}

