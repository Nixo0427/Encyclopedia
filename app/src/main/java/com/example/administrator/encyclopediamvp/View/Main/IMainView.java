package com.example.administrator.encyclopediamvp.View.Main;

import com.example.administrator.encyclopediamvp.Bean.MainAdapterBean;

import java.util.ArrayList;

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.View.Main
 * 文件名：   IMainView
 * 创建者:    Nixo
 * 创建时间：  2018/5/15/015-13:02
 * 描述：
 */

public interface IMainView {

    void SetRecyclerView(ArrayList<MainAdapterBean> adapterBeans);
    void Welcome();
}
