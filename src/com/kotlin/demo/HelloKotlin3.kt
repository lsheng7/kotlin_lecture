package com.kotlin.demo


fun main(args: Array<String>) {

//    var x = 10
//    var y = 20
//
//    var max: Int
//    var min: Int
//
//    if (x > y) {
//        max = x
//        min = y
//    } else {
//        max = y
//        min = x
//    }
//
//    println("max=$max,min=$min")

//    println("------------------------")
//
//    var x = 10
//    var y = 20
//
//    var max = if (x > y) x else y
//    var min = if (x > y) y else x
//    println("max=$max,min=$min")
    println("------------------------")
    var x = 10
    var y = 20
    var max = if (x > y) {
        println("x>y") //command+shit+enter 补全
        x//代码块的返回值
    } else {
        println("x<=y")
        y
    }
    println("max=$max")


}