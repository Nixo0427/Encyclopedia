package com.example.administrator.encyclopedia.util;

import android.util.Log;

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia.util
 * 文件名：   LogUtil
 * 创建者:    Nixo
 * 创建时间：  2018/5/12/012-14:23
 * 描述：      Log封装类
 */

public class LogUtil {

    public void i(String info){
        Log.i(StaticSetting.LOG_TAG, info);
    }


    public void w(String warring){
        Log.w(StaticSetting.LOG_TAG, warring);
    }


    public void e(String error){
        Log.e(StaticSetting.LOG_TAG,error);
    }

}
