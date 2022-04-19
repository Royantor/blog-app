package com.example.detalis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataViewHolder> {
    MyClick myClick;
    Context context;
    ArrayList<DataList>arrayList;

    public DataAdapter(MyClick myClick, Context context, ArrayList<DataList> arrayList) {
        this.myClick = myClick;
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        final View view = LayoutInflater.from(context).inflate(R.layout.per_row,parent,false);
        final DataViewHolder dataViewHolder=new DataViewHolder(view);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myClick.OnMyClick(view,dataViewHolder.getPosition());

            }
        });

        return dataViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {
        DataList dataList=arrayList.get(position);
        holder.name.setText(dataList.getName());
        holder.description.setText(dataList.getDescription());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
