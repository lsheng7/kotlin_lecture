package com.kotlin.demo2

fun main(args: Array<String>) {

    println(convert2UpperCase("abc"))
    println(convert2UpperCase(1))

}

//Any表示接收任何的参数类型
fun convert2UpperCase(str: Any): String? {

    if (str is String) {//is 类似于instanceof
        return str.toUpperCase()//不需要强制转换 类型推断
    }

    //    java code segement
    //    if(str instanceof String){
    //       String str2=(String)str ;
    //       return str2.toUpperCase();
    //    }

    return null
}