package com.example.administrator.encyclopediamvp.Presenter

import com.example.administrator.encyclopediamvp.Bean.LuckyQQBean
import com.example.administrator.encyclopediamvp.Moudel.IBaseMoudle
import com.example.administrator.encyclopediamvp.Moudel.LucklyQQ.ILucklyQQMoudel
import com.example.administrator.encyclopediamvp.Moudel.LucklyQQ.LucklyQQMoudel
import com.example.administrator.encyclopediamvp.View.IBaseView
import com.example.administrator.encyclopediamvp.View.LucklyQQ.ILucklyQQView

import java.lang.reflect.Array
import java.util.ArrayList

import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

/**
 * Created by Nixo on 2018/5/17.
 */

class LucklyQQPresenter(internal var Iview: ILucklyQQView) {

    var moudle: ILucklyQQMoudel = LucklyQQMoudel()

    fun SetResult(QQ: String) {
        var observer: Observer<LuckyQQBean> = object : Observer<LuckyQQBean> {
            override fun onSubscribe(d: Disposable) {

            }

            override fun onNext(bean: LuckyQQBean) {
                Iview.setData(bean)
            }

            override fun onError(e: Throwable) {

            }

            override fun onComplete() {

            }
        }
        try {
            moudle.getLuckQQBean(QQ)
                    .subscribe(observer)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
    }
}
