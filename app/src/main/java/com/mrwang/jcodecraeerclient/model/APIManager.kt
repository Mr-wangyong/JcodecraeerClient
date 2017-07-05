package com.mrwang.jcodecraeerclient.model

import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * User: chengwangyong(chengwangyong@blinnnk.com)
 * Date: 2017/7/4
 * Time: 下午6:29
 */
class APIManager {
    var api: API
    var baseUrl = "http://api.jcodecraeer.com/"

    init {
        val retrofit = Retrofit.Builder().baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        api = retrofit.create(API::class.java)
    }


    fun getNewList(callBack:Callback<NewList>) {
        api.getNewList().enqueue(callBack)
    }


}