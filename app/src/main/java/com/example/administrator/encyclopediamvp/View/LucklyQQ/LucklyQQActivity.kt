package com.example.administrator.encyclopediamvp.View.LucklyQQ

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import com.example.administrator.encyclopediamvp.Bean.LuckyQQBean
import com.example.administrator.encyclopediamvp.Presenter.LucklyQQPresenter
import com.example.administrator.encyclopediamvp.R
import kotlinx.android.synthetic.main.activity_luckly_qq.*
import kotlinx.android.synthetic.main.include_back.*
import kotlinx.android.synthetic.main.layout_serch.*

class LucklyQQActivity : AppCompatActivity(), ILucklyQQView, OnClickListener {

    //数据
    var presenter: LucklyQQPresenter? = null
    var Luckbean = LuckyQQBean()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luckly_qq)
        setSupportActionBar(toolbar)
        presenter = LucklyQQPresenter(this)
        val i = intent
        toolbar_title.text = i.getStringExtra("title")
        serch_button.setOnClickListener(this)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        toolbar_back.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.toolbar_back -> finish()
            R.id.serch_button -> {
                var QQ = serch_input.text.toString().trim()
                presenter!!.SetResult(QQ)
            }
        }
    }

    override fun setData(bean: LuckyQQBean) {
        Luckbean = bean!!
        Luckbean.showapi_res_body = bean.showapi_res_body
        Luck_QQNum.text = "QQ:" + serch_input.text.toString().trim()!!
        Luck_QQScore.text = "评分:" + Luckbean.showapi_res_body!!.score
        Luck_QQgrade.text = "评价:" + Luckbean.showapi_res_body!!.grade
        Luck_QQdesc.text = "分析:" + Luckbean.showapi_res_body!!.desc
        Luck_QQanalysis.text = "建议:" + Luckbean.showapi_res_body!!.analysis


    }
}
