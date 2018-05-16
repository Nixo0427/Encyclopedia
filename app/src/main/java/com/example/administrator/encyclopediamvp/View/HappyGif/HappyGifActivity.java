package com.example.administrator.encyclopediamvp.View.HappyGif;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.encyclopediamvp.Adapter.HappyGifAdapter;
import com.example.administrator.encyclopediamvp.Bean.HappyGifBean;
import com.example.administrator.encyclopediamvp.IListener.MainRecyClickListen;
import com.example.administrator.encyclopediamvp.Presenter.HappyGifPresenter;
import com.example.administrator.encyclopediamvp.R;
import com.example.administrator.encyclopediamvp.View.IBaseView;

import java.util.ArrayList;

import javax.security.auth.login.LoginException;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HappyGifActivity extends AppCompatActivity implements View.OnClickListener
        , IBaseView ,MainRecyClickListen
{

    //绑定控件
    @BindView(R.id.toolbar) Toolbar mToolbar;
    @BindView(R.id.toolbar_back)Button mBack;
    @BindView(R.id.toolbar_title)TextView mTitle;
    @BindView(R.id.recy_happygif)RecyclerView mRecyclerView;
    @BindView(R.id.happygif_pre)Button mPrePage;
    @BindView(R.id.happygif_next)Button mNextPage;
    @BindView(R.id.happygif_page)TextView mPage;

    //获取数据
    Intent intent;
    HappyGifPresenter presenter;
    int IndexPage = 1;
    ArrayList<HappyGifBean.ShowapiResBodyBean.ContentlistBean> beans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy_gif);
        ButterKnife.bind(this);
        presenter = new HappyGifPresenter(this);
        setSupportActionBar(mToolbar);
        intent = getIntent();
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mTitle.setText(intent.getStringExtra("title"));


        //设置下一页上一页是否显示，如果是最后一页就不显示Next如果是第一页就不显示Pre
        if(IndexPage == 1){
            mPrePage.setVisibility(View.GONE);
        }else{
            mPrePage.setVisibility(View.VISIBLE);
        }
        presenter.SetPage(IndexPage);
        //点击事件
        mBack.setOnClickListener(this);
        mPrePage.setOnClickListener(this);
        mNextPage.setOnClickListener(this);
        //触发presenter初始化第一页
        mPage.setText("第"+IndexPage+"页");

    }

    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.happygif_pre:
                    IndexPage--;
                    Log.i("page",""+IndexPage);
                    presenter.SetPage(IndexPage);
                break;
                case R.id.happygif_next:
                    IndexPage ++;
                    presenter.SetPage(IndexPage);
                    break;
                case R.id.toolbar_back:
                    finish();
                    break;
            }
    }

    @Override
    public void SetRecy(ArrayList<?> arrayList) {
        beans = new ArrayList<>();
        beans = (ArrayList<HappyGifBean.ShowapiResBodyBean.ContentlistBean>) arrayList;
        StaggeredGridLayoutManager sgl = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        HappyGifAdapter adapter = new HappyGifAdapter(beans,this,this);
        mRecyclerView.setLayoutManager(sgl);
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public void Success() {

    }

    @Override
    public void Fail(String error) {

    }


    @Override
    public void MainRecyClickListener(String title) {

    }

    @Override
    public void ZhouGongClickListener(String title, String rec) {

    }
}
