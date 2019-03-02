package com.kotlin.demo2

//对于一个抽象类来说 如果类没有声明任何的构造方法(primary及secondary)
//编译器会自动生成一个不带参数的构造方法
//这个不带参数的构造方法的访问级别是public的 java中默认的构造函数不是public的是default


//class Person private constructor()//单例的设计模式 构造函数私有化

//private val username, private val age: Int, private var address: String类的成员变量
//声明在构造方法参数中
//属性直接初始化

class Student(private val username: String, private val age: Int, private var address: String) {

    fun printinfo() {
        println("username=${this.username},age=${age},address=$address")
    }

}

//construct 关键字
//在构造方法 拥有注解或者可见性修饰符的时候 constructor是不可以省略的
//必须位于修饰符的后面
class Student2 private constructor(username: String)


//默认参数
//传递值的时候会覆盖
//如果对于primary构造函数的所有参数都拥有默认值
//编译器还会生成一个新的不带任何参数的构造函数
//会使用带参数的默认值


/**
 * 在JVM上,如果类的primary构造函数的所有参数都拥有
 * 默认值,那么kotlin编译器会为这个类生成一个不带任何参数的构造方法
 * 这个不带参数的构造方法会使用这些参数的默认值,这样做的目的是为了同spring等框架更好集成
 */

class Student3(var username: String = "zhangsan") {
    fun a() {
        println("username=$username")
    }
}


fun main(args: Array<String>) {
    var student = Student("zhangdan", 20, "beijing")
    student.printinfo()

    var student3=Student3()
    println(student3.username)


    student3=Student3("lisi")
    println(student3.username)
}


