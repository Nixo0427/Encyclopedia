package com.example.administrator.encyclopediamvp.Moudel.ZhouGong

import com.example.administrator.encyclopediamvp.Bean.ZhouGongBean
import com.example.administrator.encyclopediamvp.IListener.ApiInterface
import com.example.administrator.encyclopediamvp.Moudel.IBaseMoudle
import com.example.administrator.encyclopediamvp.Util.RequestUtil
import com.example.administrator.encyclopediamvp.Util.StaticSetting

import java.util.ArrayList

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Moudel.ZhouGong
 * 文件名：   ZhouGongMoudle
 * 创建者:    Nixo
 * 创建时间：  2018/5/15/015-19:53
 * 描述：
 */
//
//public void onNext(ZhouGongBean zhouGongBean) {
//
//        }
//        }

class ZhouGongMoudle : IBaseMoudle {

    var arrayList: ArrayList<ZhouGongBean.ResultBean>? = null

    override fun ISerchKeyData(SerchKey: String): Observable<*>? {
        arrayList = ArrayList<ZhouGongBean.ResultBean>()
        val u = RequestUtil()
        val apiInterface = u.getApi(StaticSetting.URL_ZHOUGONG)
        return apiInterface.ZhouGong(StaticSetting.KEY_ZHOUGONG, SerchKey)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
    }

    override fun INoSerchKeyData(): Observable<*>? {
        return null
    }
}
