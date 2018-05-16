package com.example.administrator.encyclopediamvp.IListener;



import com.example.administrator.encyclopediamvp.Bean.ExpressBean;
import com.example.administrator.encyclopediamvp.Bean.ZhouGongBean;

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
     * 周公解梦
     * http://v.juhe.cn/dream/query?key=9ee09466774e3084dc52505ebf311b7a&q=火
     */

    @GET("query?")
    Observable<ZhouGongBean> ZhouGong(@Query("key") String key,
                                      @Query("q") String SerchKey);


    /**
     * 物流查询
     * http://api.jisuapi.com/express/query?appkey=66ef62163408fcbb&type=auto&number=3101624653800
     */


    @GET("query?")
    Observable<ExpressBean> Express(@Query("appkey") String key,
                                    @Query("type") String type,
                                    @Query("number") String expressNum);

}
