package com.kotlin.demo2


//range
//关于范围的表示
//..
fun main(args: Array<String>) {

    val a = 5
    val b = 10

    if (a in 2..b) {
        println("in the range[2,$b]")
    }
    if (a !in 2..b) {
        println("out the range[2,$b]")
    }

    println("--------------")

    //[]闭区间
    for (item in 2..b) {
        println(item)
    }

    println("--------------")

    for (item in 2.rangeTo(b)) {
        println(item)
    }

    println("--------------")


    //step 步长为2
    for (item in 2..b step 2) {
        println(item)
    }

    println("--------------")

    for(item in b downTo 2 step  4){
        println(item)
    }

}





