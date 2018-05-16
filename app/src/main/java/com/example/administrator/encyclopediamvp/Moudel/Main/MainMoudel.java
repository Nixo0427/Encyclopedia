package com.example.administrator.encyclopediamvp.Moudel.Main;

import com.example.administrator.encyclopediamvp.Bean.MainAdapterBean;
import com.example.administrator.encyclopediamvp.R;

import java.util.ArrayList;

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Moudel.Main
 * 文件名：   MainMoudel
 * 创建者:    Nixo
 * 创建时间：  2018/5/15/015-13:06
 * 描述：
 */

public class MainMoudel implements IMainMoudel {

    @Override
    public void IArrayList(IsetArrayList isetArrayList) {
        MainAdapterBean bean = new MainAdapterBean(R.mipmap.jiemeng,"周公解梦");
        MainAdapterBean bean1 = new MainAdapterBean(R.mipmap.express1,"物流查询");


        ArrayList<MainAdapterBean> adapterBeans = new ArrayList<>();
        adapterBeans.add(bean);
        adapterBeans.add(bean1);
        isetArrayList.setMainArrayList(adapterBeans);
    }
}
