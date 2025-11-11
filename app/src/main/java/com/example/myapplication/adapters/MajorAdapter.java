package com.example.myapplication.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.MajorDetailActivity;
import com.example.myapplication.R;
import com.example.myapplication.models.Major;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;

import java.util.ArrayList;
import java.util.List;

public class MajorAdapter extends RecyclerView.Adapter<MajorAdapter.ViewHolder> {

    private final Context context;
    private List<Major> majors;
    private List<Major> majorsFiltered;

    public MajorAdapter(Context context, List<Major> majors) {
        this.context = context;
        this.majors = majors;
        this.majorsFiltered = new ArrayList<>(majors);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_major, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Major major = majorsFiltered.get(position);

        holder.tvMajorName.setText(major.getName());
        holder.chipCategory.setText(major.getCategory());
        holder.tvDescription.setText(major.getDescription());
        
        if (major.getSalaryRange() != null) {
            holder.tvSalary.setText(major.getSalaryRange().split("/")[0]);
        }
        
        if (major.getMarketDemand() != null) {
            String demand = major.getMarketDemand().split(" - ")[0];
            holder.tvDemand.setText(demand);
        }

        holder.cardMajor.setOnClickListener(v -> {
            Intent intent = new Intent(context, MajorDetailActivity.class);
            intent.putExtra("major", major);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return majorsFiltered.size();
    }

    public void updateData(List<Major> newMajors) {
        this.majors = newMajors;
        this.majorsFiltered = new ArrayList<>(newMajors);
        notifyDataSetChanged();
    }

    public void filter(String query, String category) {
        majorsFiltered.clear();

        for (Major major : majors) {
            boolean matchQuery = query.isEmpty() || 
                major.getName().toLowerCase().contains(query.toLowerCase()) ||
                major.getDescription().toLowerCase().contains(query.toLowerCase());

            boolean matchCategory = category.equals("Tất cả") || 
                major.getCategory().equals(category);

            if (matchQuery && matchCategory) {
                majorsFiltered.add(major);
            }
        }

        notifyDataSetChanged();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        MaterialCardView cardMajor;
        TextView tvMajorName, tvDescription, tvSalary, tvDemand;
        Chip chipCategory;

        ViewHolder(View itemView) {
            super(itemView);
            cardMajor = itemView.findViewById(R.id.cardMajor);
            tvMajorName = itemView.findViewById(R.id.tvMajorName);
            chipCategory = itemView.findViewById(R.id.chipCategory);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            tvSalary = itemView.findViewById(R.id.tvSalary);
            tvDemand = itemView.findViewById(R.id.tvDemand);
        }
    }
}


