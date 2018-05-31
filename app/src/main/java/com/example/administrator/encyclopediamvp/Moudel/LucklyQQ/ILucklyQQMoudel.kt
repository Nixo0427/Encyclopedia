package com.example.administrator.encyclopediamvp.Moudel.LucklyQQ

import com.example.administrator.encyclopediamvp.Bean.LuckyQQBean

import io.reactivex.Observable

/**
 * Created by Nixo on 2018/5/18.
 */

interface ILucklyQQMoudel {
    @Throws(InterruptedException::class)
    fun getLuckQQBean(QQ: String): Observable<LuckyQQBean>
}
