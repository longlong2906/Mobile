package com.example.myapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.google.android.material.chip.Chip;

public class MajorChipAdapter extends RecyclerView.Adapter<MajorChipAdapter.ViewHolder> {

    private final String[] majors;

    public MajorChipAdapter(String[] majors) {
        this.majors = majors;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_major_chip, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.chip.setText(majors[position]);
    }

    @Override
    public int getItemCount() {
        return majors.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        Chip chip;

        ViewHolder(View itemView) {
            super(itemView);
            chip = itemView.findViewById(R.id.chipMajor);
        }
    }
}



