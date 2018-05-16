package com.example.administrator.encyclopediamvp.Moudel.ZhouGong;

import com.example.administrator.encyclopediamvp.Bean.ZhouGongBean;
import com.example.administrator.encyclopediamvp.IListener.ApiInterface;
import com.example.administrator.encyclopediamvp.Util.RequestUtil;
import com.example.administrator.encyclopediamvp.Util.StaticSetting;

import java.util.ArrayList;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Moudel.ZhouGong
 * 文件名：   ZhouGongMoudle
 * 创建者:    Nixo
 * 创建时间：  2018/5/15/015-19:53
 * 描述：
 */

public class ZhouGongMoudle implements IZhouGongMoudle {
    ArrayList<ZhouGongBean.ResultBean> arrayList ;
    @Override
    public ArrayList<ZhouGongBean.ResultBean> getArrayList(String SerchKey) {
        arrayList = new ArrayList<>();
        RequestUtil u = new RequestUtil();
        final ApiInterface apiInterface = u.getApi(StaticSetting.URL_ZHOUGONG);
        apiInterface.ZhouGong(StaticSetting.KEY_ZHOUGONG,SerchKey)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<ZhouGongBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ZhouGongBean zhouGongBean) {
                        for (int i = 0; i < zhouGongBean.getResult().size(); i++) {
                            arrayList.add(zhouGongBean.getResult().get(i));
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
        return arrayList;
    }
}
