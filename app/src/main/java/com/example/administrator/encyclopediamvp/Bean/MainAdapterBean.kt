package com.example.administrator.encyclopediamvp.Bean

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia.bean
 * 文件名：   MainAdapterBean
 * 创建者:    Nixo
 * 创建时间：  2018/5/12/012-14:50
 * 描述：
 */

class MainAdapterBean(private var mImage: Int, private var mTitle: String?) {

    fun getmImage(): Int {
        return mImage
    }

    fun setmImage(mImage: Int) {
        this.mImage = mImage
    }

    fun getmTitle(): String? {
        return mTitle
    }

    fun setmTitle(mTitle: String) {
        this.mTitle = mTitle
    }


}
