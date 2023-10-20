package com.example.staggeredlayoutmanager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.verticalviewholder> {
    Context context;
    ArrayList<Modelclass>data;
    public VerticalAdapter(Context context,ArrayList<Modelclass>data){
        this.context=context;
        this.data=data;
    }
    @NonNull
    @Override
    public verticalviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.verticalitems,parent,false);
        verticalviewholder vvh=new verticalviewholder(view);
        return vvh;
    }
    @Override
    public void onBindViewHolder(@NonNull verticalviewholder holder, int position) {

        holder.verticaltxt.setText(data.get(position).flag);
        holder.verticalimage.setImageResource(data.get(position).image);
    }
    @Override
    public int getItemCount() {
        return data.size();
    }
    public class verticalviewholder extends RecyclerView.ViewHolder {
        ImageView verticalimage;
        TextView verticaltxt;
        public verticalviewholder(@NonNull View itemView) {
            super(itemView);
            verticalimage=itemView.findViewById(R.id.verticalimage);
            verticaltxt = itemView.findViewById(R.id.verticaltxt);
        }
    }
}