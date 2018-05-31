package com.example.administrator.encyclopediamvp.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


import com.example.administrator.encyclopediamvp.Bean.ExpressBean
import com.example.administrator.encyclopediamvp.R
import com.example.administrator.encyclopediamvp.Util.layoutInflater
import kotlinx.android.synthetic.main.recycler_item_express.view.*

import java.util.ArrayList

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia.adapter
 * 文件名：   ExpressAdapter
 * 创建者:    Nixo
 * 创建时间：  2018/5/13/013-14:45
 * 描述：
 */

class ExpressAdapter(var context: Context, var arrayList: ArrayList<ExpressBean.ResultBean.ListBean>) : RecyclerView.Adapter<ExpressAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var v = context.layoutInflater.inflate(R.layout.recycler_item_express,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val bean = arrayList[position]
        holder.desc.text = bean.status
        holder.time.text = bean.time
        if (position == 0) {
            holder.icon.setImageResource(R.mipmap.expres2)
        } else {
            holder.icon.setImageResource(R.mipmap.expres)
        }

    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

       var icon = itemView.express_icon
       var desc = itemView.desc
       var time = itemView.time

    }
}
