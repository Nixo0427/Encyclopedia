package com.example.administrator.encyclopediamvp.View

import com.example.administrator.encyclopediamvp.Bean.ExpressBean

import java.util.ArrayList

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.View
 * 文件名：   IBaseView
 * 创建者:    Nixo
 * 创建时间：  2018/5/16/016-18:16
 * 描述：
 */

interface IBaseView {

    //添加RecyclerView数据
    fun SetRecy(arrayList: ArrayList<*>)


    fun Success()

    fun Fail(error: String)

}
