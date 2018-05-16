package com.example.administrator.encyclopediamvp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.encyclopediamvp.Bean.HappyGifBean;
import com.example.administrator.encyclopediamvp.IListener.MainRecyClickListen;
import com.example.administrator.encyclopediamvp.R;

import java.util.ArrayList;

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Adapter
 * 文件名：   HappyGifAdapter
 * 创建者:    Nixo
 * 创建时间：  2018/5/16/016-19:06
 * 描述：
 */

public class HappyGifAdapter extends RecyclerView.Adapter<HappyGifAdapter.ViewHolder> implements View.OnClickListener{

    ArrayList<HappyGifBean.ShowapiResBodyBean.ContentlistBean>arrayList;
    Context context;
    MainRecyClickListen listen;

    public HappyGifAdapter(ArrayList<HappyGifBean.ShowapiResBodyBean.ContentlistBean> arrayList, Context context, MainRecyClickListen listen) {
        this.arrayList = arrayList;
        this.context = context;
        this.listen = listen;
    }

    @Override
    public void onClick(View v) {

    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView gif ;
        TextView time ;
        public ViewHolder(View itemView) {
            super(itemView);
            gif = itemView.findViewById(R.id.recy_happygif_img);
            time = itemView.findViewById(R.id.recy_happygif_title);
        }
    }

    @NonNull
    @Override
    public HappyGifAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = null;
        if(v == null){
            v = LayoutInflater.from(context).inflate(R.layout.recycler_item_happygif,parent,false);
        }
        v.setOnClickListener(this);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull HappyGifAdapter.ViewHolder holder, int position) {
        HappyGifBean.ShowapiResBodyBean.ContentlistBean bean = arrayList.get(position);
        holder.time.setText(bean.getTitle());
        Glide.with(context)
                .load(bean.getImg())
                .into(holder.gif);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


}
