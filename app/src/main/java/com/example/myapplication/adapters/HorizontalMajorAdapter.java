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

import java.util.List;

public class HorizontalMajorAdapter extends RecyclerView.Adapter<HorizontalMajorAdapter.ViewHolder> {

    private final Context context;
    private final List<Major> majors;

    public HorizontalMajorAdapter(Context context, List<Major> majors) {
        this.context = context;
        this.majors = majors;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_major_horizontal, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Major major = majors.get(position);

        holder.tvMajorName.setText(major.getName());
        holder.tvCategory.setText(major.getCategory());

        holder.cardMajor.setOnClickListener(v -> {
            Intent intent = new Intent(context, MajorDetailActivity.class);
            intent.putExtra("major", major);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return majors.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        MaterialCardView cardMajor;
        TextView tvMajorName, tvCategory;

        ViewHolder(View itemView) {
            super(itemView);
            cardMajor = itemView.findViewById(R.id.cardMajor);
            tvMajorName = itemView.findViewById(R.id.tvMajorName);
            tvCategory = itemView.findViewById(R.id.tvCategory);
        }
    }
}


