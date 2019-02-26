package com.kotlin.demo
//package com.kotlin.demo2是一种逻辑上的概念
//但是java中是一种物理的磁盘路径概念

//main(String[] args)//c语言流派

fun main(args: Array<String>) {//flex开发语言及当代开发语言的形式

    println(sum(1, 2))
    println(sum2(3, 4))
    sum3(4, 5)
    sum4(6, 7)
}


//fun methodname(param:paramtype...):returntype
fun sum(a: Int, b: Int): Int {
    return a + b
}

//fun sum2(a:Int,b:Int):Int=a+b
fun sum2(a: Int, b: Int) = a + b

//:Unit表示无返回值 可以省略
//fun sum3(a: Int, b: Int): Unit {
fun sum3(a: Int, b: Int) {
    println(a + b)
}

//$a + $b = $(a + b)字符串模板
fun sum4(a: Int, b: Int) {
    println("$a + $b = ${a + b}")
}











