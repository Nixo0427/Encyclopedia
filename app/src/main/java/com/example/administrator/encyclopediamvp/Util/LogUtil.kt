package com.example.administrator.encyclopediamvp.Util

import android.util.Log

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia.util
 * 文件名：   LogUtil
 * 创建者:    Nixo
 * 创建时间：  2018/5/12/012-14:23
 * 描述：      Log封装类
 */

class LogUtil {

    fun i(info: String) {
        Log.i(StaticSetting.LOG_TAG, info)
    }


    fun w(warring: String) {
        Log.w(StaticSetting.LOG_TAG, warring)
    }


    fun e(error: String) {
        Log.e(StaticSetting.LOG_TAG, error)
    }

}
