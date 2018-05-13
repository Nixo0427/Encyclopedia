package com.example.administrator.encyclopedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.encyclopedia.MyInterface.MainRecyClickListen;
import com.example.administrator.encyclopedia.adapter.MainRecyAdapter;
import com.example.administrator.encyclopedia.bean.MainAdapterBean;
import com.example.administrator.encyclopedia.ui.FragmentWindows;
import com.example.administrator.encyclopedia.util.LogUtil;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    //绑定控件
    @BindView(R.id.main_recycler)RecyclerView recyclerView;


    private ArrayList<MainAdapterBean> arrayList = new ArrayList<>();
    private LogUtil logUtil = new LogUtil();
    private MainRecyClickListen listen = new MainRecyClickListen() {
                @Override
                public void MainRecyClickListener(String title) {
                    Intent intent = new Intent(MainActivity.this,FragmentWindows.class);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }

                @Override
                public void ZhouGongClickListener(String title, String rec) {

                }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定控件
        ButterKnife.bind(this);
        BindBean();
        BindRecyclerView();
    }

    private void BindRecyclerView() {
        MainRecyAdapter adapter = new MainRecyAdapter(this,arrayList,listen);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

    private void BindBean() {
        MainAdapterBean ZhouGongJieMeng = new MainAdapterBean(R.mipmap.jiemeng,"周公解梦");
        arrayList.add(ZhouGongJieMeng);
    }


}
