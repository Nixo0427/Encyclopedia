package com.example.administrator.encyclopediamvp.Presenter;

import com.example.administrator.encyclopediamvp.Bean.MainAdapterBean;
import com.example.administrator.encyclopediamvp.Moudel.Main.IMainMoudel;
import com.example.administrator.encyclopediamvp.Moudel.Main.MainMoudel;
import com.example.administrator.encyclopediamvp.View.Main.IMainView;

import java.util.ArrayList;

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Presenter
 * 文件名：   MainPresenter
 * 创建者:    Nixo
 * 创建时间：  2018/5/15/015-13:22
 * 描述：
 */

public class MainPresenter {

    IMainView mainView;
    IMainMoudel mainMoudel;


    public MainPresenter(IMainView mainView){
        mainMoudel = new MainMoudel();
        this.mainView = mainView;
    }


    public void present(){
        mainView.Welcome();
        mainMoudel.IArrayList(new IMainMoudel.IsetArrayList() {
            @Override
            public void setMainArrayList(ArrayList<MainAdapterBean> beans) {
                mainView.SetRecyclerView(beans);
            }
        });

    }
}
