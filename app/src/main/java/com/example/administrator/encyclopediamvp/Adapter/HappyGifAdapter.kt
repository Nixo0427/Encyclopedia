package com.example.administrator.encyclopediamvp.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import com.bumptech.glide.Glide
import com.example.administrator.encyclopediamvp.Bean.HappyGifBean
import com.example.administrator.encyclopediamvp.IListener.MainRecyClickListen
import com.example.administrator.encyclopediamvp.R
import com.example.administrator.encyclopediamvp.Util.layoutInflater
import kotlinx.android.synthetic.main.recycler_item_happygif.view.*

import java.util.ArrayList

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Adapter
 * 文件名：   HappyGifAdapter
 * 创建者:    Nixo
 * 创建时间：  2018/5/16/016-19:06
 * 描述：
 */

class HappyGifAdapter(var arrayList: ArrayList<HappyGifBean.ShowapiResBodyBean.ContentlistBean>,  var context: Context, var listen: MainRecyClickListen?) : RecyclerView.Adapter<HappyGifAdapter.ViewHolder>(), View.OnClickListener {

    override fun onClick(v: View) {

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gif = itemView.recy_happygif_img
        val time = itemView.recy_happygif_title

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HappyGifAdapter.ViewHolder {
        var v: View? = null
        if (v == null) {
            v = context.layoutInflater.inflate(R.layout.recycler_item_happygif, parent, false)
        }
        v!!.setOnClickListener(this)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: HappyGifAdapter.ViewHolder, position: Int) {
        val bean = arrayList[position]
        holder.time.text = bean.title
        Glide.with(context)
                .load(bean.img)
                .into(holder.gif)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }


}
