package com.example.administrator.encyclopediamvp.View.Main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager

import android.widget.Toast

import com.example.administrator.encyclopediamvp.Adapter.MainRecyAdapter
import com.example.administrator.encyclopediamvp.Bean.MainAdapterBean
import com.example.administrator.encyclopediamvp.IListener.MainRecyClickListen
import com.example.administrator.encyclopediamvp.Presenter.MainPresenter
import com.example.administrator.encyclopediamvp.R
import com.example.administrator.encyclopediamvp.View.Express.ExpressActivity
import com.example.administrator.encyclopediamvp.View.HappyGif.HappyGifActivity
import com.example.administrator.encyclopediamvp.View.LucklyQQ.LucklyQQActivity
import com.example.administrator.encyclopediamvp.View.ZhouGong.ZhouGongActivity

import java.util.ArrayList

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), IMainView, MainRecyClickListen {


    var presenter: MainPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(this)
        presenter!!.present()

    }

    override fun SetRecyclerView(adapterBeans: ArrayList<MainAdapterBean>) {
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        val recyAdapter = MainRecyAdapter(this, adapterBeans, this)
        main_recycler.layoutManager = linearLayoutManager
        main_recycler.adapter = recyAdapter

    }

    override fun Welcome() {
        Toast.makeText(this, "欢迎使用百科全书", Toast.LENGTH_SHORT).show()
    }

    override fun MainRecyClickListener(title: String) {
        when (title) {
            "物流查询" -> {
                val intent1 = Intent(this, ExpressActivity::class.java)
                intent1.putExtra("title", title)
                startActivity(intent1)
            }
            "周公解梦" -> {
                val intent2 = Intent(this, ZhouGongActivity::class.java)
                intent2.putExtra("title", title)
                startActivity(intent2)
            }
            "搞笑图片" -> {
                val intent3 = Intent(this, HappyGifActivity::class.java)
                intent3.putExtra("title", title)
                startActivity(intent3)
            }
            "QQ号运势" -> {
                val intent4 = Intent(this, LucklyQQActivity::class.java)
                intent4.putExtra("title", title)
                startActivity(intent4)
            }
        }
    }

    override fun ZhouGongClickListener(title: String, rec: String) {

    }
}
