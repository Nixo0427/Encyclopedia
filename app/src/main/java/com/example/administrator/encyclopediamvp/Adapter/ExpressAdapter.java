package com.example.administrator.encyclopediamvp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.administrator.encyclopediamvp.Bean.ExpressBean;
import com.example.administrator.encyclopediamvp.R;

import java.util.ArrayList;

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia.adapter
 * 文件名：   ExpressAdapter
 * 创建者:    Nixo
 * 创建时间：  2018/5/13/013-14:45
 * 描述：
 */

public class ExpressAdapter extends RecyclerView.Adapter<ExpressAdapter.ViewHolder> {

    Context context ;
    ArrayList<ExpressBean.ResultBean.ListBean> arrayList ;

    public ExpressAdapter(Context context , ArrayList<ExpressBean.ResultBean.ListBean> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = null;
        if(v == null){
            v = LayoutInflater.from(context).inflate(R.layout.recycler_item_express , parent , false);
        }
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ExpressBean.ResultBean.ListBean bean = arrayList.get(position);
        Log.i("BaiKeLog", "adapter:"+arrayList.size());
        holder.desc.setText(bean.getStatus());
        holder.time.setText(bean.getTime());
        if(position == 0){
            holder.icon.setImageResource(R.mipmap.expres2);
        }else{
            holder.icon.setImageResource(R.mipmap.expres);
        }

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView icon;
        TextView desc;
        TextView time;

        public ViewHolder(View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.express_icon);
            desc = itemView.findViewById(R.id.desc);
            time = itemView.findViewById(R.id.time);
        }
    }
}
