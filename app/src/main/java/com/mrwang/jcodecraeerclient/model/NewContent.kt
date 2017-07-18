package com.mrwang.jcodecraeerclient.model

/**
 * User: chengwangyong(chengwangyong@blinnnk.com)
 * Date: 2017/7/17
 * Time: 下午4:32
 */
data class NewContent(
        val id: Int,
        val title: String,
        val user: UserBean,
        val content: String,
        val click: Int,
        val comments: Int,
        val stow: Int,
        val upvote: Int,
        val downvote: Int,
        val url: String,
        val pubDate: String,
        val thumbnail: String)