package com.example.administrator.encyclopediamvp.Presenter

import com.example.administrator.encyclopediamvp.Bean.HappyGifBean
import com.example.administrator.encyclopediamvp.Moudel.HappyGif.HappyGifMoudel
import com.example.administrator.encyclopediamvp.Moudel.IBaseMoudle
import com.example.administrator.encyclopediamvp.View.IBaseView

import java.util.ArrayList

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import io.reactivex.functions.Consumer

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Presenter
 * 文件名：   HappyGif
 * 创建者:    Nixo
 * 创建时间：  2018/5/16/016-18:14
 * 描述：
 */

class HappyGifPresenter(internal var Iview: IBaseView) {
    var Imoudel: IBaseMoudle  = HappyGifMoudel()

    fun SetPage(page2: Int) {
        val page = page2.toString()
        val observable = Imoudel.ISerchKeyData(page) as Observable<HappyGifBean>
        observable.subscribe(object : Observer<HappyGifBean> {
            override fun onSubscribe(d: Disposable) {

            }
            override fun onNext(happyGifBean: HappyGifBean) {
                var happyGifBeans = ArrayList<HappyGifBean.ShowapiResBodyBean.ContentlistBean>()
                for (item in happyGifBean.showapi_res_body!!.contentlist!!){ happyGifBeans.add(item)}
                Iview.SetRecy(happyGifBeans)
            }

            override fun onError(e: Throwable) {

            }

            override fun onComplete() {

            }
        })
    }

}


