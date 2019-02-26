package com.kotlin.demo

import java.util.function.Consumer


/**
 * 1. 没看到类
 * 2. 参数在前面 参数类型在后
 * 3. 没有分号;
 * 4. 可以跟java进行互操作
 *
 */
fun main(args:Array<String>){

//    println("hello world!")

    val list:List<String> = listOf("hello","world","weclome")

    //增强for循环 省略元素的类型描述
    for(str in list){
        println(str)
    }

    println("----------------------")
    list.forEach(Consumer { println(it) })//it表示当前遍历的元素
    println("----------------------")
    list.forEach(System.out::println)

}