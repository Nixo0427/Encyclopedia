package com.example.administrator.encyclopediamvp.Presenter;

import android.util.Log;

import com.example.administrator.encyclopediamvp.Bean.ExpressBean;
import com.example.administrator.encyclopediamvp.IListener.ApiInterface;
import com.example.administrator.encyclopediamvp.Moudel.Express.ExpressMoudle;

import com.example.administrator.encyclopediamvp.Moudel.IBaseMoudle;
import com.example.administrator.encyclopediamvp.Util.RequestUtil;
import com.example.administrator.encyclopediamvp.Util.StaticSetting;
import com.example.administrator.encyclopediamvp.View.Express.IExpressView;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * 项目名：   EncyclopediaMVP
 * 包名 ：    com.example.administrator.encyclopediamvp.Presenter
 * 文件名：   ExpressPresenter
 * 创建者:    Nixo
 * 创建时间：  2018/5/15/015-15:38
 * 描述：
 */

public class ExpressPresenter  {

    IBaseMoudle moudle;
    IExpressView Iview;
    ArrayList<ExpressBean.ResultBean.ListBean> arrayList;
    public ExpressPresenter(IExpressView Iview){
        this.Iview = Iview;
        moudle = new ExpressMoudle();
    }

    public void SetData(String serchKey){
        Log.i("JSY", serchKey);
        arrayList = (ArrayList<ExpressBean.ResultBean.ListBean>) moudle.ISerchKeyData(serchKey);
        Log.i("JSY",arrayList.size()+"");
        Iview.SetRecy(arrayList);
    }


}
