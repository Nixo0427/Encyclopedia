package com.example.administrator.encyclopediamvp.Presenter

import com.example.administrator.encyclopediamvp.Bean.ZhouGongBean
import com.example.administrator.encyclopediamvp.Moudel.IBaseMoudle

import com.example.administrator.encyclopediamvp.Moudel.ZhouGong.ZhouGongMoudle
import com.example.administrator.encyclopediamvp.View.Express.IExpressView
import com.example.administrator.encyclopediamvp.View.ZhouGong.IZhouGongView

import java.util.ArrayList

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Presenter
 * 文件名：   ZhouGongPresenter
 * 创建者:    Nixo
 * 创建时间：  2018/5/15/015-19:57
 * 描述：
 */

class ZhouGongPresenter(internal var view: IZhouGongView) {


    internal var moudle: IBaseMoudle
    internal var arrayList: ArrayList<ZhouGongBean.ResultBean> = ArrayList()

    init {
        moudle = ZhouGongMoudle()
    }

    fun SetRecy2(serchkey: String) {
        val observable = moudle.ISerchKeyData(serchkey) as Observable<ZhouGongBean>?
        observable!!.subscribe(object : Observer<ZhouGongBean> {
            override fun onSubscribe(d: Disposable) {}
            override fun onNext(zhouGongBean: ZhouGongBean) {
                for (item in zhouGongBean.result!!){ arrayList.add(item)}
                view.SetRecy(arrayList!!)
            }
            override fun onError(e: Throwable) {}
            override fun onComplete() {}
        })
    }
}
