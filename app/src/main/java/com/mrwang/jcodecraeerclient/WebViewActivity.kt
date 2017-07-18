package com.mrwang.jcodecraeerclient

import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView
import android.webkit.WebViewClient
import com.mrwang.jcodecraeerclient.model.APIManager
import com.mrwang.jcodecraeerclient.model.NewContent
import org.jetbrains.anko.support.v4.onRefresh
import org.jetbrains.anko.support.v4.swipeRefreshLayout
import org.jetbrains.anko.verticalLayout
import org.jetbrains.anko.webView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class WebViewActivity : AppCompatActivity() {

    private lateinit var refresh: SwipeRefreshLayout

    private lateinit var webView: WebView
    private var id: Int = 0

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout {
            refresh = swipeRefreshLayout {
                isRefreshing = true
                onRefresh {
                   loadData()
                }
                webView = webView {
                    setWebViewClient(object : WebViewClient() {})

                }
            }

        }


        val url = intent.getStringExtra("url")
        val title = intent.getStringExtra("title")
        id = intent.getIntExtra("id", 0)

        //actionBar.title=title
        webView.setWebViewClient(object : WebViewClient() {})
        loadData()


    }

    private fun loadData() {
        APIManager.getNewContent(id, object : Callback<NewContent> {
            override
            fun onFailure(call: Call<NewContent>?, t: Throwable?) {
                refresh.isRefreshing=false
            }

            override
            fun onResponse(call: Call<NewContent>?, response: Response<NewContent>?) {
                refresh.isRefreshing=false
                val content = response?.body()?.content!!
                webView.loadData(content, "text/html; charset=utf-8", "UTF-8")
            }
        })
    }
}
