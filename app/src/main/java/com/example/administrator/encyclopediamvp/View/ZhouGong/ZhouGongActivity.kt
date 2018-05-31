package com.example.administrator.encyclopediamvp.View.ZhouGong


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.example.administrator.encyclopediamvp.Adapter.ZhouGongAdapter
import com.example.administrator.encyclopediamvp.Bean.ZhouGongBean
import com.example.administrator.encyclopediamvp.IListener.MainRecyClickListen
import com.example.administrator.encyclopediamvp.Presenter.ZhouGongPresenter
import com.example.administrator.encyclopediamvp.R
import java.util.ArrayList
import kotlinx.android.synthetic.main.activity_zhou_gong.*
import kotlinx.android.synthetic.main.include_back.*
import kotlinx.android.synthetic.main.layout_serch.*

class ZhouGongActivity : AppCompatActivity(), IZhouGongView, View.OnClickListener, MainRecyClickListen {

    //初始化数据
    var p = ZhouGongPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zhou_gong)
        serch_button.setOnClickListener(this)
        setSupportActionBar(toolbar)
        var intent = getIntent()
        toolbar_back.setOnClickListener(this)
        toolbar_title.text = intent.getStringExtra("toolbar_title")
    }

    override fun SetRecy(beans: ArrayList<ZhouGongBean.ResultBean>) {
        val manager = LinearLayoutManager(this)
        manager.orientation = LinearLayoutManager.VERTICAL
        val adapter = ZhouGongAdapter(this, beans, this)
        recy_zhougong2.layoutManager = manager
        recy_zhougong2.adapter = adapter
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.serch_button -> p.SetRecy2(serch_input.text.toString().trim())
            R.id.toolbar_back -> finish()
        }
    }

    override fun MainRecyClickListener(toolbar_title: String) {

    }

    override fun ZhouGongClickListener(toolbar_title: String, rec: String) {

    }
}
