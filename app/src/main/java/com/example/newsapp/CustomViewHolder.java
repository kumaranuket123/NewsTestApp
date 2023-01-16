package com.example.newsapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    TextView txtTitle,txtBody;
    ImageView imgNews;
    CardView cardView;
    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        txtTitle = itemView.findViewById(R.id.txtTitle);
        txtBody = itemView.findViewById(R.id.txtBody);
        imgNews =itemView.findViewById(R.id.imgNews);
        cardView =itemView.findViewById(R.id.main_container);
    }
}
