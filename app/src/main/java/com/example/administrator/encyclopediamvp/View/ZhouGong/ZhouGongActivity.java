package com.example.administrator.encyclopediamvp.View.ZhouGong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.administrator.encyclopediamvp.Adapter.ZhouGongAdapter;
import com.example.administrator.encyclopediamvp.Bean.ZhouGongBean;
import com.example.administrator.encyclopediamvp.IListener.MainRecyClickListen;
import com.example.administrator.encyclopediamvp.Presenter.ZhouGongPresenter;
import com.example.administrator.encyclopediamvp.R;


import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ZhouGongActivity extends AppCompatActivity implements IZhouGongView, View.OnClickListener,MainRecyClickListen{


    //初始化数据
    Intent intent;
    ZhouGongPresenter p;
    //绑定控件
    @BindView(R.id.recy_zhougong2)RecyclerView recyclerView;
    @BindView(R.id.serch_button)Button SerchBtn;
    @BindView(R.id.serch_input)EditText editText;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.toolbar_back)Button back;
    @BindView(R.id.toolbar_title)TextView title;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhou_gong);
        ButterKnife.bind(this);
        SerchBtn.setOnClickListener(this);
        p = new ZhouGongPresenter(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        intent = getIntent();
        back.setOnClickListener(this);
        title.setText(intent.getStringExtra("title"));
    }

    @Override
    public void SetRecy(ArrayList<ZhouGongBean.ResultBean> beans) {
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        ZhouGongAdapter adapter = new ZhouGongAdapter(this,beans,this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.serch_button:
                p.SetRecy2(editText.getText().toString().trim());
                break;
            case R.id.toolbar_back:
                finish();
                break;
        }
    }

    @Override
    public void MainRecyClickListener(String title) {

    }

    @Override
    public void ZhouGongClickListener(String title, String rec) {

    }
}
