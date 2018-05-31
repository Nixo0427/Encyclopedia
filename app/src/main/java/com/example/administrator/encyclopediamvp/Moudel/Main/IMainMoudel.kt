package com.example.administrator.encyclopediamvp.Moudel.Main

import com.example.administrator.encyclopediamvp.Bean.MainAdapterBean

import java.util.ArrayList

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Moudel
 * 文件名：   IMainMoudel
 * 创建者:    Nixo
 * 创建时间：  2018/5/15/015-13:05
 * 描述：
 */

interface IMainMoudel {

    fun IArrayList(isetArrayList: IsetArrayList)

    interface IsetArrayList {
        fun setMainArrayList(beans: ArrayList<MainAdapterBean>)
    }


}
