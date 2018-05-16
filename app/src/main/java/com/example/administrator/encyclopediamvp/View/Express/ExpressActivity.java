package com.example.administrator.encyclopediamvp.View.Express;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.encyclopediamvp.Adapter.ExpressAdapter;
import com.example.administrator.encyclopediamvp.Bean.ExpressBean;
import com.example.administrator.encyclopediamvp.Presenter.ExpressPresenter;
import com.example.administrator.encyclopediamvp.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ExpressActivity extends AppCompatActivity implements IExpressView , View.OnClickListener{

    //初始化数据
    ArrayList<ExpressBean.ResultBean.ListBean> arrayList = new ArrayList<>();
    ExpressPresenter presenter ;
    //绑定控件
    @BindView(R.id.serch_input)EditText mSerchKey;
    @BindView(R.id.serch_button)Button mSerchBtn;
    @BindView(R.id.recy_express) RecyclerView mRecyExpress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_express);
        ButterKnife.bind(this);

        mSerchBtn.setOnClickListener(this);

    }

    @Override
    public void SetRecy(ArrayList<ExpressBean.ResultBean.ListBean> expressBeanArrayList) {
        arrayList = expressBeanArrayList;
    }



    @Override
    public void Success() {
        Toast.makeText(this, "加载成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void Fail(String error) {
        if(error == null){

        }else{
            Toast.makeText(this, "加载失败"+error, Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.serch_button:
                presenter = new ExpressPresenter(this);
                presenter.SetData(mSerchKey.getText().toString().trim());
                setRecyView();
                break;
        }
    }

    public void setRecyView(){
        StaggeredGridLayoutManager sgl = new StaggeredGridLayoutManager(1, LinearLayoutManager.VERTICAL);
        ExpressAdapter adapter = new ExpressAdapter(this,arrayList);
        mRecyExpress.setLayoutManager(sgl);
        mRecyExpress.setAdapter(adapter);
    }

}
