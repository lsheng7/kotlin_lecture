package com.kotlin.demo


//字符串转换成整数
fun main(args: Array<String>) {

    println(convertString2Int("123"))
    println(convertString2Int("123b"))//null
    multiply("123", "2")
    multiply("123", "2b")
    multiply2("123", "2")
}

//Int?  ?相当于java8中Optional 结果可能为null
fun convertString2Int(str: String): Int? {

    try {
        return str.toInt()
    } catch (ex: NumberFormatException) {
        return null
    }

}

fun multiply(a: String, b: String) {
    val a = convertString2Int(a)
    val b = convertString2Int(b)

    if (null != a && null != b) {
        println(a * b)
    } else {
        println("param not int")
    }

}


fun multiply2(a: String, b: String) {

    val a = convertString2Int(a)
    val b = convertString2Int(b)
//    if (null == a) {
//        println("param not int")
//    } else if (null == b) {
//        println("param not int")
//    } else {
//        println(a * b)
//    }

//    println(a*b)//Int?类型的

}






