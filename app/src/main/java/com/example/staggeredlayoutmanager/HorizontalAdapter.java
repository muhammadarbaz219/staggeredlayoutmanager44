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
public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.horizontalviewholder> {
    Context context;
    ArrayList<Modelclass>data;
    public HorizontalAdapter(Context context, ArrayList<Modelclass>data){
        this.context=context;
        this.data=data;
    }
    @NonNull
    @Override
    public horizontalviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.horizontalitems,parent,false);
        horizontalviewholder hvh=new horizontalviewholder(view);
        return hvh;
    }
    @Override
    public void onBindViewHolder(@NonNull horizontalviewholder holder, int position) {
        holder.horizontalimage.setImageResource(data.get(position).image);
        holder.horizontaltxt.setText(data.get(position).flag);
    }
    @Override
    public int getItemCount() {
        return data.size();
    }
    class horizontalviewholder extends RecyclerView.ViewHolder {
        ImageView horizontalimage;
        TextView horizontaltxt;
        public horizontalviewholder(@NonNull View itemView) {
            super(itemView);
            horizontalimage = itemView.findViewById(R.id.horizontalimage);
            horizontaltxt = itemView.findViewById(R.id.horizontaltxt);

        }
    }
}
