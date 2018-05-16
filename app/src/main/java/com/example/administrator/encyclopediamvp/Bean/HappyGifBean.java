package com.example.administrator.encyclopediamvp.Bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Bean
 * 文件名：   HappyGifBean
 * 创建者:    Nixo
 * 创建时间：  2018/5/16/016-14:09
 * 描述：
 */

public class HappyGifBean {

    /**
     * showapi_res_error :
     * showapi_res_code : 0
     * showapi_res_body : {"allPages":11,"ret_code":0,"contentlist":[{"title":"搞笑gif第七百二十一期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q50P3.gif","type":3,"ct":"2018-03-28 15:30:09.844"},{"title":"搞笑gif第七百二十二期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q50Z8.gif","type":3,"ct":"2018-03-28 15:30:09.840"},{"title":"搞笑gif第七百二十三期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q51013.gif","type":3,"ct":"2018-03-28 15:30:09.833"},{"title":"搞笑gif第七百二十四期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q51202.gif","type":3,"ct":"2018-03-28 15:30:09.832"},{"title":"搞笑gif第七百二十五期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q51403.gif","type":3,"ct":"2018-03-28 15:30:09.775"},{"title":"邪恶动态图第464期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23U1.gif","type":3,"ct":"2018-03-28 13:00:05.409"},{"title":"邪恶动态图第461期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23542.gif","type":3,"ct":"2018-03-28 13:00:05.399"},{"title":"邪恶动态图第462期女人BB被黑人大棒插12p（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23I6.gif","type":3,"ct":"2018-03-28 13:00:05.399"},{"title":"邪恶动态图第463期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23Q7.gif","type":3,"ct":"2018-03-28 13:00:05.399"},{"title":"邪恶动态图第465期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23925.gif","type":3,"ct":"2018-03-28 13:00:05.398"},{"title":"邪恶动态图第458期老司机gif福利动态出处（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G03215.gif","type":3,"ct":"2018-03-27 11:00:04.148"},{"title":"邪恶动态图第459期美女动态图gif出处日本（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G03313.gif","type":3,"ct":"2018-03-27 11:00:04.147"},{"title":"邪恶动态图第460期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G03509.gif","type":3,"ct":"2018-03-27 11:00:04.145"},{"title":"邪恶动态图第456期后入式gif动态图十四式（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G02611.gif","type":3,"ct":"2018-03-27 10:30:10.983"},{"title":"邪恶动态图第457期浪货,你这里面又软又紧（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G03106.gif","type":3,"ct":"2018-03-27 10:30:03.592"},{"title":"搞笑gif第七百一十八期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326134213.gif","type":3,"ct":"2018-03-26 14:00:04.121"},{"title":"搞笑gif第七百一十七期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326133942.gif","type":3,"ct":"2018-03-26 14:00:04.120"},{"title":"搞笑gif第七百一十九期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326134412.gif","type":3,"ct":"2018-03-26 14:00:04.120"},{"title":"搞笑gif第七百一十六期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326133638.gif","type":3,"ct":"2018-03-26 14:00:04.120"},{"title":"搞笑gif第七百二十期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326134633.gif","type":3,"ct":"2018-03-26 14:00:04.120"}],"currentPage":1,"allNum":213,"maxResult":20}
     */

    private String showapi_res_error;
    private int showapi_res_code;
    private ShowapiResBodyBean showapi_res_body;

    public static HappyGifBean objectFromData(String str) {

        return new Gson().fromJson(str, HappyGifBean.class);
    }

