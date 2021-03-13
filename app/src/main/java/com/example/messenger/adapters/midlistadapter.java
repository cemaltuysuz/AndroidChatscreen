package com.example.messenger.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.messenger.R;
import com.example.messenger.models.midlistmodel;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class midlistadapter extends RecyclerView.Adapter<midlistadapter.myViewHolder> {

    List<midlistmodel>list;

    public midlistadapter(List<midlistmodel> list) {
        this.list = list;
    }
    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.midlist_row,parent,false);
        return new myViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.username.setText(list.get(position).getUsername());
        holder.imageView.setImageResource(list.get(position).getImgResourceID());
        holder.message.setText(list.get(position).getMessage());
        holder.time.setText(list.get(position).getMsgTime());
        if (list.get(position).getActive()){
            holder.active.setVisibility(View.VISIBLE);
        }
        else{
            holder.active.setVisibility(View.GONE);
        }
        if (Integer.valueOf(list.get(position).getMsgNum())>0){
            holder.msgNum.setText(list.get(position).getMsgNum());
        }
        else{
            holder.msgNum.setVisibility(View.GONE);
        }
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageView;
        View active;
        TextView username,time,message,msgNum;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.ppImage_row);
            active = itemView.findViewById(R.id.active_row);
            username = itemView.findViewById(R.id.username_row);
            time = itemView.findViewById(R.id.messageTime_row);
            message = itemView.findViewById(R.id.message_row);
            msgNum = itemView.findViewById(R.id.messageNum_row);
        }
    }
}
