package com.example.administrator.encyclopedia.api;

import com.example.administrator.encyclopedia.bean.ZhouGongBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia.api
 * 文件名：   ApiInterface
 * 创建者:    Nixo
 * 创建时间：  2018/5/12/012-19:10
 * 描述：
 */

public interface ApiInterface {

    /**
     * http://v.juhe.cn/dream/query?key=9ee09466774e3084dc52505ebf311b7a&q=火
     */

    @GET("query?")
    Observable<ZhouGongBean> ZhouGong(@Query("key") String key ,
                                      @Query("q") String SerchKey);

}
