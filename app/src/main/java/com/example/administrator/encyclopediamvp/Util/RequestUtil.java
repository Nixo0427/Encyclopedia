package com.example.administrator.encyclopediamvp.Util;


import com.example.administrator.encyclopediamvp.IListener.ApiInterface;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia.util
 * 文件名：   RequestUtil
 * 创建者:    Nixo
 * 创建时间：  2018/5/12/012-19:23
 * 描述：
 */

public class RequestUtil {

    public ApiInterface getApi(String baseUrl){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        return apiInterface;
    }

}
