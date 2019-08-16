package com.example.myapplication111.recycleview;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication111.R;

public class PuAdapter extends RecyclerView.Adapter<PuAdapter.LinearViewHolder> {
    private Context mContext;
    private OnItemClickListener mlistener;

    public PuAdapter(Context context, OnItemClickListener listener){
        this.mContext = context;
        this.mlistener = listener;


    }

    @Override
    public PuAdapter.LinearViewHolder onCreateViewHolder(ViewGroup parent, int position) {

        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_pu_item,parent,false));
    }

    @Override
    public void onBindViewHolder(PuAdapter.LinearViewHolder holder, final int position) {

        if(position % 2 !=0)
        {
            holder.imageView.setImageResource(R.drawable.timg1);
        }else
            holder.imageView.setImageResource(R.drawable.timg);

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

        private ImageView imageView;

        public LinearViewHolder(View itemView){
            super(itemView);
            imageView = itemView.findViewById(R.id.iv);
        }

    }
    public interface OnItemClickListener{
        void onClick(int pos);
    }
}
