package com.mrwang.jcodecraeerclient.model

import android.content.Context
import android.os.Environment.getExternalStorageDirectory
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * User: chengwangyong(chengwangyong@blinnnk.com)
 * Date: 2017/7/4
 * Time: 下午6:29
 */
object APIManager{
    lateinit var api: API
    var baseUrl = "http://api.jcodecraeer.com/"



    fun create(application:Context){
        val cacheDir = getExternalStorageDirectory()
        //var postCache = com.mrwang.jcodecraeerclient.model.Cache(cacheDir, 100 * 1024 * 1024)

        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val okHttpClient = OkHttpClient()
                .newBuilder()
                .addInterceptor(httpLoggingInterceptor)
                .addInterceptor(RetrofitCacheInterceptor(application))
                .cache(Cache(cacheDir, 20 * 1024 * 1024))
                .build()
        val retrofit = Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()
        api = retrofit.create(API::class.java)
    }

    fun getNewList(callBack: Callback<NewList>,page: Int = 0) {
        api.getNewList(page).enqueue(callBack)
    }

    fun getNewContent(id: Int, callBack: Callback<NewContent>) {
        api.getNewContent(id).enqueue(callBack)
    }

    fun getBannerInfo(callBack: Callback<String>) {
        api.getBannerInfo().enqueue(callBack)
    }


}