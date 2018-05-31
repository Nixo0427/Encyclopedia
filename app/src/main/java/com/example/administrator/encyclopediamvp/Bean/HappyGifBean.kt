package com.example.administrator.encyclopediamvp.Bean

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

import org.json.JSONException
import org.json.JSONObject

import java.lang.reflect.Type
import java.util.ArrayList

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Bean
 * 文件名：   HappyGifBean
 * 创建者:    Nixo
 * 创建时间：  2018/5/16/016-14:09
 * 描述：
 */

class HappyGifBean {

    /**
     * showapi_res_error :
     * showapi_res_code : 0
     * showapi_res_body : {"allPages":11,"ret_code":0,"contentlist":[{"title":"搞笑gif第七百二十一期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q50P3.gif","type":3,"ct":"2018-03-28 15:30:09.844"},{"title":"搞笑gif第七百二十二期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q50Z8.gif","type":3,"ct":"2018-03-28 15:30:09.840"},{"title":"搞笑gif第七百二十三期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q51013.gif","type":3,"ct":"2018-03-28 15:30:09.833"},{"title":"搞笑gif第七百二十四期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q51202.gif","type":3,"ct":"2018-03-28 15:30:09.832"},{"title":"搞笑gif第七百二十五期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q51403.gif","type":3,"ct":"2018-03-28 15:30:09.775"},{"title":"邪恶动态图第464期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23U1.gif","type":3,"ct":"2018-03-28 13:00:05.409"},{"title":"邪恶动态图第461期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23542.gif","type":3,"ct":"2018-03-28 13:00:05.399"},{"title":"邪恶动态图第462期女人BB被黑人大棒插12p（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23I6.gif","type":3,"ct":"2018-03-28 13:00:05.399"},{"title":"邪恶动态图第463期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23Q7.gif","type":3,"ct":"2018-03-28 13:00:05.399"},{"title":"邪恶动态图第465期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23925.gif","type":3,"ct":"2018-03-28 13:00:05.398"},{"title":"邪恶动态图第458期老司机gif福利动态出处（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G03215.gif","type":3,"ct":"2018-03-27 11:00:04.148"},{"title":"邪恶动态图第459期美女动态图gif出处日本（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G03313.gif","type":3,"ct":"2018-03-27 11:00:04.147"},{"title":"邪恶动态图第460期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G03509.gif","type":3,"ct":"2018-03-27 11:00:04.145"},{"title":"邪恶动态图第456期后入式gif动态图十四式（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G02611.gif","type":3,"ct":"2018-03-27 10:30:10.983"},{"title":"邪恶动态图第457期浪货,你这里面又软又紧（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G03106.gif","type":3,"ct":"2018-03-27 10:30:03.592"},{"title":"搞笑gif第七百一十八期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326134213.gif","type":3,"ct":"2018-03-26 14:00:04.121"},{"title":"搞笑gif第七百一十七期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326133942.gif","type":3,"ct":"2018-03-26 14:00:04.120"},{"title":"搞笑gif第七百一十九期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326134412.gif","type":3,"ct":"2018-03-26 14:00:04.120"},{"title":"搞笑gif第七百一十六期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326133638.gif","type":3,"ct":"2018-03-26 14:00:04.120"},{"title":"搞笑gif第七百二十期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326134633.gif","type":3,"ct":"2018-03-26 14:00:04.120"}],"currentPage":1,"allNum":213,"maxResult":20}
     */

    var showapi_res_error: String? = null
    var showapi_res_code: Int = 0
    var showapi_res_body: ShowapiResBodyBean? = null

    class ShowapiResBodyBean {
        /**
         * allPages : 11
         * ret_code : 0
         * contentlist : [{"title":"搞笑gif第七百二十一期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q50P3.gif","type":3,"ct":"2018-03-28 15:30:09.844"},{"title":"搞笑gif第七百二十二期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q50Z8.gif","type":3,"ct":"2018-03-28 15:30:09.840"},{"title":"搞笑gif第七百二十三期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q51013.gif","type":3,"ct":"2018-03-28 15:30:09.833"},{"title":"搞笑gif第七百二十四期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q51202.gif","type":3,"ct":"2018-03-28 15:30:09.832"},{"title":"搞笑gif第七百二十五期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q51403.gif","type":3,"ct":"2018-03-28 15:30:09.775"},{"title":"邪恶动态图第464期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23U1.gif","type":3,"ct":"2018-03-28 13:00:05.409"},{"title":"邪恶动态图第461期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23542.gif","type":3,"ct":"2018-03-28 13:00:05.399"},{"title":"邪恶动态图第462期女人BB被黑人大棒插12p（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23I6.gif","type":3,"ct":"2018-03-28 13:00:05.399"},{"title":"邪恶动态图第463期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23Q7.gif","type":3,"ct":"2018-03-28 13:00:05.399"},{"title":"邪恶动态图第465期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23925.gif","type":3,"ct":"2018-03-28 13:00:05.398"},{"title":"邪恶动态图第458期老司机gif福利动态出处（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G03215.gif","type":3,"ct":"2018-03-27 11:00:04.148"},{"title":"邪恶动态图第459期美女动态图gif出处日本（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G03313.gif","type":3,"ct":"2018-03-27 11:00:04.147"},{"title":"邪恶动态图第460期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G03509.gif","type":3,"ct":"2018-03-27 11:00:04.145"},{"title":"邪恶动态图第456期后入式gif动态图十四式（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G02611.gif","type":3,"ct":"2018-03-27 10:30:10.983"},{"title":"邪恶动态图第457期浪货,你这里面又软又紧（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G03106.gif","type":3,"ct":"2018-03-27 10:30:03.592"},{"title":"搞笑gif第七百一十八期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326134213.gif","type":3,"ct":"2018-03-26 14:00:04.121"},{"title":"搞笑gif第七百一十七期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326133942.gif","type":3,"ct":"2018-03-26 14:00:04.120"},{"title":"搞笑gif第七百一十九期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326134412.gif","type":3,"ct":"2018-03-26 14:00:04.120"},{"title":"搞笑gif第七百一十六期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326133638.gif","type":3,"ct":"2018-03-26 14:00:04.120"},{"title":"搞笑gif第七百二十期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326134633.gif","type":3,"ct":"2018-03-26 14:00:04.120"}]
         * currentPage : 1
         * allNum : 213
         * maxResult : 20
         */