    public static HappyGifBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), HappyGifBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<HappyGifBean> arrayHappyGifBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<HappyGifBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<HappyGifBean> arrayHappyGifBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<HappyGifBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        /**
         * allPages : 11
         * ret_code : 0
         * contentlist : [{"title":"搞笑gif第七百二十一期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q50P3.gif","type":3,"ct":"2018-03-28 15:30:09.844"},{"title":"搞笑gif第七百二十二期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q50Z8.gif","type":3,"ct":"2018-03-28 15:30:09.840"},{"title":"搞笑gif第七百二十三期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q51013.gif","type":3,"ct":"2018-03-28 15:30:09.833"},{"title":"搞笑gif第七百二十四期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q51202.gif","type":3,"ct":"2018-03-28 15:30:09.832"},{"title":"搞笑gif第七百二十五期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q51403.gif","type":3,"ct":"2018-03-28 15:30:09.775"},{"title":"邪恶动态图第464期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23U1.gif","type":3,"ct":"2018-03-28 13:00:05.409"},{"title":"邪恶动态图第461期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23542.gif","type":3,"ct":"2018-03-28 13:00:05.399"},{"title":"邪恶动态图第462期女人BB被黑人大棒插12p（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23I6.gif","type":3,"ct":"2018-03-28 13:00:05.399"},{"title":"邪恶动态图第463期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23Q7.gif","type":3,"ct":"2018-03-28 13:00:05.399"},{"title":"邪恶动态图第465期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q23925.gif","type":3,"ct":"2018-03-28 13:00:05.398"},{"title":"邪恶动态图第458期老司机gif福利动态出处（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G03215.gif","type":3,"ct":"2018-03-27 11:00:04.148"},{"title":"邪恶动态图第459期美女动态图gif出处日本（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G03313.gif","type":3,"ct":"2018-03-27 11:00:04.147"},{"title":"邪恶动态图第460期橹管专用动态XXO0（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G03509.gif","type":3,"ct":"2018-03-27 11:00:04.145"},{"title":"邪恶动态图第456期后入式gif动态图十四式（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G02611.gif","type":3,"ct":"2018-03-27 10:30:10.983"},{"title":"邪恶动态图第457期浪货,你这里面又软又紧（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180327/2-1P32G03106.gif","type":3,"ct":"2018-03-27 10:30:03.592"},{"title":"搞笑gif第七百一十八期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326134213.gif","type":3,"ct":"2018-03-26 14:00:04.121"},{"title":"搞笑gif第七百一十七期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326133942.gif","type":3,"ct":"2018-03-26 14:00:04.120"},{"title":"搞笑gif第七百一十九期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326134412.gif","type":3,"ct":"2018-03-26 14:00:04.120"},{"title":"搞笑gif第七百一十六期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326133638.gif","type":3,"ct":"2018-03-26 14:00:04.120"},{"title":"搞笑gif第七百二十期（共5图）","img":"http://www.zbjuran.com/uploads/allimg/180326/2-1P326134633.gif","type":3,"ct":"2018-03-26 14:00:04.120"}]
         * currentPage : 1
         * allNum : 213
         * maxResult : 20
         */

        private int allPages;
        private int ret_code;
        private int currentPage;
        private int allNum;
        private int maxResult;
        private List<ContentlistBean> contentlist;

        public static ShowapiResBodyBean objectFromData(String str) {

            return new Gson().fromJson(str, ShowapiResBodyBean.class);
        }

        public static ShowapiResBodyBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), ShowapiResBodyBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<ShowapiResBodyBean> arrayShowapiResBodyBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<ShowapiResBodyBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<ShowapiResBodyBean> arrayShowapiResBodyBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<ShowapiResBodyBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public int getAllPages() {
            return allPages;
        }

        public void setAllPages(int allPages) {
            this.allPages = allPages;
        }

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getAllNum() {
            return allNum;
        }

        public void setAllNum(int allNum) {
            this.allNum = allNum;
        }

        public int getMaxResult() {
            return maxResult;
        }

        public void setMaxResult(int maxResult) {
            this.maxResult = maxResult;
        }

        public List<ContentlistBean> getContentlist() {
            return contentlist;
        }

        public void setContentlist(List<ContentlistBean> contentlist) {
            this.contentlist = contentlist;
        }

        public static class ContentlistBean {
            /**
             * title : 搞笑gif第七百二十一期（共5图）
             * img : http://www.zbjuran.com/uploads/allimg/180328/2-1P32Q50P3.gif
             * type : 3
             * ct : 2018-03-28 15:30:09.844
             */

            private String title;
            private String img;
            private int type;
            private String ct;

            public static ContentlistBean objectFromData(String str) {

                return new Gson().fromJson(str, ContentlistBean.class);
            }

            public static ContentlistBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), ContentlistBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<ContentlistBean> arrayContentlistBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<ContentlistBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<ContentlistBean> arrayContentlistBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<ContentlistBean>>() {
                    }.getType();

                    return new Gson().fromJson(jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();


            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }
        }
    }
}
