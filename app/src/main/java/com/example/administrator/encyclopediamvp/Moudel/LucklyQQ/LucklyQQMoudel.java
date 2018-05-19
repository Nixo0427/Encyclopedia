package com.example.administrator.encyclopediamvp.Moudel.LucklyQQ;

import android.util.Log;

import com.example.administrator.encyclopediamvp.Bean.LuckyQQBean;
import com.example.administrator.encyclopediamvp.IListener.ApiInterface;
import com.example.administrator.encyclopediamvp.Moudel.IBaseMoudle;
import com.example.administrator.encyclopediamvp.Util.RequestUtil;
import com.example.administrator.encyclopediamvp.Util.StaticSetting;

import java.util.ArrayList;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Nixo on 2018/5/17.
 */

public class LucklyQQMoudel implements ILucklyQQMoudel{

        LuckyQQBean qqBean = new LuckyQQBean();


    @Override
    public LuckyQQBean getLuckQQBean(String QQ) {
        synchronized (qqBean){
        RequestUtil util = new RequestUtil();
        if(qqBean.getShowapi_res_body() == null){
        ApiInterface apiInterface = util.getApi(StaticSetting.URL_HAPPYGIF);

        apiInterface.LuckQQ(QQ,StaticSetting.APPID_HAPPYGIF,StaticSetting.KEY_HAPPYGIF)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<LuckyQQBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(LuckyQQBean bean) {
                           qqBean = bean;
                        Log.i("JSY", "onNext: "+qqBean.getShowapi_res_body().getDesc());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });


      }
      if(qqBean.getShowapi_res_body() == null){
          Log.i("JSY", "ReturnBoby ==  null ");
      }else{
          Log.i("JSY", "ReturnBoby =="+qqBean.getShowapi_res_body().getDesc());
      }

        return qqBean;
      }
    }


//    qq=1649883744&showapi_appid=65197&showapi_sign=7409d8eab2354fb89b030277fa6977a5
}
