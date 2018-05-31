package com.example.administrator.encyclopediamvp.Moudel

import io.reactivex.Observable

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Moudel
 * 文件名：   IBaseMoudle
 * 创建者:    Nixo
 * 创建时间：  2018/5/16/016-15:47
 * 描述：
 */

interface IBaseMoudle  {
    fun ISerchKeyData(SerchKey: String) : Observable<*>?
    fun INoSerchKeyData(): Observable<*>?
}
