package com.mrwang.jcodecraeerclient

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import java.util.concurrent.atomic.AtomicInteger
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

/**
 * User: chengwangyong(chengwangyong@blinnnk.com)
 * Date: 2017/7/18
 * Time: 下午6:21
 */
object TestAsync {
    suspend fun doJob1(): Int {
        println("Doing Job1 ...")
        delay(1000)
        println("Job1 Done thread=${Thread.currentThread().name}")
        return 10
    }

    suspend fun doJob2(): Int {
        println("Doing Job2 ...")
        delay(1000)
        println("Job2 Done thread=${Thread.currentThread().name}")
        return 20
    }

    fun testSequential() = runBlocking {
        val time = measureTimeMillis {
            val one = doJob1()
            val two = doJob2()
            println("最终结果： ${one + two}")
        }
        println("Completed in $time ms")
    }

}

fun main(args: Array<String>){
    val job = launch(CommonPool) {
        delay(1000L)
        println("World!")
    }
    println("Hello,")

}

//fun main(args: Array<String>) {
//    thread(start = true) {
//        //async(CommonPool) {
//            //delay(1000)
//            TestAsync.testSequential()
//            println("Hello thread=${Thread.currentThread().name}")
//        //}
//        //delay(5000)//阻塞调用 直到完成
//    }
//    //Thread.sleep(5000) // wait for 2 seconds 不加这个 主线程退出之后协程也不存在了
//    println("Stop")
//    //method()
//
////    launch(CommonPool){
////        delay(1000)
////        println("Hello thread=${Thread.currentThread().name}")
////    }
////    async(CommonPool){
////        println("Hello thread=${Thread.currentThread().name}")
////    }
//
//}

suspend fun method(){
    //funA()
    funB()
}

private fun funA() {
    val c = AtomicInteger()

    for (i in 1..100)
        thread(start = true) {
            println("Hello thread=${Thread.currentThread().name} c=$c")
            c.addAndGet(i)
        }

    println("stop ${c.get()}")
}

suspend fun funB(){
   var job=launch(CommonPool){
      delay(1000)
       println("Hello")
   }
    println("world")
    job.join()
}
