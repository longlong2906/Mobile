package com.example.myapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BenchmarkScoreAdapter extends RecyclerView.Adapter<BenchmarkScoreAdapter.ViewHolder> {

    private final List<Map.Entry<String, Double>> scores;

    public BenchmarkScoreAdapter(Map<String, Double> scoresMap) {
        this.scores = new ArrayList<>(scoresMap.entrySet());
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_benchmark_score, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Map.Entry<String, Double> entry = scores.get(position);
        holder.tvMajorName.setText(entry.getKey());
        holder.tvScore.setText(String.valueOf(entry.getValue()));
    }

    @Override
    public int getItemCount() {
        return scores.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvMajorName, tvScore;

        ViewHolder(View itemView) {
            super(itemView);
            tvMajorName = itemView.findViewById(R.id.tvMajorName);
            tvScore = itemView.findViewById(R.id.tvScore);
        }
    }
}

