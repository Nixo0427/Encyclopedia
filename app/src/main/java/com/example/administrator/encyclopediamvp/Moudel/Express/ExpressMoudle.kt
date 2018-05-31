package com.example.administrator.encyclopediamvp.Moudel.Express

import android.util.Log

import com.example.administrator.encyclopediamvp.Bean.ExpressBean
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
 * 包名 ：    com.example.administrator.encyclopediamvp.Moudel.Express
 * 文件名：   Express
 * 创建者:    Nixo
 * 创建时间：  2018/5/15/015-15:36
 * 描述：
 */

class ExpressMoudle : IBaseMoudle {

    var beans: ArrayList<ExpressBean.ResultBean.ListBean>? = null



    override fun ISerchKeyData(SerchKey: String): Observable<*>? {
        beans = ArrayList<ExpressBean.ResultBean.ListBean>()

        val requestUtil = RequestUtil()
        val apiInterface = requestUtil.getApi(StaticSetting.URL_EXPRESS)
        return apiInterface.Express(StaticSetting.KEY_EXPRESS, "auto", SerchKey)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
    }

    override fun INoSerchKeyData(): Observable<*>? {
        return null
    }
}