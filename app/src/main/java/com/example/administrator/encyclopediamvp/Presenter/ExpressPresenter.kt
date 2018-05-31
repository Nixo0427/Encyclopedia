package com.example.administrator.encyclopediamvp.Presenter

import android.util.Log

import com.example.administrator.encyclopediamvp.Bean.ExpressBean
import com.example.administrator.encyclopediamvp.IListener.ApiInterface
import com.example.administrator.encyclopediamvp.Moudel.Express.ExpressMoudle

import com.example.administrator.encyclopediamvp.Moudel.IBaseMoudle
import com.example.administrator.encyclopediamvp.Util.RequestUtil
import com.example.administrator.encyclopediamvp.Util.StaticSetting
import com.example.administrator.encyclopediamvp.View.Express.IExpressView

import java.util.ArrayList

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Presenter
 * 文件名：   ExpressPresenter
 * 创建者:    Nixo
 * 创建时间：  2018/5/15/015-15:38
 * 描述：
 */

class ExpressPresenter(internal var Iview: IExpressView) {

    var moudle = ExpressMoudle()
    var arrayList : ArrayList<ExpressBean.ResultBean.ListBean> = ArrayList()

    fun SetData(serchKey: String) {
        val observer = moudle.ISerchKeyData(serchKey) as Observable<ExpressBean>
        observer.subscribe(object : Observer<ExpressBean> {
            override fun onSubscribe(d: Disposable) {}
            override fun onNext(expressBean: ExpressBean) {
                for (item in expressBean.result!!.list!!){ arrayList!!.add(item)}
                Iview.SetRecy(arrayList)
            }
            override fun onError(e: Throwable) {}
            override fun onComplete() {}
        })
    }
}
