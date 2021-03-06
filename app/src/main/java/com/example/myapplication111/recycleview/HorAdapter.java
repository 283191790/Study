package com.example.myapplication111.recycleview;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication111.R;

public class HorAdapter extends RecyclerView.Adapter<HorAdapter.LinearViewHolder> {
    private Context mContext;
    private OnItemClickListener mlistener;

    public HorAdapter(Context context, OnItemClickListener listener){
        this.mContext = context;
        this.mlistener = listener;


    }

    @Override
    public HorAdapter.LinearViewHolder onCreateViewHolder(ViewGroup parent, int position) {

        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_hor_item,parent,false));
    }

    @Override
    public void onBindViewHolder(HorAdapter.LinearViewHolder holder, final int position) {

        holder.textView.setText("鸡你太美");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mlistener.onClick(position);
//                Toast.makeText(mContext,"Click..."+position,Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return 30;
    }
    class LinearViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;

        public LinearViewHolder(View itemView){
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
        }

    }
    public interface OnItemClickListener{
        void onClick(int pos);
    }
}
