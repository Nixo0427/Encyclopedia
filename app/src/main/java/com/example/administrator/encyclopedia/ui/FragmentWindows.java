package com.example.administrator.encyclopedia.ui;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.administrator.encyclopedia.R;
import com.example.administrator.encyclopedia.fragment.ZhouGongFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FragmentWindows extends AppCompatActivity {



    private String mFragmentStartSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_windows);
        ButterKnife.bind(this);
        Intent intent = getIntent();
        mFragmentStartSwitch = intent.getStringExtra("title");
        startFragment(mFragmentStartSwitch);
    }

    private void startFragment(String mFragmentStartSwitch) {
        switch (mFragmentStartSwitch){
            case "周公解梦":
                replaceFragment(new ZhouGongFragment());
                break;

        }
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_wind,fragment);
        transaction.commit();
    }

}
