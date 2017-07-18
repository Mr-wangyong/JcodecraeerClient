package com.mrwang.jcodecraeerclient

import android.content.Intent
import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.marktony.fanfouhandpick.interfaze.OnRecyclerViewOnClickListener
import com.mrwang.jcodecraeerclient.model.APIManager
import com.mrwang.jcodecraeerclient.model.NewItem
import com.mrwang.jcodecraeerclient.model.NewList
import com.mrwang.jcodecraeerclient.view.NewListAdapter
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.support.v4.onRefresh
import org.jetbrains.anko.support.v4.swipeRefreshLayout
import org.jetbrains.anko.verticalLayout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var apiManager: APIManager
    lateinit var adapter: NewListAdapter//第一次访问的时候必须是 new 出来一个
    var pageIndex: Int = 0
    lateinit var recycler:RecyclerView
    lateinit var refresh:SwipeRefreshLayout

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout{
            refresh=swipeRefreshLayout {
                onRefresh {
                    pageIndex = 0
                    loadData(pageIndex)
                }
                isRefreshing = true
                recycler=recyclerView {

                }
            }

        }

        apiManager = APIManager
        apiManager.create(application)
        loadData()
        recycler.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override
            fun onScrollStateChanged(recyclerView: RecyclerView?, newState: Int) {
                if (recyclerView != null) {
                    //refresh.isRefreshing = false
                    val lm = recyclerView.layoutManager as LinearLayoutManager
                    val totalItemCount = recyclerView.adapter.itemCount
                    val lastVisibleItemPosition = lm.findLastVisibleItemPosition()
                    val visibleItemCount = recyclerView.childCount

                    if (newState == RecyclerView.SCROLL_STATE_IDLE
                            && lastVisibleItemPosition == totalItemCount - 1
                            && visibleItemCount > 0) {
                        //加载更多
                        pageIndex++
                        loadData(pageIndex)
                    }
                }

            }
        })

    }

    private fun loadData(page: Int = 0, isRefresh: Boolean = false) {
        apiManager.getNewList(object : Callback<NewList> {
            override fun onFailure(call: Call<NewList>?, t: Throwable?) {
                refresh.isRefreshing = false
            }

            override fun onResponse(call: Call<NewList>?, response: Response<NewList>?) {
                refresh.isRefreshing = false
                val items = response?.body()?.items
                if (items != null) {
                    if (recycler.adapter == null) {
                        adapter = NewListAdapter(mutableListOf<NewItem>(), applicationContext)
                        adapter.items.addAll(items)
                        val linearLayoutManager = LinearLayoutManager(applicationContext)
                        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
                        recycler.layoutManager = linearLayoutManager
                        recycler.adapter = adapter
                        adapter.setItemClickListener(object : OnRecyclerViewOnClickListener {
                            override fun OnItemClick(v: View, position: Int) {
                                //Toast.makeText(applicationContext, "click", Toast.LENGTH_LONG).show()
                                val item = adapter.items[position]
                                val intent = Intent(this@MainActivity, WebViewActivity::class.java)
                                intent.putExtra("url", item.url)
                                intent.putExtra("title", item.title)
                                intent.putExtra("id", item.id)
                                startActivity(intent)
                            }
                        })
                    } else {
                        if (isRefresh) {
                            adapter.items.clear()
                        }
                        adapter.addData(items)
                    }

                }
            }
        }, page)
    }
}


//                                apiManager.getBannerInfo(object : Callback<String> {
//                                    override fun onResponse(call: Call<String>?, response: Response<String>?) {
//                                        if (response != null) {
//                                            println("hahaha 成功了 ${response.body()}")
//                                        }
//                                    }
//
//                                    override fun onFailure(call: Call<String>?, t: Throwable?) {
//                                        println("hahaha 失败了")
//                                    }
//
//                                })
