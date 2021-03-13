package com.example.messenger.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.messenger.R;
import com.example.messenger.models.toplistmodel;

import java.util.ArrayList;
import java.util.List;

public class toplistadapter extends RecyclerView.Adapter<toplistadapter.myViewHolder> {

    List<toplistmodel>list;
    public toplistadapter(List<toplistmodel> list) {
        this.list = list;
    }
    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topmenulist_row,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.categorie.setText(list.get(position).getCategoryName());

        if (list.get(position).getSelect()) {

            holder.linearLayout.setBackgroundResource(R.drawable.custom_toplistbackground);
        }
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    public class myViewHolder extends RecyclerView.ViewHolder{
        TextView categorie;
        LinearLayout linearLayout;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            categorie = itemView.findViewById(R.id.ChatCategorie);
            linearLayout = itemView.findViewById(R.id.categorieBackground);
        }
    }
}
