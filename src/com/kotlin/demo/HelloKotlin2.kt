package com.kotlin.demo

//import com.kotlin.demo2.multiply//导入函数
import com.kotlin.demo2.multiply as mymultiply//使用别名

//main+tab自动生成 main函数
/*
/*可以使用嵌套注释
*/
*/
fun main(args: Array<String>) {

    //val定义一个常量 相当于final
//    val a: Int = 1
    //  a=2
    //可以省略类型 直接通过类型推断完成
    val a = 2
    var c = "hello"
    c = "world"
    println(c)


    var x = 10
    var y: Byte = 12
//    x=y//小范围转成大范围不允许
    x = y.toInt()
    println(x)


//使用其他包的函数 使用import导入
//  println(multiply(3,40))
    println(mymultiply(3, 40))

    println("-----------------------------")
    val m = intArrayOf(1, 2, 3)
// m= intArrayOf(3,4,5)   //compiler error
    m.set(0, 3)//改变引用的内容

    for (item in m){
        println(item)
    }

}