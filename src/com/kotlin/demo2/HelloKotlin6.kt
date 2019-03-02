package com.kotlin.demo2


fun main(args: Array<String>) {

    var a = "hello\nworld"

    println(a)

    //演示转义字符 """中间的字符串会原封不动的输出"""
    var b = """hello/world\n#$&*"""
    println(b)


}