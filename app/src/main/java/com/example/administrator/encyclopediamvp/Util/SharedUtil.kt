package com.example.administrator.encyclopediamvp.Util

import android.content.Context
import android.content.SharedPreferences

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia.util
 * 文件名：   SharedUtil
 * 创建者:    Nixo
 * 创建时间：  2018/5/12/012-13:53
 * 描述：     SharedPreferecences封装的工具类
 *
 */

object SharedUtil {

    fun putString(context: Context, key: String, value: String) {
        val sp = context.getSharedPreferences(StaticSetting.SHARED_NAME, Context.MODE_PRIVATE)
        sp.edit().putString(key, value)
    }

    fun getString(context: Context, key: String, defValue: String): String? {
        val sp = context.getSharedPreferences(StaticSetting.SHARED_NAME, Context.MODE_PRIVATE)
        return sp.getString(key, defValue)
    }

    fun putInt(context: Context, key: String, value: Int) {
        val sp = context.getSharedPreferences(StaticSetting.SHARED_NAME, Context.MODE_PRIVATE)
        sp.edit().putInt(key, value)
    }

    fun getInt(context: Context, key: String, defValue: Int): Int {
        val sp = context.getSharedPreferences(StaticSetting.SHARED_NAME, Context.MODE_PRIVATE)
        return sp.getInt(key, defValue)
    }

    fun putBoolean(context: Context, key: String, value: Boolean) {
        val sp = context.getSharedPreferences(StaticSetting.SHARED_NAME, Context.MODE_PRIVATE)
        sp.edit().putBoolean(key, value)
    }

    fun getInt(context: Context, key: String, defValue: Boolean?): Boolean {
        val sp = context.getSharedPreferences(StaticSetting.SHARED_NAME, Context.MODE_PRIVATE)
        return sp.getBoolean(key, defValue!!)
    }

}
