package com.example.administrator.encyclopediamvp.View.Main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.administrator.encyclopediamvp.Adapter.MainRecyAdapter;
import com.example.administrator.encyclopediamvp.Bean.MainAdapterBean;
import com.example.administrator.encyclopediamvp.IListener.MainRecyClickListen;
import com.example.administrator.encyclopediamvp.Presenter.MainPresenter;
import com.example.administrator.encyclopediamvp.R;
import com.example.administrator.encyclopediamvp.View.Express.ExpressActivity;
import com.example.administrator.encyclopediamvp.View.HappyGif.HappyGifActivity;
import com.example.administrator.encyclopediamvp.View.LucklyQQ.LucklyQQActivity;
import com.example.administrator.encyclopediamvp.View.ZhouGong.ZhouGongActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements IMainView , MainRecyClickListen {


    MainPresenter presenter;

    //绑定控件
    @BindView(R.id.main_recycler)RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new MainPresenter(this);
        presenter.present();

    }

    @Override
    public void SetRecyclerView(ArrayList<MainAdapterBean> adapterBeans) {
        ArrayList<MainAdapterBean> adapterBeans1 = adapterBeans;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        MainRecyAdapter recyAdapter  = new MainRecyAdapter(this,adapterBeans1,this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(recyAdapter);

    }

    @Override
    public void Welcome() {
        Toast.makeText(this, "欢迎使用百科全书", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void MainRecyClickListener(String title) {
        switch (title){
            case "物流查询":
                Intent intent1 = new Intent(this, ExpressActivity.class);
                intent1.putExtra("title",title);
                startActivity(intent1);
                break;
            case "周公解梦":
                Intent intent2 = new Intent(this, ZhouGongActivity.class);
                intent2.putExtra("title",title);
                startActivity(intent2);
                break;
            case "搞笑图片":
                Intent intent3 = new Intent(this, HappyGifActivity.class);
                intent3.putExtra("title",title);
                startActivity(intent3);
                break;
            case "QQ号运势":
                Intent intent4 = new Intent(this, LucklyQQActivity.class);
                intent4.putExtra("title",title);
                startActivity(intent4);
                break;
        }
    }

    @Override
    public void ZhouGongClickListener(String title, String rec) {

    }
}
