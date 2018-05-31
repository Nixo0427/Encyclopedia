package com.example.administrator.encyclopediamvp.Moudel.LucklyQQ

import android.util.Log

import com.example.administrator.encyclopediamvp.Bean.LuckyQQBean
import com.example.administrator.encyclopediamvp.IListener.ApiInterface
import com.example.administrator.encyclopediamvp.Moudel.IBaseMoudle
import com.example.administrator.encyclopediamvp.Util.RequestUtil
import com.example.administrator.encyclopediamvp.Util.StaticSetting

import java.util.ArrayList
import java.util.HashSet

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers

/**
 * Created by Nixo on 2018/5/17.
 */

class LucklyQQMoudel : ILucklyQQMoudel {

    override fun getLuckQQBean(QQ: String): Observable<LuckyQQBean> {

        val util = RequestUtil()
        val apiInterface = util.getApi(StaticSetting.URL_HAPPYGIF)
        return apiInterface.LuckQQ(QQ, StaticSetting.APPID_HAPPYGIF, StaticSetting.KEY_HAPPYGIF)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())


        //    qq=1649883744&showapi_appid=65197&showapi_sign=7409d8eab2354fb89b030277fa6977a5

    }


}
