package com.mrwang.jcodecraeerclient

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.marktony.fanfouhandpick.interfaze.OnRecyclerViewOnClickListener
import com.mrwang.jcodecraeerclient.model.APIManager
import com.mrwang.jcodecraeerclient.model.NewList
import com.mrwang.jcodecraeerclient.view.NewListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var apiManager: APIManager
    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        apiManager = APIManager()

        apiManager.getNewList(object : Callback<NewList> {
            override fun onFailure(call: Call<NewList>?, t: Throwable?) {
            }


            override fun onResponse(call: Call<NewList>?, response: Response<NewList>?) {
                val items = response?.body()?.items
                if (items != null) {
                    val adapter = NewListAdapter(items, applicationContext)
                    adapter.items = items
                    val linearLayoutManager = LinearLayoutManager(applicationContext)
                    linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
                    recycler.layoutManager = linearLayoutManager
                    recycler.adapter = adapter
                    adapter.setItemClickListener(object : OnRecyclerViewOnClickListener {
                        override fun OnItemClick(v: View, position: Int) {
                            Toast.makeText(applicationContext, "click", Toast.LENGTH_LONG).show()
                            val item = items[position]
                            val intent = Intent(this@MainActivity, WebViewActivity::class.java)

                            val data=item.pubDate;
                            //2天以前
                            //14小时以前
                            //
                            intent.putExtra("url", item.url)
                            intent.putExtra("title", item.title)
                            startActivity(intent)
                        }
                    })
                }
            }
        })
    }

}
