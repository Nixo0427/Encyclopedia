package com.example.administrator.encyclopediamvp.Util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia.util
 * 文件名：   SharedUtil
 * 创建者:    Nixo
 * 创建时间：  2018/5/12/012-13:53
 * 描述：     SharedPreferecences封装的工具类

 */

public class SharedUtil {

    public static void putString(Context context,String key,String value){
       SharedPreferences sp  = context.getSharedPreferences(StaticSetting.SHARED_NAME,Context.MODE_PRIVATE);
       sp.edit().putString(key,value);
    }

    public static String getString(Context context,String key , String defValue){
        SharedPreferences sp = context.getSharedPreferences(StaticSetting.SHARED_NAME,Context.MODE_PRIVATE);
        return sp.getString(key,defValue);
    }

    public static void putInt(Context context,String key,int value){
        SharedPreferences sp  = context.getSharedPreferences(StaticSetting.SHARED_NAME,Context.MODE_PRIVATE);
        sp.edit().putInt(key,value);
    }

    public static int getInt(Context context,String key , int  defValue){
        SharedPreferences sp = context.getSharedPreferences(StaticSetting.SHARED_NAME,Context.MODE_PRIVATE);
        return sp.getInt(key,defValue);
    }

    public static void putBoolean(Context context,String key,boolean value){
        SharedPreferences sp  = context.getSharedPreferences(StaticSetting.SHARED_NAME,Context.MODE_PRIVATE);
        sp.edit().putBoolean(key,value);
    }

    public static Boolean getInt(Context context,String key , Boolean  defValue){
        SharedPreferences sp = context.getSharedPreferences(StaticSetting.SHARED_NAME,Context.MODE_PRIVATE);
        return sp.getBoolean(key,defValue);
    }

}
