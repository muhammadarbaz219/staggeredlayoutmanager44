package com.example.staggeredlayoutmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ArrayList<Modelclass> data=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView horizontalrecyclerView=(RecyclerView) findViewById(R.id.horizontalrecyclerview);
        RecyclerView verticalrecyclerView=(RecyclerView) findViewById(R.id.verticalecyclerview);

        data.add(new Modelclass(R.drawable.pakistan,"Pakistan"));
        data.add(new Modelclass(R.drawable.india,"India"));
        data.add(new Modelclass(R.drawable.afghanistan,"Afghanistan"));
        data.add(new Modelclass(R.drawable.china,"China"));
        data.add(new Modelclass(R.drawable.bhutan,"Bhutan"));
        data.add(new Modelclass(R.drawable.iran,"Iran"));
        data.add(new Modelclass(R.drawable.nepal,"Nepal"));
        data.add(new Modelclass(R.drawable.saudiarabia,"Saudi Arabia"));
        data.add(new Modelclass(R.drawable.uae,"UAE"));
        data.add(new Modelclass(R.drawable.turkey,"Turkey"));
        data.add(new Modelclass(R.drawable.srilanka,"Sri Lanka"));

       /* horizontalrecyclerView.setHasFixedSize(true);
        verticalrecyclerView.setHasFixedSize(true);*/

        LinearLayoutManager horizontalLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        horizontalrecyclerView.setLayoutManager(horizontalLayoutManager);
        HorizontalAdapter horizontaladapter=new HorizontalAdapter(this,data);
        horizontalrecyclerView.setAdapter(horizontaladapter);

        LinearLayoutManager verticalLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        verticalrecyclerView.setLayoutManager(verticalLayoutManager);
        VerticalAdapter verticaladapter=new VerticalAdapter(this,data);
        verticalrecyclerView.setAdapter(verticaladapter);
    }
}
