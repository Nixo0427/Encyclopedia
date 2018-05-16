package com.example.administrator.encyclopediamvp.Presenter;

import com.example.administrator.encyclopediamvp.Bean.HappyGifBean;
import com.example.administrator.encyclopediamvp.Moudel.HappyGif.HappyGifMoudel;
import com.example.administrator.encyclopediamvp.Moudel.IBaseMoudle;
import com.example.administrator.encyclopediamvp.View.IBaseView;

import java.util.ArrayList;

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Presenter
 * 文件名：   HappyGif
 * 创建者:    Nixo
 * 创建时间：  2018/5/16/016-18:14
 * 描述：
 */

public class HappyGifPresenter {

    IBaseView Iview;
    IBaseMoudle Imoudel;
    ArrayList<HappyGifBean.ShowapiResBodyBean.ContentlistBean> arrayList = new ArrayList<>();

    public HappyGifPresenter(IBaseView Iview){
        this.Iview = Iview;
        Imoudel = new HappyGifMoudel();
    }


    public void SetPage(int page2){
        String page = String.valueOf(page2);
        arrayList = (ArrayList<HappyGifBean.ShowapiResBodyBean.ContentlistBean>) Imoudel.ISerchKeyData(page);
        if(arrayList.size() == 0){
            Iview.Fail("发生未知错误");
        }else{
            Iview.SetRecy(arrayList);
        }

    }

}
