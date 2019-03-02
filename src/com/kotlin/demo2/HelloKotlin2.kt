package com.kotlin.demo2

fun main(args: Array<String>) {


    var array: IntArray = intArrayOf(1, 2, 3, 4, 5)

    //遍历数组
    for (item in array) {
        println(item)
    }


    println("----------")

    for (i: Int in array.indices) {//index的复数
        println("array[$i]=${array.get(i)}")
        println("----------")
        println("array[$i]=${array[i]}")
    }

    println("----------")


    //遍历索引及值
    for ((index, value) in array.withIndex()) {
        println("array[$index]=$value")
    }

}

