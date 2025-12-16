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
import com.example.myapplication.SchoolMajorDetailActivity;
import com.example.myapplication.models.SchoolMajor;

import java.util.List;

public class SchoolMajorAdapter extends RecyclerView.Adapter<SchoolMajorAdapter.ViewHolder> {

    private Context context;
    private List<SchoolMajor> majors;

    public SchoolMajorAdapter(Context context, List<SchoolMajor> majors) {
        this.context = context;
        this.majors = majors;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_school_major, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SchoolMajor major = majors.get(position);

        holder.tvMajorName.setText(major.getName());
        
        if (major.getCode() != null && !major.getCode().isEmpty()) {
            holder.tvMajorCode.setText("Mã: " + major.getCode());
            holder.tvMajorCode.setVisibility(View.VISIBLE);
        } else {
            holder.tvMajorCode.setVisibility(View.GONE);
        }

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, SchoolMajorDetailActivity.class);
            intent.putExtra("major", major);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return majors.size();
    }
    
    // Update data method
    public void updateData(List<SchoolMajor> newMajors) {
        this.majors = newMajors;
        notifyDataSetChanged();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvMajorName, tvMajorCode;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMajorName = itemView.findViewById(R.id.tvMajorName);
            tvMajorCode = itemView.findViewById(R.id.tvMajorCode);
        }
    }
}



