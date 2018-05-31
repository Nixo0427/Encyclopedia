package com.example.administrator.encyclopediamvp.Bean

/**
 * Created by Nixo on 2018/5/17.
 */

class LuckyQQBean {


    /**
     * showapi_res_error :
     * showapi_res_code : 0
     * showapi_res_body : {"ret_code":0,"desc":"[要面包不要爱情型]，其具体表现为：责任心重，尤其对工作充满热诚，是个彻头彻尾工作狂。但往往因为过分专注职务，而忽略身边的家人及朋友，是个宁要面包不需要爱情的理性主义者。","score":"35分","grade":"凶","analysis":"见异思迁，十九不成，徒劳无功，不如更换"}
     */

    var showapi_res_error: String? = null
    var showapi_res_code: Int = 0
    var showapi_res_body: ShowapiResBodyBean? = null

    class ShowapiResBodyBean {
        /**
         * ret_code : 0
         * desc : [要面包不要爱情型]，其具体表现为：责任心重，尤其对工作充满热诚，是个彻头彻尾工作狂。但往往因为过分专注职务，而忽略身边的家人及朋友，是个宁要面包不需要爱情的理性主义者。
         * score : 35分
         * grade : 凶
         * analysis : 见异思迁，十九不成，徒劳无功，不如更换
         */

        var ret_code: Int = 0
        var desc: String? = null
        var score: String? = null
        var grade: String? = null
        var analysis: String? = null
    }
}
