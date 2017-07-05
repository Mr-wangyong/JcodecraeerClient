package com.mrwang.jcodecraeerclient

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web_view.*


class WebViewActivity : AppCompatActivity() {

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)


        val url = intent.getStringExtra("url")
        val title = intent.getStringExtra("title")
        webView.setWebViewClient(object : WebViewClient() {
            override
            fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean { //  重写此方法表明点击网页里面的链接还是在当前的webview里跳转，不跳到浏览器那边
                view.loadUrl(url)
                return true
            }
        })
        webView.loadUrl(url)

    }
}
