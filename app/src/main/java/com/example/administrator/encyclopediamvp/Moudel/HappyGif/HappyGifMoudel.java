package com.example.administrator.encyclopediamvp.Moudel.HappyGif;

import android.util.Log;

import com.example.administrator.encyclopediamvp.Bean.HappyGifBean;
import com.example.administrator.encyclopediamvp.IListener.ApiInterface;
import com.example.administrator.encyclopediamvp.Moudel.IBaseMoudle;
import com.example.administrator.encyclopediamvp.Util.RequestUtil;
import com.example.administrator.encyclopediamvp.Util.StaticSetting;

import java.util.ArrayList;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Moudel.HappyGif
 * 文件名：   HappyGifMoudel
 * 创建者:    Nixo
 * 创建时间：  2018/5/16/016-18:09
 * 描述：
 */

public class HappyGifMoudel implements IBaseMoudle{
    ArrayList<HappyGifBean.ShowapiResBodyBean.ContentlistBean> arrayList = new ArrayList<>();
    @Override
    public ArrayList<?> ISerchKeyData(String SerchKey) {
        synchronized (arrayList){
        RequestUtil util = new RequestUtil();
        ApiInterface api = util.getApi(StaticSetting.URL_HAPPYGIF);
        api.HappyGif(StaticSetting.APPID_HAPPYGIF,StaticSetting.KEY_HAPPYGIF,SerchKey)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<HappyGifBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        
                    }

                    @Override
                    public void onNext(HappyGifBean happyGifBean) {
                        Log.i("JSY", "onNext: 执行了");
                        for (int i = 0; i < happyGifBean.getShowapi_res_body().getContentlist().size(); i++) {
                            arrayList.add(happyGifBean.getShowapi_res_body().getContentlist().get(i));
                            Log.i("JSY", happyGifBean.getShowapi_res_body().getContentlist().get(i).getCt()+"");
                        }

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
        Log.i("JSY", "外面执行了");
        return arrayList;
        }
    }

    @Override
    public ArrayList<Object> INoSerchKeyData() {
        return null;
    }
}
