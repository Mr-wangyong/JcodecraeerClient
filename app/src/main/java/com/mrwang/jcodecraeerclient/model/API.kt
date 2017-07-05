package com.mrwang.jcodecraeerclient.model

import retrofit2.Call
import retrofit2.http.GET

/**
 * http://www.jcodecraeer.com/a/kaifarizhi/2017/0417/7836.html
 * User: chengwangyong(chengwangyong@blinnnk.com)
 * Date: 2017/7/4
 * Time: 下午6:32
 */
interface API {
    @GET("article_list.php")
    fun getNewList(): Call<NewList>

}
