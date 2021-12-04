package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animalforall.R;

import java.util.List;

import com.example.animalforall.model.Listitem;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    private Context context;
    private List<Listitem> listitems;


    public MyAdapter(Context context, List<Listitem> listitems) {
        this.context = context;
        this.listitems = listitems;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        Listitem item = listitems.get(position);
        holder.title.setText(item.getTitle());
        holder.desc.setText(item.getDesc());
    }

    @Override
    public int getItemCount() {
        return listitems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView desc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            desc = itemView.findViewById(R.id.details);
        }
    }
}
