package com.example.administrator.encyclopediamvp.Moudel.Express;

import com.example.administrator.encyclopediamvp.Bean.ExpressBean;

import java.util.ArrayList;

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Moudel.Express
 * 文件名：   IExpressMoudle
 * 创建者:    Nixo
 * 创建时间：  2018/5/15/015-15:37
 * 描述：
 */

public interface IExpressMoudle {
    ArrayList<ExpressBean.ResultBean.ListBean> IExpressData(String SerchKey);




}
