package com.example.myapplication.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.adapters.BenchmarkScoreAdapter;
import com.example.myapplication.models.School;

import java.util.Map;

public class SchoolAdmissionFragment extends Fragment {

    private static final String ARG_SCHOOL = "school";
    private School school;

    private TextView tvAdmissionPolicy, tvAdmissionQuota, tvAdmissionMethods;
    private RecyclerView rvBenchmarkScores;
    private TextView tvNoBenchmark;

    public static SchoolAdmissionFragment newInstance(School school) {
        SchoolAdmissionFragment fragment = new SchoolAdmissionFragment();
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
        View view = inflater.inflate(R.layout.fragment_school_admission, container, false);

        initViews(view);
        displayAdmissionInfo();

        return view;
    }

    private void initViews(View view) {
        tvAdmissionPolicy = view.findViewById(R.id.tvAdmissionPolicy);
        tvAdmissionQuota = view.findViewById(R.id.tvAdmissionQuota);
        tvAdmissionMethods = view.findViewById(R.id.tvAdmissionMethods);
        rvBenchmarkScores = view.findViewById(R.id.rvBenchmarkScores);
        tvNoBenchmark = view.findViewById(R.id.tvNoBenchmark);

        rvBenchmarkScores.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void displayAdmissionInfo() {
        if (school == null) return;

        tvAdmissionPolicy.setText(school.getAdmissionPolicy());
        tvAdmissionQuota.setText(school.getAdmissionQuota());

        // Admission Methods
        if (school.getAdmissionMethods() != null && !school.getAdmissionMethods().isEmpty()) {
            StringBuilder methodsText = new StringBuilder();
            for (String method : school.getAdmissionMethods()) {
                methodsText.append("• ").append(method).append("\n");
            }
            tvAdmissionMethods.setText(methodsText.toString().trim());
        }

        // Benchmark Scores
        Map<String, Double> benchmarkScores = school.getBenchmarkScores();
        if (benchmarkScores != null && !benchmarkScores.isEmpty()) {
            BenchmarkScoreAdapter adapter = new BenchmarkScoreAdapter(benchmarkScores);
            rvBenchmarkScores.setAdapter(adapter);
            rvBenchmarkScores.setVisibility(View.VISIBLE);
            tvNoBenchmark.setVisibility(View.GONE);
        } else {
            rvBenchmarkScores.setVisibility(View.GONE);
            tvNoBenchmark.setVisibility(View.VISIBLE);
        }
    }
}

