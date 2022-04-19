package com.example.detalis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<DataList>arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rec);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList =new ArrayList<DataList>();

        DataList dataList= new DataList("roy","thahfkadfa");
        arrayList.add(dataList);
        dataList= new DataList("roy","thahfkadfa");
        arrayList.add(dataList);
        dataList= new DataList("roy","thahfkadfa");
        arrayList.add(dataList);
        dataList= new DataList("roy","thahfkadfa");
        arrayList.add(dataList);dataList= new DataList("roy","thahfkadfa");
        arrayList.add(dataList);
        dataList= new DataList("roy","thahfkadfa");
        arrayList.add(dataList);
        dataList= new DataList("roy","thahfkadfa");
        arrayList.add(dataList);
        dataList= new DataList("roy","thahfkadfa");
        arrayList.add(dataList);
        dataList= new DataList("roy","thahfkadfa");
        arrayList.add(dataList);
        dataList= new DataList("roy","thahfkadfa");
        arrayList.add(dataList);




        DataAdapter dataAdapter= new DataAdapter(new MyClick() {
            @Override
            public void OnMyClick(View view, int position) {
                String description=arrayList.get(position).getDescription();
                Intent i = new Intent(MainActivity.this,MainActivity2.class);

                i.putExtra("description",description);
                startActivity(i);
            }
        },getApplicationContext(),arrayList);

        recyclerView.setAdapter(dataAdapter);

    }
    private void layoutAnimation(RecyclerView recyclerView){
        Context context = recyclerView.getContext();
        LayoutAnimationController layoutAnimationController =
                AnimationUtils.loadLayoutAnimation(context,R.anim.layout_slide_right);
        recyclerView.setLayoutAnimation(layoutAnimationController);
        recyclerView.getAdapter().notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
    }
}