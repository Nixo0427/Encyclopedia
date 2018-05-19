package com.example.administrator.encyclopediamvp.View.LucklyQQ;

import android.content.Intent;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.encyclopediamvp.Bean.LuckyQQBean;
import com.example.administrator.encyclopediamvp.Presenter.LucklyQQPresenter;
import com.example.administrator.encyclopediamvp.R;
import com.example.administrator.encyclopediamvp.View.IBaseView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class LucklyQQActivity extends AppCompatActivity implements ILucklyQQView , OnClickListener{

    //绑定控件
    @BindView(R.id.serch_button)Button mSerch;
    @BindView(R.id.serch_input)EditText mEditQQ;
    @BindView(R.id.toolbar)Toolbar toolbar;
    @BindView(R.id.toolbar_title)TextView mTitle;
    @BindView(R.id.toolbar_back)Button mBackBtn;
    @BindViews({R.id.Luck_QQNum,R.id.Luck_QQScore,R.id.Luck_QQgrade,R.id.Luck_QQdesc,R.id.Luck_QQanalysis})List<TextView> mResult;

    //数据
    LucklyQQPresenter presenter;
    LuckyQQBean Luckbean = new LuckyQQBean();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luckly_qq);
        ButterKnife.bind(this);
        presenter = new LucklyQQPresenter(this);
        Intent i = getIntent();
        mTitle.setText(i.getStringExtra("title"));
        mSerch.setOnClickListener(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mBackBtn.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.toolbar_back:
                finish();
                break;
            case R.id.serch_button:

                String QQ = mEditQQ.getText().toString().trim();
                presenter.SetResult(QQ);
                break;
        }
    }

    @Override
    public void setData(LuckyQQBean bean) {

        Log.i("JSY", "V:"+bean.getShowapi_res_body().getDesc());

        if(bean != null){
            Luckbean = bean;
            if(bean.getShowapi_res_body() !=null){
                Luckbean.setShowapi_res_body(bean.getShowapi_res_body());
                 mResult.get(0).setText("QQ:"+mEditQQ.getText().toString().trim());
                 mResult.get(1).setText("评分:"+Luckbean.getShowapi_res_body().getScore());
                 mResult.get(2).setText("评价:"+Luckbean.getShowapi_res_body().getGrade());
                 mResult.get(3).setText("分析:"+Luckbean.getShowapi_res_body().getDesc());
                 mResult.get(4).setText("建议:"+Luckbean.getShowapi_res_body().getAnalysis());
                if(bean.getShowapi_res_body().getScore() != null){

                }else{
                    Log.i("JSY", "V层Bean中Body的值为null");
                }

            }else{
                Log.i("JSY", "V层Bean中Body返回体为null");
            }
        }else{
            Log.i("JSY", "V层Bean为null");
        }




    }
}
