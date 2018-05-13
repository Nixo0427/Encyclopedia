package com.example.administrator.encyclopedia.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.administrator.encyclopedia.MyInterface.MainRecyClickListen;
import com.example.administrator.encyclopedia.R;
import com.example.administrator.encyclopedia.adapter.ZhouGongAdapter;
import com.example.administrator.encyclopedia.api.ApiInterface;
import com.example.administrator.encyclopedia.bean.ZhouGongBean;
import com.example.administrator.encyclopedia.util.LogUtil;
import com.example.administrator.encyclopedia.util.RequestUtil;
import com.example.administrator.encyclopedia.util.StaticSetting;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 项目名：   Encyclopedia
 * 包名 ：    com.example.administrator.encyclopedia
 * 文件名：   ZhouGongFragment
 * 创建者:    Nixo
 * 创建时间：  2018/5/12/012-16:13
 * 描述：      周公解梦
 * BUG：     输入完点击搜索，fragment不会刷新，因为输入法弹出时Fragment处于pause状态；
 */

public class ZhouGongFragment extends Fragment implements View.OnClickListener {


    //绑定控件
    @BindView(R.id.zhougong_recy)RecyclerView recyclerView;
    @BindView(R.id.serch_input)EditText input;
    @BindView(R.id.serch_button)Button serch;

    //ButterKnife解绑器
    private Unbinder unbinder;
    //工具
    LogUtil l = new LogUtil();
    //数据
    View mView;
    ArrayList<ZhouGongBean.ResultBean> arrayList = new ArrayList<>();
    //RecyclerView的点击事件
    MainRecyClickListen listen = new MainRecyClickListen() {
        @Override
        public void MainRecyClickListener(String title) {
            //null
        }

        @Override
        public void ZhouGongClickListener(String title, String rec) {

        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_zhougong,container,false);
        unbinder = ButterKnife.bind(this,view);
        mView = view;
        serch.setOnClickListener(this);

        return view;
    }

    private void setRecycler(View view) {
        StaggeredGridLayoutManager staggeredGridLayoutManager =
                new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
        ZhouGongAdapter adapter = null;
        if(adapter == null){
            adapter = new ZhouGongAdapter(view.getContext(),arrayList,listen);
        }else {
            adapter.notifyDataSetChanged();
        }
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.serch_button:
                getResult(input.getText().toString());
                setRecycler(mView);

                break;
        }
    }

    public void getResult(String serchKey) {
        arrayList = new ArrayList<>();
        RequestUtil requestUtil = new RequestUtil();
        ApiInterface apiInterface = requestUtil.getApi(StaticSetting.URL_ZHOUGONG);
        apiInterface.ZhouGong(StaticSetting.KEY_ZHOUGONG+"",serchKey+"")
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Observer<ZhouGongBean>() {
                        @Override
                        public void onSubscribe(Disposable d) {

                        }

                        @Override
                        public void onNext(ZhouGongBean zhouGongBean) {
                            if(zhouGongBean.getError_code() == 206401){
                                Toast.makeText(getActivity(), "关键字不能为空", Toast.LENGTH_SHORT).show();
                            }
                            if(zhouGongBean.getError_code() == 0 && zhouGongBean.getResult() == null){
                                Toast.makeText(getActivity(), "请使用更精确的关键字喔，例如“黄金”", Toast.LENGTH_LONG).show();
                            }else if(zhouGongBean.getError_code() == 0 && zhouGongBean.getResult() != null){
                                List<ZhouGongBean.ResultBean> bean = zhouGongBean.getResult();
                                for (int i = 0; i <bean.size() ; i++) {
                                    arrayList.add(zhouGongBean.getResult().get(i));
                                    l.i(zhouGongBean.getResult().get(i).getTitle()+"");
                                }
                                l.i(arrayList.size()+"");

                            }

                        }

                        @Override
                        public void onError(Throwable e) {

                        }

                        @Override
                        public void onComplete() {

                        }
                    });
    }

    //关闭输入法
    public void downInputWindows(){
        InputMethodManager inputMethodManager = (InputMethodManager) getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        inputMethodManager.showSoftInput(mView,InputMethodManager.SHOW_FORCED);
    }

    

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
