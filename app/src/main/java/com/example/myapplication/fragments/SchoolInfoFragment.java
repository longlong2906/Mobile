package com.example.myapplication.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.models.School;

public class SchoolInfoFragment extends Fragment {

    private static final String ARG_SCHOOL = "school";
    private School school;

    private TextView tvAddress, tvPhone, tvEmail, tvWebsite;
    private TextView tvDescription, tvMajors, tvTuition, tvFacilities, tvClubs;

    public static SchoolInfoFragment newInstance(School school) {
        SchoolInfoFragment fragment = new SchoolInfoFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_SCHOOL, school);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            school = (School) getArguments().getSerializable(ARG_SCHOOL);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_school_info, container, false);

        initViews(view);
        displaySchoolInfo();

        return view;
    }

    private void initViews(View view) {
        tvAddress = view.findViewById(R.id.tvAddress);
        tvPhone = view.findViewById(R.id.tvPhone);
        tvEmail = view.findViewById(R.id.tvEmail);
        tvWebsite = view.findViewById(R.id.tvWebsite);
        tvDescription = view.findViewById(R.id.tvDescription);
        tvMajors = view.findViewById(R.id.tvMajors);
        tvTuition = view.findViewById(R.id.tvTuition);
        tvFacilities = view.findViewById(R.id.tvFacilities);
        tvClubs = view.findViewById(R.id.tvClubs);
    }

    private void displaySchoolInfo() {
        if (school == null) return;

        tvAddress.setText("Địa chỉ: " + school.getAddress());
        tvPhone.setText("Điện thoại: " + school.getPhone());
        tvEmail.setText("Email: " + school.getEmail());
        tvWebsite.setText("Website: " + school.getWebsite());
        tvDescription.setText(school.getDescription());
        tvTuition.setText(school.getTuitionRange());

        // Majors
        if (school.getMajors() != null && !school.getMajors().isEmpty()) {
            StringBuilder majorsText = new StringBuilder();
            for (String major : school.getMajors()) {
                majorsText.append("• ").append(major).append("\n");
            }
            tvMajors.setText(majorsText.toString().trim());
        }

        // Facilities
        if (school.getFacilities() != null && !school.getFacilities().isEmpty()) {
            StringBuilder facilitiesText = new StringBuilder();
            for (String facility : school.getFacilities()) {
                facilitiesText.append("• ").append(facility).append("\n");
            }
            tvFacilities.setText(facilitiesText.toString().trim());
        }

        // Clubs
        if (school.getClubs() != null && !school.getClubs().isEmpty()) {
            StringBuilder clubsText = new StringBuilder();
            for (String club : school.getClubs()) {
                clubsText.append("• ").append(club).append("\n");
            }
            tvClubs.setText(clubsText.toString().trim());
        }
    }
}