        var allPages: Int = 0
        var ret_code: Int = 0
        var currentPage: Int = 0
        var allNum: Int = 0
        var maxResult: Int = 0
        var contentlist: List<ContentlistBean>? = null

        class ContentlistBean {
            /**
             * title : 搞笑gif第七百二十一期（共5图）
             * img : http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q50P3.gif
             * type : 3
             * ct : 2018-03-28 15:30:09.844
             */

            var title: String? = null
            var img: String? = null
            var type: Int = 0
            var ct: String? = null

            companion object {

                fun objectFromData(str: String): ContentlistBean {

                    return Gson().fromJson(str, ContentlistBean::class.java)
                }

                fun objectFromData(str: String, key: String): ContentlistBean? {

                    try {
                        val jsonObject = JSONObject(str)

                        return Gson().fromJson(jsonObject.getString(str), ContentlistBean::class.java)
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }

                    return null
                }

                fun arrayContentlistBeanFromData(str: String): List<ContentlistBean>? {

                    val listType = object : TypeToken<ArrayList<ContentlistBean>>() {

                    }.type

                    return Gson().fromJson<List<ContentlistBean>>(str, listType)
                }

                fun arrayContentlistBeanFromData(str: String, key: String): List<ContentlistBean>? {

                    try {
                        val jsonObject = JSONObject(str)
                        val listType = object : TypeToken<ArrayList<ContentlistBean>>() {

                        }.type

                        return Gson().fromJson<List<ContentlistBean>>(jsonObject.getString(str), listType)

                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }

                    return ArrayList()


                }
            }
        }

        companion object {

            fun objectFromData(str: String): ShowapiResBodyBean {

                return Gson().fromJson(str, ShowapiResBodyBean::class.java)
            }

            fun objectFromData(str: String, key: String): ShowapiResBodyBean? {

                try {
                    val jsonObject = JSONObject(str)

                    return Gson().fromJson(jsonObject.getString(str), ShowapiResBodyBean::class.java)
                } catch (e: JSONException) {
                    e.printStackTrace()
                }

                return null
            }

            fun arrayShowapiResBodyBeanFromData(str: String): List<ShowapiResBodyBean>? {

                val listType = object : TypeToken<ArrayList<ShowapiResBodyBean>>() {

                }.type

                return Gson().fromJson<List<ShowapiResBodyBean>>(str, listType)
            }

            fun arrayShowapiResBodyBeanFromData(str: String, key: String): List<ShowapiResBodyBean>? {

                try {
                    val jsonObject = JSONObject(str)
                    val listType = object : TypeToken<ArrayList<ShowapiResBodyBean>>() {

                    }.type

                    return Gson().fromJson<List<ShowapiResBodyBean>>(jsonObject.getString(str), listType)

                } catch (e: JSONException) {
                    e.printStackTrace()
                }

                return ArrayList()


            }
        }
    }

    companion object {

        fun objectFromData(str: String): HappyGifBean {

            return Gson().fromJson(str, HappyGifBean::class.java)
        }

        fun objectFromData(str: String, key: String): HappyGifBean? {

            try {
                val jsonObject = JSONObject(str)

                return Gson().fromJson(jsonObject.getString(str), HappyGifBean::class.java)
            } catch (e: JSONException) {
                e.printStackTrace()
            }

            return null
        }

        fun arrayHappyGifBeanFromData(str: String): List<HappyGifBean>? {

            val listType = object : TypeToken<ArrayList<HappyGifBean>>() {

            }.type

            return Gson().fromJson<List<HappyGifBean>>(str, listType)
        }

        fun arrayHappyGifBeanFromData(str: String, key: String): List<HappyGifBean>? {

            try {
                val jsonObject = JSONObject(str)
                val listType = object : TypeToken<ArrayList<HappyGifBean>>() {

                }.type

                return Gson().fromJson<List<HappyGifBean>>(jsonObject.getString(str), listType)

            } catch (e: JSONException) {
                e.printStackTrace()
            }

            return ArrayList()


        }
    }
}
