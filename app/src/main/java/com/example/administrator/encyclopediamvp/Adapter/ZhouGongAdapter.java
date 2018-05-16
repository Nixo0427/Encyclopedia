package com.example.administrator.encyclopediamvp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.encyclopediamvp.Bean.ZhouGongBean;
import com.example.administrator.encyclopediamvp.IListener.MainRecyClickListen;
import com.example.administrator.encyclopediamvp.R;

import java.util.ArrayList;

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia.adapter
 * 文件名：   ZhouGongAdapter
 * 创建者:    Nixo
 * 创建时间：  2018/5/12/012-16:58
 * 描述：
 */

public class ZhouGongAdapter extends RecyclerView.Adapter<ZhouGongAdapter.ViewHolder> implements View.OnClickListener{

    ArrayList<ZhouGongBean.ResultBean> arrayList;
    Context context;
    MainRecyClickListen mainRecyClickListen;

    public ZhouGongAdapter(Context context , ArrayList<ZhouGongBean.ResultBean> arrayList , MainRecyClickListen mainRecyClickListen){
        this.context = context;
        this.arrayList = arrayList;
        this.mainRecyClickListen = mainRecyClickListen;
    }

    @Override
    public void onClick(View v) {
        ZhouGongBean.ResultBean bean = (ZhouGongBean.ResultBean) v.getTag();

        mainRecyClickListen.ZhouGongClickListener(bean.getTitle(),bean.getDes());
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView rec;
        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.recy_title_zhougong);
            rec = itemView.findViewById(R.id.recy_rec_zhougong);
        }
    }

    @NonNull
    @Override
    public ZhouGongAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = null;
        if(v == null){
            v = LayoutInflater.from(context).inflate(R.layout.recycler_item_zhougong,parent,false);
        }
        v.setOnClickListener(this);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ZhouGongAdapter.ViewHolder holder, int position) {
        ZhouGongBean.ResultBean bean = arrayList.get(position);
        holder.title.setText(bean.getTitle());
        holder.rec.setText(bean.getDes());
        holder.itemView.setTag(bean);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


}
