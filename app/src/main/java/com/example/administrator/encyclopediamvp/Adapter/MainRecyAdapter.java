package com.example.administrator.encyclopediamvp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.administrator.encyclopediamvp.Bean.MainAdapterBean;
import com.example.administrator.encyclopediamvp.IListener.MainRecyClickListen;
import com.example.administrator.encyclopediamvp.R;

import java.util.ArrayList;

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia.adapter
 * 文件名：   MainRecyAdapter
 * 创建者:    Nixo
 * 创建时间：  2018/5/12/012-14:48
 * 描述：
 */

public class MainRecyAdapter extends RecyclerView.Adapter<MainRecyAdapter.ViewHolder> implements View.OnClickListener{

    private Context context ;
    private ArrayList<MainAdapterBean> beans;
    private MainRecyClickListen listener = null;

    public MainRecyAdapter(Context context , ArrayList<MainAdapterBean> beans , MainRecyClickListen listener){
        this.beans = beans;
        this.context = context;
        this.listener = listener;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.recy_img_main);
            textView = itemView.findViewById(R.id.recy_title_main);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = null;
        if(v == null){
            v = LayoutInflater.from(context).inflate(R.layout.recycler_item_main,parent,false);
        }
        v.setOnClickListener(this);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MainAdapterBean bean = beans.get(position);
        holder.textView.setText(bean.getmTitle());
        holder.imageView.setImageResource(bean.getmImage());
        holder.itemView.setTag(bean.getmTitle());
    }

    @Override
    public int getItemCount() {
        return beans.size();
    }

    @Override
    public void onClick(View v) {
        listener.MainRecyClickListener((String) v.getTag());
    }

}
