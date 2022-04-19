package com.example.detalis;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DataViewHolder extends RecyclerView.ViewHolder {
    TextView name,description;
    public DataViewHolder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.name);
        description=itemView.findViewById(R.id.description);
    }
}
