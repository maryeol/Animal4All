package com.example.animalforall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animalforall.R;

import java.util.List;

import com.example.animalforall.model.InfoAnimalItem;

public class Myadapter extends RecyclerView.Adapter<Myadapter.ViewHolder> {

    private Context context;
    private List<InfoAnimalItem> listinfo;

    public Myadapter(Context context, List<InfoAnimalItem> listinfo) {
        this.context = context;
        this.listinfo = listinfo;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animalinfo_row, parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        InfoAnimalItem item = listinfo.get(position);
        holder.name.setText(item.getName());
        holder.age.setText(item.getAge());
        holder.gender.setText(item.getGender());
        holder.adress.setText(item.getAdress());
        holder.story.setText(item.getStory());
    }

    @Override
    public int getItemCount() {
        return listinfo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView age;
        private TextView gender;
        private TextView adress;
        private TextView story;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            age = itemView.findViewById(R.id.age);
            gender = itemView.findViewById(R.id.gender);
            adress = itemView.findViewById(R.id.adress);
            story = itemView.findViewById(R.id.story);
        }
    }
}
