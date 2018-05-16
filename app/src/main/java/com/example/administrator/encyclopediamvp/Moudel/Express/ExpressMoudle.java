package com.example.administrator.encyclopediamvp.Moudel.Express;

import android.util.Log;

import com.example.administrator.encyclopediamvp.Bean.ExpressBean;
import com.example.administrator.encyclopediamvp.IListener.ApiInterface;
import com.example.administrator.encyclopediamvp.Util.RequestUtil;
import com.example.administrator.encyclopediamvp.Util.StaticSetting;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Moudel.Express
 * 文件名：   Express
 * 创建者:    Nixo
 * 创建时间：  2018/5/15/015-15:36
 * 描述：
 */

public class  ExpressMoudle implements IExpressMoudle {

    ArrayList<ExpressBean.ResultBean.ListBean> beans;
    String error ;

    @Override
    public ArrayList<ExpressBean.ResultBean.ListBean> IExpressData(String SerchKey) {
        beans = new ArrayList<>() ;
        Log.i("JSY", SerchKey);
        RequestUtil requestUtil = new RequestUtil();
        ApiInterface apiInterface = requestUtil.getApi(StaticSetting.URL_EXPRESS);
        Log.i("JSY","执行了IExpressData");
        apiInterface.Express(StaticSetting.KEY_EXPRESS,"auto",SerchKey)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<ExpressBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ExpressBean expressBean) {
                        for (int i = 0; i < expressBean.getResult().getList().size(); i++) {
                            beans.add(expressBean.getResult().getList().get(i));
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

            return beans;
    }




}
