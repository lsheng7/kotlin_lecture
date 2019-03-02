package com.kotlin.demo2

import java.util.function.Consumer

fun main(args: Array<String>) {

//    <String>可以省略
    var array = listOf("hello", "world", "hello world", "welcome", "goodbye", "kotty")


    for (item in array) {

        println(item)
    }
    println("----------------")

    when {
        "world" in array -> println("world in collection")
    }
    println("----------------")


    //找到长度=5的->转换成大写->排序->输出
    var result = arrayListOf<String>()
    for (item in array) {
        when (item.length) {
            5 -> result.add(item.toUpperCase())
        }
    }
    result.sort()
    println(result.size)
    result.forEach(Consumer { println(it) })
//    result.forEach(System.out::println)
    println("----------------")
    //lamda
    //it是语法糖 代表当前遍历的对象
    array.filter { it.length == 5 }.map { it.toUpperCase() }.sorted().forEach { println(it) }


























}
