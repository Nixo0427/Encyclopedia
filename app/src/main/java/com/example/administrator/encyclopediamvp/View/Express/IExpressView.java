package com.example.administrator.encyclopediamvp.View.Express;

import com.example.administrator.encyclopediamvp.Bean.ExpressBean;

import java.util.ArrayList;

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.View.Express
 * 文件名：   IExpress
 * 创建者:    Nixo
 * 创建时间：  2018/5/15/015-15:36
 * 描述：
 */

public interface IExpressView {

    //添加RecyclerView数据
    void SetRecy(ArrayList<ExpressBean.ResultBean.ListBean> expressBeanArrayList);


    void Success();

    void Fail(String error);

}
