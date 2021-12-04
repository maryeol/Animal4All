package com.example.animalforall;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.animalforall.adapter.Myadapter;

import java.util.ArrayList;
import java.util.List;

import com.example.animalforall.model.InfoAnimalItem;

public class thirdactivity extends AppCompatActivity {

    private RecyclerView recyclerview;
    private List<InfoAnimalItem> listinfo;
    private RecyclerView.Adapter adapter;

    private Button like , adopt ;
    private AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);

        recyclerview = findViewById(R.id.recyclerviewid);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        listinfo = new ArrayList<>();

        InfoAnimalItem animal1= new InfoAnimalItem("moon","2years","male"
        , "Megrine", "story not available");

        listinfo.add(animal1);

        adapter = new Myadapter(this , listinfo );
        recyclerview.setAdapter(adapter);

        like = findViewById(R.id.lkbtn);
        adopt = findViewById(R.id.adptbtn);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Toast.makeText(getApplicationContext(),"You liked this cat", Toast.LENGTH_SHORT).show();
            }
        });
        adopt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog = new AlertDialog.Builder(thirdactivity.this);
                alertDialog.setTitle("Are you sure you want to adopt the cat ?");
                alertDialog.setCancelable(false);
                alertDialog.setPositiveButton(R.string.postive_msg,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "You'll receive an email from " +
                                        "the owner <3 very soon ", Toast.LENGTH_LONG).show();
                            }

                        });

                alertDialog.setNegativeButton(R.string.negative_msg, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog dialog = alertDialog.create();
                dialog.show();

            }
        });
    }

}

