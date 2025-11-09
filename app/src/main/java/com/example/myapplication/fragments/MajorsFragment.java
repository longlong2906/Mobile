package com.example.myapplication.fragments;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.adapters.MajorAdapter;
import com.example.myapplication.data.MajorData;
import com.example.myapplication.models.Major;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.TextInputEditText;

import java.util.List;

public class MajorsFragment extends Fragment {

    private RecyclerView rvMajors;
    private TextInputEditText etSearch;
    private ChipGroup chipGroupCategories;
    private View layoutEmpty;

    private MajorAdapter adapter;
    private List<Major> majors;
    private String currentCategory = "Tất cả";
    private String currentQuery = "";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_majors, container, false);

        initViews(view);
        loadData();
        setupRecyclerView();
        setupCategories();
        setupSearch();

        return view;
    }

    private void initViews(View view) {
        rvMajors = view.findViewById(R.id.rvMajors);
        etSearch = view.findViewById(R.id.etSearch);
        chipGroupCategories = view.findViewById(R.id.chipGroupCategories);
        layoutEmpty = view.findViewById(R.id.layoutEmpty);
    }

    private void loadData() {
        majors = MajorData.getSampleMajors();
    }

    private void setupRecyclerView() {
        adapter = new MajorAdapter(requireContext(), majors);
        rvMajors.setLayoutManager(new LinearLayoutManager(requireContext()));
        rvMajors.setAdapter(adapter);
    }

    private void setupCategories() {
        List<String> categories = MajorData.getCategories();
        
        for (int i = 0; i < categories.size(); i++) {
            String category = categories.get(i);
            Chip chip = new Chip(requireContext());
            chip.setText(category);
            chip.setCheckable(true);
            
            if (i == 0) {
                chip.setChecked(true);
            }
            
            chip.setOnCheckedChangeListener((buttonView, isChecked) -> {
                if (isChecked) {
                    currentCategory = category;
                    filterMajors();
                }
            });
            
            chipGroupCategories.addView(chip);
        }
    }

    private void setupSearch() {
        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                currentQuery = s.toString();
                filterMajors();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    private void filterMajors() {
        adapter.filter(currentQuery, currentCategory);
        
        // Show/hide empty state
        if (adapter.getItemCount() == 0) {
            layoutEmpty.setVisibility(View.VISIBLE);
            rvMajors.setVisibility(View.GONE);
        } else {
            layoutEmpty.setVisibility(View.GONE);
            rvMajors.setVisibility(View.VISIBLE);
        }
    }
}


