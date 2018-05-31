package com.example.administrator.encyclopediamvp.IListener


import com.example.administrator.encyclopediamvp.Bean.ExpressBean
import com.example.administrator.encyclopediamvp.Bean.HappyGifBean
import com.example.administrator.encyclopediamvp.Bean.LuckyQQBean
import com.example.administrator.encyclopediamvp.Bean.ZhouGongBean

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia.api
 * 文件名：   ApiInterface
 * 创建者:    Nixo
 * 创建时间：  2018/5/12/012-19:10
 * 描述：
 */

interface ApiInterface {


    /**
     * 周公解梦
     * http://v.juhe.cn/dream/query?key=9ee09466774e3084dc52505ebf311b7a&q=火
     */

    @GET("query?")
    fun ZhouGong(@Query("key") key: String,
                 @Query("q") SerchKey: String): Observable<ZhouGongBean>


    /**
     * 物流查询
     * http://api.jisuapi.com/express/query?appkey=66ef62163408fcbb&type=auto&number=3101624653800
     */


    @GET("query?")
    fun Express(@Query("appkey") key: String,
                @Query("type") type: String,
                @Query("number") expressNum: String): Observable<ExpressBean>


    /**
     * 福利|搞笑动图
     * http://route.showapi.com/341-3?showapi_appid=65197&showapi_sign=7409d8eab2354fb89b030277fa6977a5&page=1
     */


    @GET("341-3?")
    fun HappyGif(@Query("showapi_appid") appid: String,
                 @Query("showapi_sign") key: String,
                 @Query("page") page: String): Observable<HappyGifBean>


    /**
     *
     * QQ号测运势
     * https://route.showapi.com/863-1?qq=1649883744&showapi_appid=65197&showapi_sign=7409d8eab2354fb89b030277fa6977a5
     */
    @GET("863-1?")
    fun LuckQQ(@Query("qq") QQ: String,
               @Query("showapi_appid") appid: String,
               @Query("showapi_sign") key: String): Observable<LuckyQQBean>

}
