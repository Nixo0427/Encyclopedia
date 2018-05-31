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
 * 文件名：   ExpressBean
 * 创建者:    Nixo
 * 创建时间：  2018/5/13/013-14:09
 * 描述：
 */

class ExpressBean {

    /**
     * status : 0
     * msg : ok
     * result : {"number":"3101624653800","type":"yunda","list":[{"time":"2018-03-06 12:54:51","status":"四川成都崇州市公司快件已被 已签收 签收"},{"time":"2018-03-06 10:24:31","status":"四川成都崇州市公司进行派件扫描；派送业务员：匡平；联系电话：18180452959"},{"time":"2018-03-06 01:22:58","status":"四川成都分拨中心从站点发出，本次转运目的地：四川成都崇州市公司"},{"time":"2018-03-05 02:55:18","status":"湖南长沙分拨中心进行装车扫描，即将发往：四川成都分拨中心"},{"time":"2018-03-05 02:33:43","status":"湖南长沙分拨中心进行中转集包扫描，将发往：四川成都网点包"},{"time":"2018-03-04 16:10:23","status":"湖南芷江县公司进行揽件扫描"},{"time":"2018-03-04 15:44:28","status":"湖南芷江县公司凯旋分部进行发出扫描，将发往：湖南芷江县公司"}],"deliverystatus":"3","issign":"1"}
     */

    var status: String? = null
    var msg: String? = null
    var result: ResultBean? = null

    class ResultBean {
        /**
         * number : 3101624653800
         * type : yunda
         * list : [{"time":"2018-03-06 12:54:51","status":"四川成都崇州市公司快件已被 已签收 签收"},{"time":"2018-03-06 10:24:31","status":"四川成都崇州市公司进行派件扫描；派送业务员：匡平；联系电话：18180452959"},{"time":"2018-03-06 01:22:58","status":"四川成都分拨中心从站点发出，本次转运目的地：四川成都崇州市公司"},{"time":"2018-03-05 02:55:18","status":"湖南长沙分拨中心进行装车扫描，即将发往：四川成都分拨中心"},{"time":"2018-03-05 02:33:43","status":"湖南长沙分拨中心进行中转集包扫描，将发往：四川成都网点包"},{"time":"2018-03-04 16:10:23","status":"湖南芷江县公司进行揽件扫描"},{"time":"2018-03-04 15:44:28","status":"湖南芷江县公司凯旋分部进行发出扫描，将发往：湖南芷江县公司"}]
         * deliverystatus : 3
         * issign : 1
         */

        var number: String? = null
        var type: String? = null
        var deliverystatus: String? = null
        var issign: String? = null
        var list: List<ListBean>? = null

        class ListBean {
            /**
             * time : 2018-03-06 12:54:51
             * status : 四川成都崇州市公司快件已被 已签收 签收
             */

            var time: String? = null
            var status: String? = null

            companion object {

                fun objectFromData(str: String): ListBean {

                    return Gson().fromJson(str, ListBean::class.java)
                }

                fun objectFromData(str: String, key: String): ListBean? {

                    try {
                        val jsonObject = JSONObject(str)

                        return Gson().fromJson(jsonObject.getString(str), ListBean::class.java)
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }

                    return null
                }

                fun arrayListBeanFromData(str: String): List<ListBean>? {

                    val listType = object : TypeToken<ArrayList<ListBean>>() {

                    }.type

                    return Gson().fromJson<List<ListBean>>(str, listType)
                }

                fun arrayListBeanFromData(str: String, key: String): List<ListBean>? {

                    try {
                        val jsonObject = JSONObject(str)
                        val listType = object : TypeToken<ArrayList<ListBean>>() {

                        }.type

                        return Gson().fromJson<List<ListBean>>(jsonObject.getString(str), listType)

                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }

                    return ArrayList()


                }
            }
        }

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

        fun objectFromData(str: String): ExpressBean {

            return Gson().fromJson(str, ExpressBean::class.java)
        }

        fun objectFromData(str: String, key: String): ExpressBean? {

            try {
                val jsonObject = JSONObject(str)

                return Gson().fromJson(jsonObject.getString(str), ExpressBean::class.java)
            } catch (e: JSONException) {
                e.printStackTrace()
            }

            return null
        }

        fun arrayExpressBeanFromData(str: String): List<ExpressBean>? {

            val listType = object : TypeToken<ArrayList<ExpressBean>>() {

            }.type

            return Gson().fromJson<List<ExpressBean>>(str, listType)
        }

        fun arrayExpressBeanFromData(str: String, key: String): List<ExpressBean>? {

            try {
                val jsonObject = JSONObject(str)
                val listType = object : TypeToken<ArrayList<ExpressBean>>() {

                }.type

                return Gson().fromJson<List<ExpressBean>>(jsonObject.getString(str), listType)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            return ArrayList()


        }
    }
}
