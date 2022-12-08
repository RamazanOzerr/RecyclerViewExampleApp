package com.example.recyclerviewexampleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<Data> data = fill_with_data();

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getApplicationContext(),data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

    }

    public List<Data> fill_with_data() {

        List<Data> data = new ArrayList<>();
        data.add(new Data("C", R.drawable.c));
        data.add(new Data("Java", R.drawable.java));
        data.add(new Data("Android", R.drawable.android));
        data.add(new Data("python", R.drawable.python));
        data.add(new Data("C#", R.drawable.csharp));


        return data;
    }
}