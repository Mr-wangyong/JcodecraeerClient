package com.mrwang.jcodecraeerclient.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query

/**
 * http://www.jcodecraeer.com/a/kaifarizhi/2017/0417/7836.html
 * User: chengwangyong(chengwangyong@blinnnk.com)
 * Date: 2017/7/4
 * Time: 下午6:32
 */
interface API {
    @GET("article_list.php")
    fun getNewList(@Query("p") page: Int = 0): Call<NewList>

    @GET("article_detail.php")
    fun getNewContent(@Query("id") id: Int): Call<NewContent>

    @Headers(
            "token: d1d50609-e381-40b0-9b22-c88224d6c128")
    @POST("http://testapi1.naonaola.com/user/bannersInfo")
    fun getBannerInfo(): Call<String>
}
