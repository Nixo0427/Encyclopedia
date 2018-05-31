package com.example.administrator.encyclopediamvp.View.Express

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.View
import android.widget.Toast
import com.example.administrator.encyclopediamvp.Adapter.ExpressAdapter
import com.example.administrator.encyclopediamvp.Bean.ExpressBean
import com.example.administrator.encyclopediamvp.Presenter.ExpressPresenter
import com.example.administrator.encyclopediamvp.R
import java.util.ArrayList
import kotlinx.android.synthetic.main.activity_express.*
import kotlinx.android.synthetic.main.include_back.*
import kotlinx.android.synthetic.main.layout_serch.*

class ExpressActivity : AppCompatActivity(), IExpressView, View.OnClickListener {

    //初始化数据
    internal var arrayList = ArrayList<ExpressBean.ResultBean.ListBean>()
    var presenter = ExpressPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_express)

        setSupportActionBar(toolbar)
        var intent = getIntent()
        toolbar_back.setOnClickListener(this)
        toolbar_title.text = intent.getStringExtra("toolbar_title")
        serch_button.setOnClickListener(this)
    }

    override fun SetRecy(expressBeanArrayList: ArrayList<ExpressBean.ResultBean.ListBean>) {
        arrayList = expressBeanArrayList
    }

    override fun Success() {
        Toast.makeText(this, "加载成功", Toast.LENGTH_SHORT).show()
    }

    override fun Fail(error: String) {
        if (error == null) {

        } else {
            Toast.makeText(this, "加载失败$error", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.serch_button -> {
                presenter.SetData(serch_input!!.text.toString().trim())
                setRecyView()
            }
            R.id.toolbar_back -> finish()
        }
    }

    fun setRecyView() {
        val sgl = StaggeredGridLayoutManager(1, LinearLayoutManager.VERTICAL)
        val adapter = ExpressAdapter(this, arrayList)
        recy_express.layoutManager = sgl
        recy_express.adapter = adapter
    }

}
