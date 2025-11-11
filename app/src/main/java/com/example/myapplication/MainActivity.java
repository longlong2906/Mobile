package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.myapplication.fragments.HomeFragment;
import com.example.myapplication.fragments.MajorsFragment;
import com.example.myapplication.fragments.ProfileFragment;
import com.example.myapplication.fragments.QuizFragment;
import com.example.myapplication.fragments.SchoolsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigation;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        bottomNavigation = findViewById(R.id.bottomNavigation);
        fragmentManager = getSupportFragmentManager();

        // Set up bottom navigation
        setupBottomNavigation();

        // Load default fragment (Home)
        if (savedInstanceState == null) {
            loadFragment(new HomeFragment());
        }
    }

    private void setupBottomNavigation() {
        bottomNavigation.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            int itemId = item.getItemId();

            if (itemId == R.id.navigation_home) {
                fragment = new HomeFragment();
            } else if (itemId == R.id.navigation_quiz) {
                fragment = new QuizFragment();
            } else if (itemId == R.id.navigation_majors) {
                fragment = new MajorsFragment();
            } else if (itemId == R.id.navigation_schools) {
                fragment = new SchoolsFragment();
            } else if (itemId == R.id.navigation_profile) {
                fragment = new ProfileFragment();
            }

            if (fragment != null) {
                loadFragment(fragment);
                return true;
            }
            return false;
        });
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragmentContainer, fragment);
        transaction.commit();
    }

    // Public method to switch tabs from fragments
    public void switchToTab(int tabId) {
        bottomNavigation.setSelectedItemId(tabId);
    }

    @Override
    public void onBackPressed() {
        // If not on home fragment, go to home
        if (bottomNavigation.getSelectedItemId() != R.id.navigation_home) {
            bottomNavigation.setSelectedItemId(R.id.navigation_home);
        } else {
            // If already on home, exit app
            super.onBackPressed();
        }
    }
}
