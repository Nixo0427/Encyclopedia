package com.example.administrator.encyclopediamvp.Util;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia.util
 * 文件名：   WindowStatic
 * 创建者:    Nixo
 * 创建时间：  2018/5/13/013-14:03
 * 描述：
 */

public class WindowStatic {

    //关闭输入法
    public void downInputWindows(Activity activity,View view){
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        inputMethodManager.showSoftInput(view,InputMethodManager.SHOW_FORCED);
    }

}
