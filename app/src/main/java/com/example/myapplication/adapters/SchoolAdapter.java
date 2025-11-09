package com.example.myapplication.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.SchoolDetailActivity;
import com.example.myapplication.models.School;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;
import java.util.List;

public class SchoolAdapter extends RecyclerView.Adapter<SchoolAdapter.ViewHolder> {

    private final Context context;
    private List<School> schools;
    private List<School> schoolsFiltered;

    public SchoolAdapter(Context context, List<School> schools) {
        this.context = context;
        this.schools = schools;
        this.schoolsFiltered = new ArrayList<>(schools);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_school, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        School school = schoolsFiltered.get(position);

        holder.tvSchoolName.setText(school.getName());
        holder.tvShortName.setText(school.getShortName());
        holder.tvRegion.setText(school.getRegion());
        holder.tvType.setText(school.getType());
        holder.tvDescription.setText(school.getDescription());
        holder.tvAddress.setText(school.getAddress());

        // Click listener
        holder.cardSchool.setOnClickListener(v -> {
            Intent intent = new Intent(context, SchoolDetailActivity.class);
            intent.putExtra("school", school);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return schoolsFiltered.size();
    }

    // Filter method
    public void filter(String query, String region, String type) {
        schoolsFiltered.clear();

        for (School school : schools) {
            boolean matchesQuery = query.isEmpty() || 
                school.getName().toLowerCase().contains(query.toLowerCase()) ||
                school.getShortName().toLowerCase().contains(query.toLowerCase());
            
            boolean matchesRegion = region.equals("Tất cả") || school.getRegion().equals(region);
            boolean matchesType = type.equals("Tất cả") || school.getType().equals(type);

            if (matchesQuery && matchesRegion && matchesType) {
                schoolsFiltered.add(school);
            }
        }

        notifyDataSetChanged();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        MaterialCardView cardSchool;
        TextView tvSchoolName, tvShortName, tvRegion, tvType, tvDescription, tvAddress;

        ViewHolder(View itemView) {
            super(itemView);
            cardSchool = itemView.findViewById(R.id.cardSchool);
            tvSchoolName = itemView.findViewById(R.id.tvSchoolName);
            tvShortName = itemView.findViewById(R.id.tvShortName);
            tvRegion = itemView.findViewById(R.id.tvRegion);
            tvType = itemView.findViewById(R.id.tvType);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            tvAddress = itemView.findViewById(R.id.tvAddress);
        }
    }
}

