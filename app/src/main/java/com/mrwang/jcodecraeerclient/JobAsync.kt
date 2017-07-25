package com.mrwang.jcodecraeerclient

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking

/**
 * User: chengwangyong(chengwangyong@blinnnk.com)
 * Date: 2017/7/18
 * Time: 下午6:21
 */

/**
 * 这里例子非常生动
 * 打印 hello 花费了5000
 * 打印 world 花费了1000
 * 同一个线程
 * 但是依旧是打印出 hello World
 * 说明是顺序执行的
 */
fun main(args: Array<String>) = runBlocking {
    val imageA = async(CommonPool) { loadImage("Hello",5000) }
    println("loadImageA thread=${Thread.currentThread().name}")
    val imageB = async(CommonPool) {loadImage("world",1000) }
    println("loadImageB thread=${Thread.currentThread().name}")
    onImageGet(imageA.await(), imageB.await())
}

//fun main(args: Array<String>) {
//    launch(CommonPool){
//        val imageA=loadImage("Hello",5000)
//        println("loadImageA thread=${Thread.currentThread().name}")
//        val imageB=loadImage("world",1000)
//        println("loadImageB thread=${Thread.currentThread().name}")
//        onImageGet(imageA,imageB)
//    }
//    Thread.sleep(10000)
//}

fun onImageGet(imageA: String, imageB: String) {
    println("imageA=$imageA imageB=$imageB")
}

suspend fun loadImage(url: String,time:Long): String {
    delay(time)
    println("loadImage url=$url thread=${Thread.currentThread().name}")
    return url
}