package com.example.administrator.encyclopediamvp.Moudel.HappyGif

import com.example.administrator.encyclopediamvp.IListener.ApiInterface
import com.example.administrator.encyclopediamvp.Moudel.IBaseMoudle
import com.example.administrator.encyclopediamvp.Util.RequestUtil
import com.example.administrator.encyclopediamvp.Util.StaticSetting

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Moudel.HappyGif
 * 文件名：   HappyGifMoudel
 * 创建者:    Nixo
 * 创建时间：  2018/5/16/016-18:09
 * 描述：
 */

class HappyGifMoudel : IBaseMoudle {

    override fun ISerchKeyData(SerchKey: String): Observable<*> {
        val util = RequestUtil()
        val api = util.getApi(StaticSetting.URL_HAPPYGIF)
        return api.HappyGif(StaticSetting.APPID_HAPPYGIF, StaticSetting.KEY_HAPPYGIF, SerchKey)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
    }

    override fun INoSerchKeyData(): Observable<*>? {
        return null
    }
}
