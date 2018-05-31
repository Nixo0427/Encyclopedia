package com.example.administrator.encyclopediamvp.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.example.administrator.encyclopediamvp.Bean.ZhouGongBean
import com.example.administrator.encyclopediamvp.IListener.MainRecyClickListen
import com.example.administrator.encyclopediamvp.R
import com.example.administrator.encyclopediamvp.Util.layoutInflater
import kotlinx.android.synthetic.main.recycler_item_zhougong.view.*

import java.util.ArrayList

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia.adapter
 * 文件名：   ZhouGongAdapter
 * 创建者:    Nixo
 * 创建时间：  2018/5/12/012-16:58
 * 描述：
 */

class ZhouGongAdapter(internal var context: Context, internal var arrayList: ArrayList<ZhouGongBean.ResultBean>, internal var mainRecyClickListen: MainRecyClickListen) : RecyclerView.Adapter<ZhouGongAdapter.ViewHolder>(), View.OnClickListener {

    override fun onClick(v: View) {
        val bean = v.tag as ZhouGongBean.ResultBean
        mainRecyClickListen.ZhouGongClickListener(bean.title!!, bean.des!!)
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title = itemView.recy_title_zhougong
        var rec = itemView.recy_rec_zhougong
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ZhouGongAdapter.ViewHolder {
        var v: View? = context.layoutInflater.inflate(R.layout.recycler_item_zhougong,parent,false)
        v!!.setOnClickListener(this)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ZhouGongAdapter.ViewHolder, position: Int) {
        val bean = arrayList[position]
        holder.title.text = bean.title
        holder.rec.text = bean.des
        holder.itemView.tag = bean
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }


}
