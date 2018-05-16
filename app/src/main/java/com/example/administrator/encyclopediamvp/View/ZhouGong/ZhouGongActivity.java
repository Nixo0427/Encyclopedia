package com.example.administrator.encyclopediamvp.View.ZhouGong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.example.administrator.encyclopediamvp.Adapter.ZhouGongAdapter;
import com.example.administrator.encyclopediamvp.Bean.ZhouGongBean;
import com.example.administrator.encyclopediamvp.IListener.MainRecyClickListen;
import com.example.administrator.encyclopediamvp.Presenter.ZhouGongPresenter;
import com.example.administrator.encyclopediamvp.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ZhouGongActivity extends AppCompatActivity implements IZhouGongView, View.OnClickListener,MainRecyClickListen{


    @BindView(R.id.recy_zhougong2)RecyclerView recyclerView;
    @BindView(R.id.serch_button)Button SerchBtn;
    @BindView(R.id.serch_input)EditText editText;
    ZhouGongPresenter p;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhou_gong);
        ButterKnife.bind(this);
        SerchBtn.setOnClickListener(this);
        p = new ZhouGongPresenter(this);

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
        }
    }

    @Override
    public void MainRecyClickListener(String title) {

    }

    @Override
    public void ZhouGongClickListener(String title, String rec) {

    }
}
