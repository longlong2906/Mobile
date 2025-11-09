package com.example.myapplication.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.models.Question;

import java.util.List;

/**
 * Adapter hiển thị danh sách các câu hỏi đã được chọn
 */
public class SelectedQuestionAdapter extends RecyclerView.Adapter<SelectedQuestionAdapter.ViewHolder> {

    private final List<Question> questions;

    public SelectedQuestionAdapter(List<Question> questions) {
        this.questions = questions;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_selected_question, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Question question = questions.get(position);
        
        holder.tvQuestionNumber.setText("Câu " + question.getId());
        holder.tvQuestionText.setText(question.getQuestionText());
        holder.tvHollandType.setText(question.getHollandType().getName());
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvQuestionNumber, tvQuestionText, tvHollandType;

        ViewHolder(View itemView) {
            super(itemView);
            tvQuestionNumber = itemView.findViewById(R.id.tvQuestionNumber);
            tvQuestionText = itemView.findViewById(R.id.tvQuestionText);
            tvHollandType = itemView.findViewById(R.id.tvHollandType);
        }
    }
}
