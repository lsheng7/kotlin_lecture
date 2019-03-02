package com.kotlin.demo2


//when(java if while switch case)
fun main(args: Array<String>) {

    println(printlnFoo("hello"))
    println(printlnFoo("world"))
    println(printlnFoo("hello world"))
    println(printlnFoo("hello welcome"))
    println(printlnFoo2("test'"))

    println("------------------")
    var a = 60//是个变量

    var result = when (a) {
        1 -> {
            println("a=1")
            10
        }
        2 -> {
            println("a=2")
            20
        }
        3, 4, 5, 6 -> {
            println("a=3|4|5|6")
            30
        }

//        rangeTo 运算符重写
        in 7..10 -> {
            println("a=[7,10]")
            40
        }
        else -> {
            println("a is not in [1,10]")
            50
        }
    }

    println(result)
}


fun printlnFoo(str: String): String {

//    when (str) {
//        "hello" -> return "HELLO"
//        "world" -> return "WORLD"
//        "hello world" -> return "HELLO WORLD"
//        else -> return "other input"
//    }
    return when (str) {
        "hello" -> "HELLO"
        "world" -> "WORLD"
        "hello world" -> "HELLO WORLD"
        else -> "other input"
    }

}

//: String 可以省略
fun printlnFoo2(str: String): String = when (str) {
    "hello" -> "HELLO"
    "world" -> "WORLD"
    "hello world" -> "HELLO WORLD"
    else -> "other input"
}




