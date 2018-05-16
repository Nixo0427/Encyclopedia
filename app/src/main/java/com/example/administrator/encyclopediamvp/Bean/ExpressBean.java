package com.example.administrator.encyclopediamvp.Bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia.bean
 * 文件名：   ExpressBean
 * 创建者:    Nixo
 * 创建时间：  2018/5/13/013-14:09
 * 描述：
 */

public class ExpressBean {

    /**
     * status : 0
     * msg : ok
     * result : {"number":"3101624653800","type":"yunda","list":[{"time":"2018-03-06 12:54:51","status":"四川成都崇州市公司快件已被 已签收 签收"},{"time":"2018-03-06 10:24:31","status":"四川成都崇州市公司进行派件扫描；派送业务员：匡平；联系电话：18180452959"},{"time":"2018-03-06 01:22:58","status":"四川成都分拨中心从站点发出，本次转运目的地：四川成都崇州市公司"},{"time":"2018-03-05 02:55:18","status":"湖南长沙分拨中心进行装车扫描，即将发往：四川成都分拨中心"},{"time":"2018-03-05 02:33:43","status":"湖南长沙分拨中心进行中转集包扫描，将发往：四川成都网点包"},{"time":"2018-03-04 16:10:23","status":"湖南芷江县公司进行揽件扫描"},{"time":"2018-03-04 15:44:28","status":"湖南芷江县公司凯旋分部进行发出扫描，将发往：湖南芷江县公司"}],"deliverystatus":"3","issign":"1"}
     */

    private String status;
    private String msg;
    private ResultBean result;

    public static ExpressBean objectFromData(String str) {

        return new Gson().fromJson(str, ExpressBean.class);
    }

    public static ExpressBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), ExpressBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<ExpressBean> arrayExpressBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<ExpressBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<ExpressBean> arrayExpressBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<ExpressBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * number : 3101624653800
         * type : yunda
         * list : [{"time":"2018-03-06 12:54:51","status":"四川成都崇州市公司快件已被 已签收 签收"},{"time":"2018-03-06 10:24:31","status":"四川成都崇州市公司进行派件扫描；派送业务员：匡平；联系电话：18180452959"},{"time":"2018-03-06 01:22:58","status":"四川成都分拨中心从站点发出，本次转运目的地：四川成都崇州市公司"},{"time":"2018-03-05 02:55:18","status":"湖南长沙分拨中心进行装车扫描，即将发往：四川成都分拨中心"},{"time":"2018-03-05 02:33:43","status":"湖南长沙分拨中心进行中转集包扫描，将发往：四川成都网点包"},{"time":"2018-03-04 16:10:23","status":"湖南芷江县公司进行揽件扫描"},{"time":"2018-03-04 15:44:28","status":"湖南芷江县公司凯旋分部进行发出扫描，将发往：湖南芷江县公司"}]
         * deliverystatus : 3
         * issign : 1
         */

        private String number;
        private String type;
        private String deliverystatus;
        private String issign;
        private List<ListBean> list;

        public static ResultBean objectFromData(String str) {

            return new Gson().fromJson(str, ResultBean.class);
        }

        public static ResultBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), ResultBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<ResultBean> arrayResultBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<ResultBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<ResultBean> arrayResultBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<ResultBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getDeliverystatus() {
            return deliverystatus;
        }

        public void setDeliverystatus(String deliverystatus) {
            this.deliverystatus = deliverystatus;
        }

        public String getIssign() {
            return issign;
        }

        public void setIssign(String issign) {
            this.issign = issign;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * time : 2018-03-06 12:54:51
             * status : 四川成都崇州市公司快件已被 已签收 签收
             */

            private String time;
            private String status;

            public static ListBean objectFromData(String str) {

                return new Gson().fromJson(str, ListBean.class);
            }

            public static ListBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), ListBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<ListBean> arrayListBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<ListBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<ListBean> arrayListBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<ListBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }
        }
    }
}
