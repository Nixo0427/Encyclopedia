package com.example.administrator.encyclopediamvp.Moudel.Main

import com.example.administrator.encyclopediamvp.Bean.MainAdapterBean
import com.example.administrator.encyclopediamvp.R

import java.util.ArrayList

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Moudel.Main
 * 文件名：   MainMoudel
 * 创建者:    Nixo
 * 创建时间：  2018/5/15/015-13:06
 * 描述：
 */

class MainMoudel : IMainMoudel {

    override fun IArrayList(isetArrayList: IMainMoudel.IsetArrayList) {
        val bean = MainAdapterBean(R.mipmap.jiemeng, "周公解梦")
        val bean1 = MainAdapterBean(R.mipmap.express1, "物流查询")
        val bean2 = MainAdapterBean(R.mipmap.happygif, "搞笑图片")
        val bean3 = MainAdapterBean(R.mipmap.qq, "QQ号运势")


        val adapterBeans = ArrayList<MainAdapterBean>()
        adapterBeans.add(bean)
        adapterBeans.add(bean1)
        adapterBeans.add(bean2)
        adapterBeans.add(bean3)
        isetArrayList.setMainArrayList(adapterBeans)
    }
}
