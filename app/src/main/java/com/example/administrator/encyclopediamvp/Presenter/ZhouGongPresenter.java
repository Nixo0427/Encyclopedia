package com.example.administrator.encyclopediamvp.Presenter;

import com.example.administrator.encyclopediamvp.Bean.ZhouGongBean;
import com.example.administrator.encyclopediamvp.Moudel.ZhouGong.IZhouGongMoudle;
import com.example.administrator.encyclopediamvp.Moudel.ZhouGong.ZhouGongMoudle;
import com.example.administrator.encyclopediamvp.View.Express.IExpressView;
import com.example.administrator.encyclopediamvp.View.ZhouGong.IZhouGongView;

import java.util.ArrayList;

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Presenter
 * 文件名：   ZhouGongPresenter
 * 创建者:    Nixo
 * 创建时间：  2018/5/15/015-19:57
 * 描述：
 */

public class ZhouGongPresenter {


    IZhouGongMoudle moudle;
    ArrayList<ZhouGongBean.ResultBean> arrayList;
    IZhouGongView view;
    public ZhouGongPresenter(IZhouGongView iExpressView) {
        this.view = iExpressView;
        moudle = new  ZhouGongMoudle();
    }

    public void SetRecy2(String serchkey){
        arrayList = moudle.getArrayList(serchkey);
        view.SetRecy(arrayList);
    }


}
