package com.example.administrator.encyclopediamvp.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


import com.example.administrator.encyclopediamvp.Bean.MainAdapterBean
import com.example.administrator.encyclopediamvp.IListener.MainRecyClickListen
import com.example.administrator.encyclopediamvp.R
import com.example.administrator.encyclopediamvp.Util.layoutInflater
import kotlinx.android.synthetic.main.recycler_item_main.view.*

import java.util.ArrayList

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia.adapter
 * 文件名：   MainRecyAdapter
 * 创建者:    Nixo
 * 创建时间：  2018/5/12/012-14:48
 * 描述：
 */

class MainRecyAdapter(private val context: Context, private val beans: ArrayList<MainAdapterBean>, listener: MainRecyClickListen) : RecyclerView.Adapter<MainRecyAdapter.ViewHolder>(), View.OnClickListener {

    private val listener: MainRecyClickListen? = listener

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageView = itemView.recy_img_main
        val textView = itemView.recy_title_main

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View = context.layoutInflater.inflate(R.layout.recycler_item_main, parent, false)
        v.setOnClickListener(this)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val bean = beans[position]
        holder.textView.text = bean.getmTitle()
        holder.imageView.setImageResource(bean.getmImage())
        holder.itemView.tag = bean.getmTitle()
    }

    override fun getItemCount(): Int {
        return beans.size
    }

    override fun onClick(v: View) {
        listener?.MainRecyClickListener(v.tag as String)
    }

}
