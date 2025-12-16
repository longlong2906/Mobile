package com.example.myapplication.fragments;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.adapters.SchoolAdapter;
import com.example.myapplication.models.School;
import com.example.myapplication.repositories.SchoolRepository;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.TextInputEditText;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SchoolsFragment extends Fragment {

    private TextInputEditText etSearch;
    private ChipGroup chipGroupRegion, chipGroupType;
    private RecyclerView rvSchools;
    private LinearLayout emptyState;

    private SchoolAdapter schoolAdapter;
    private List<School> schools;

    private String currentQuery = "";
    private String currentRegion = "Tất cả";
    private String currentType = "Tất cả";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_schools, container, false);

        initViews(view);
        loadSchools();
        setupFilters();
        setupSearch();

        return view;
    }

    private void initViews(View view) {
        etSearch = view.findViewById(R.id.etSearch);
        chipGroupRegion = view.findViewById(R.id.chipGroupRegion);
        chipGroupType = view.findViewById(R.id.chipGroupType);
        rvSchools = view.findViewById(R.id.rvSchools);
        emptyState = view.findViewById(R.id.emptyState);

        rvSchools.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void loadSchools() {
        // Khởi tạo danh sách rỗng trước
        schools = new ArrayList<>();
        schoolAdapter = new SchoolAdapter(getContext(), schools);
        rvSchools.setAdapter(schoolAdapter);
        
        // Lấy dữ liệu từ Firebase
        SchoolRepository.getInstance().getAllSchools(new SchoolRepository.OnSchoolsLoadedListener() {
            @Override
            public void onSuccess(List<School> loadedSchools) {
                schools = loadedSchools;
                
                // Cập nhật adapter
                if (schoolAdapter != null) {
                    schoolAdapter.updateData(schools);
                    updateEmptyState();
                }
            }
            
            @Override
            public void onFailure(String error) {
                // Giữ danh sách rỗng nếu load thất bại
                updateEmptyState();
            }
        });
    }

    private void setupFilters() {
        // Setup Region chips - danh sách cố định
        List<String> regions = Arrays.asList("Tất cả", "Bắc", "Trung", "Nam");
        for (int i = 0; i < regions.size(); i++) {
            String region = regions.get(i);
            Chip chip = new Chip(getContext());
            chip.setText(region);
            chip.setCheckable(true);
            chip.setChecked(i == 0); // "Tất cả" is checked by default
            chip.setOnClickListener(v -> {
                currentRegion = region;
                applyFilters();
            });
            chipGroupRegion.addView(chip);
        }

        // Setup Type chips - danh sách cố định
        List<String> types = Arrays.asList("Tất cả", "Công lập", "Dân lập", "Quốc tế");
        for (int i = 0; i < types.size(); i++) {
            String type = types.get(i);
            Chip chip = new Chip(getContext());
            chip.setText(type);
            chip.setCheckable(true);
            chip.setChecked(i == 0); // "Tất cả" is checked by default
            chip.setOnClickListener(v -> {
                currentType = type;
                applyFilters();
            });
            chipGroupType.addView(chip);
        }
    }

    private void setupSearch() {
        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                currentQuery = s.toString();
                applyFilters();
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }

    private void applyFilters() {
        if (schoolAdapter != null) {
            schoolAdapter.filter(currentQuery, currentRegion, currentType);
            updateEmptyState();
        }
    }

    private void updateEmptyState() {
        if (schoolAdapter != null && schoolAdapter.getItemCount() == 0) {
            rvSchools.setVisibility(View.GONE);
            emptyState.setVisibility(View.VISIBLE);
        } else {
            rvSchools.setVisibility(View.VISIBLE);
            emptyState.setVisibility(View.GONE);
        }
    }
}
