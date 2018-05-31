package com.example.administrator.encyclopediamvp.Bean

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

import org.json.JSONException
import org.json.JSONObject

import java.lang.reflect.Type
import java.util.ArrayList

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia.bean
 * 文件名：   ZhouGongBean
 * 创建者:    Nixo
 * 创建时间：  2018/5/12/012-18:47
 * 描述：
 */

class ZhouGongBean {

    /**
     * reason : successed
     * result : [{"id":"ec196627ef7a3d6c394222ac7a199c3d","title":"火车票","des":"梦见火车票，吉兆，预示着通过自己的努力已经成功。"}]
     * error_code : 0
     */

    var reason: String? = null
    var error_code: Int = 0
    var result: List<ResultBean>? = null

    class ResultBean {
        /**
         * id : ec196627ef7a3d6c394222ac7a199c3d
         * title : 火车票
         * des : 梦见火车票，吉兆，预示着通过自己的努力已经成功。
         */

        var id: String? = null
        var title: String? = null
        var des: String? = null

        companion object {

            fun objectFromData(str: String): ResultBean {

                return Gson().fromJson(str, ResultBean::class.java)
            }

            fun objectFromData(str: String, key: String): ResultBean? {

                try {
                    val jsonObject = JSONObject(str)

                    return Gson().fromJson(jsonObject.getString(str), ResultBean::class.java)
                } catch (e: JSONException) {
                    e.printStackTrace()
                }

                return null
            }

            fun arrayResultBeanFromData(str: String): List<ResultBean>? {

                val listType = object : TypeToken<ArrayList<ResultBean>>() {

                }.type

                return Gson().fromJson<List<ResultBean>>(str, listType)
            }

            fun arrayResultBeanFromData(str: String, key: String): List<ResultBean>? {

                try {
                    val jsonObject = JSONObject(str)
                    val listType = object : TypeToken<ArrayList<ResultBean>>() {

                    }.type

                    return Gson().fromJson<List<ResultBean>>(jsonObject.getString(str), listType)

                } catch (e: JSONException) {
                    e.printStackTrace()
                }

                return ArrayList()


            }
        }
    }

    companion object {

        fun objectFromData(str: String): ZhouGongBean {

            return Gson().fromJson(str, ZhouGongBean::class.java)
        }

        fun objectFromData(str: String, key: String): ZhouGongBean? {

            try {
                val jsonObject = JSONObject(str)

                return Gson().fromJson(jsonObject.getString(str), ZhouGongBean::class.java)
            } catch (e: JSONException) {
                e.printStackTrace()
            }

            return null
        }

        fun arrayZhouGongBeanFromData(str: String): List<ZhouGongBean>? {

            val listType = object : TypeToken<ArrayList<ZhouGongBean>>() {

            }.type

            return Gson().fromJson<List<ZhouGongBean>>(str, listType)
        }

        fun arrayZhouGongBeanFromData(str: String, key: String): List<ZhouGongBean>? {

            try {
                val jsonObject = JSONObject(str)
                val listType = object : TypeToken<ArrayList<ZhouGongBean>>() {

                }.type

                return Gson().fromJson<List<ZhouGongBean>>(jsonObject.getString(str), listType)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            return ArrayList()


        }
    }
}
