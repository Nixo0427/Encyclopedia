package com.example.administrator.encyclopediamvp.Bean;

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia.bean
 * 文件名：   MainAdapterBean
 * 创建者:    Nixo
 * 创建时间：  2018/5/12/012-14:50
 * 描述：
 */

public class MainAdapterBean {

    private int mImage;
    private String mTitle;

    public MainAdapterBean(int mImage, String mTitle) {
        this.mImage = mImage;
        this.mTitle = mTitle;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }




}
