package com.example.animalforall;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import adapter.MyAdapter;
import com.example.animalforall.model.Listitem;

public class Recycle extends AppCompatActivity {

    private RecyclerView recyclerview;
    private List<Listitem> listitems;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        recyclerview = findViewById(R.id.recyclerviewid);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

       listitems = new ArrayList<>();

        Listitem item1 = new Listitem("You have one notification" , "The owner of Moon called you :) ");
        Listitem item2 = new Listitem("You have one notification" , "Someone wants to adopt your Dog! ");
        Listitem item3 = new Listitem("You have one notification" , "Congrats, You have confirmed your Account! ");
        Listitem item4 = new Listitem("You have one notification" , "Hello to Animal4All <3 ");

        listitems.add(item1);
        listitems.add(item2);
        listitems.add(item3);
        listitems.add(item4);

        adapter = new MyAdapter(this , listitems);

        recyclerview.setAdapter(adapter);

    }
}