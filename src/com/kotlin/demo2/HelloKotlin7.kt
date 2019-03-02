package com.kotlin.demo2

//kotlin 类的详解

//class EmptyClassBody{}//空的class body是可以省略的
//public 是可以省略的 默认是public 类名和文件源文件名称可以不同
//class EmptyClassBody

//在Kotlin中,一个类可以有一个primary的构造函数
// 以及一个或者多个secondary构造函数(重构造方法)
//primary 构造方法:
//constructor(username:String)
//在类的声明中 是类头(class header)的一部分 位于类名的后面 可以拥有若干个构造函数
//如果primary构造方法 没有任何注解或者可见性关键字的修饰 那么constructor关键字是可以省略掉的
//primary不能包含任何代码的 可以使用初始化代码块中完成 init{}
//class MyClass constructor(username:String)//表示MyClass有一个接收字符串的一个构造函数

class MyClass constructor(username: String) {
    //使用传进来的username给成员变量赋初始值
    private val username=username.toUpperCase()

    //初始化代码块 可以直接使用构造方法
    init {
        println(username)
    }
}

//main方法
fun main(args: Array<String>) {

    var myClass=MyClass("zhangdan")//对象的创建时可以省略new 关键字(相较于java)
    println(myClass)//com.kotlin.demo2.MyClass@266474c2

}