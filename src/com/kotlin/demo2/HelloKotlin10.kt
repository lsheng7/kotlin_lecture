package com.kotlin.demo2

//封装、继承、多态
//在kotlin中所有的类 默认情况下都是无法继承的
//换句话说在 kotlin中所有默认情况下都是final的


//open含义与final相反
open class Parent(name: String, age: Int) {


}

//compile error
//不能继承Parent(必须加上open)
class Child(name: String, age: Int) : Parent(name, age) {

}

//一个类没有primary构造方法
open class Parent2(name: String)

//在Kotlin中 如果一个类没有primary构造方法 那么这个类的secondary构造方法
//就需要通过super关键字来初始化父类型,或者通过其他的secondary构造方法来完成这个任务
//不同的secondary构造方法可以调用父类型不同的构造方法

class Child2 : Parent2 {

    //通过secondary调用父类的构造函数
    constructor(name: String) : super(name)

}

fun main(args: Array<String>) {

}