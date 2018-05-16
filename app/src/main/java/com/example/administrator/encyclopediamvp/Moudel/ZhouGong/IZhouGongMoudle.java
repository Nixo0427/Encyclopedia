package com.example.administrator.encyclopediamvp.Moudel.ZhouGong;

import com.example.administrator.encyclopediamvp.Bean.ZhouGongBean;

import java.util.ArrayList;

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Moudel.ZhouGong
 * 文件名：   IZhouGongMoudle
 * 创建者:    Nixo
 * 创建时间：  2018/5/15/015-19:53
 * 描述：
 */

public interface IZhouGongMoudle {
    ArrayList<ZhouGongBean.ResultBean> getArrayList(String SerchKey);
}
