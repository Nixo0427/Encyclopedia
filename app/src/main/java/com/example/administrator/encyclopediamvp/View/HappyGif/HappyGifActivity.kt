package com.example.administrator.encyclopediamvp.View.HappyGif

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import com.example.administrator.encyclopediamvp.Adapter.HappyGifAdapter
import com.example.administrator.encyclopediamvp.Bean.HappyGifBean
import com.example.administrator.encyclopediamvp.IListener.MainRecyClickListen
import com.example.administrator.encyclopediamvp.Presenter.HappyGifPresenter
import com.example.administrator.encyclopediamvp.R
import com.example.administrator.encyclopediamvp.View.IBaseView
import java.util.ArrayList
import kotlinx.android.synthetic.main.activity_happy_gif.*
import kotlinx.android.synthetic.main.include_back.*

class HappyGifActivity : AppCompatActivity(), View.OnClickListener, IBaseView, MainRecyClickListen {

    //获取数据
    var presenter : HappyGifPresenter = HappyGifPresenter(this)
    var IndexPage = 1
    var beans: ArrayList<HappyGifBean.ShowapiResBodyBean.ContentlistBean> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_happy_gif)
        setSupportActionBar(toolbar)
        var intent = getIntent()
        supportActionBar!!.setDisplayShowTitleEnabled(false)
        toolbar_title.text = intent.getStringExtra("title")

        presenter.SetPage(IndexPage)
        //点击事件
        toolbar_back.setOnClickListener(this)
        happygif_pre.setOnClickListener(this)
        happygif_next.setOnClickListener(this)
        //触发presenter初始化第一页
        happygif_page!!.text = "第" + IndexPage + "页"

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.happygif_pre -> {
                IndexPage--
                Log.i("page", "" + IndexPage)
                presenter.SetPage(IndexPage)
            }
            R.id.happygif_next -> {
                IndexPage++
                presenter.SetPage(IndexPage)
            }
            R.id.toolbar_back -> finish()
        }
    }

    override fun SetRecy(arrayList: ArrayList<*>) {
        beans = arrayList as ArrayList<HappyGifBean.ShowapiResBodyBean.ContentlistBean>
        val sgl = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        val adapter = HappyGifAdapter(beans, this, this)
        recy_happygif.layoutManager = sgl
        recy_happygif.adapter = adapter
    }

    override fun Success() {

    }

    override fun Fail(error: String) {

    }


    override fun MainRecyClickListener(title: String) {

    }

    override fun ZhouGongClickListener(title: String, rec: String) {

    }
}
