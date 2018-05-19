package com.example.administrator.encyclopediamvp.Presenter;

import com.example.administrator.encyclopediamvp.Bean.LuckyQQBean;
import com.example.administrator.encyclopediamvp.Moudel.IBaseMoudle;
import com.example.administrator.encyclopediamvp.Moudel.LucklyQQ.ILucklyQQMoudel;
import com.example.administrator.encyclopediamvp.Moudel.LucklyQQ.LucklyQQMoudel;
import com.example.administrator.encyclopediamvp.View.IBaseView;
import com.example.administrator.encyclopediamvp.View.LucklyQQ.ILucklyQQView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Nixo on 2018/5/17.
 */

public class LucklyQQPresenter {

    ILucklyQQView Iview;
    ILucklyQQMoudel moudle;
    LuckyQQBean bean;

    public LucklyQQPresenter(ILucklyQQView iview) {
        Iview = iview;
        moudle = new LucklyQQMoudel();
    }

    public void SetResult(String QQ){
        bean = moudle.getLuckQQBean(QQ);
        if(bean.getShowapi_res_body() != null){
            Iview.setData(bean);
        }
    }



}
