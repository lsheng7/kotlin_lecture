package com.kotlin.demo2


//郝洋
//李嘉冰
//周江波
//欧阳振
//江嘉恒


class Person constructor(username: String) {

//private var username: String = "abc"
//private var username:String?=null
//private var username:String=null//compile error

    private var username: String

    private var age: Int

    private var address: String

    //构造函数初始化
    //及成员变量的初始化
    init {
        println(username)
        this.username = username
        this.age = 20
        this.address = "BeiJing"
        println("init block invoked")
    }

    //secondary 构造函数 放在class body 类体内
    //必须直接或者间接地调用primary构造函数
    //:this(username)
    constructor(username: String, age: Int) : this(username) {
        println("username=$username,age=$age")
        this.username = username
        this.age = age
        this.address = "BeiJing"
    }

    //调用上面的构造函数
    constructor(username: String, age: Int, address: String) : this(username, age) {
        this.address = address
        println("username=$username,age=$age,address=${this.address}")
    }

}

fun main(args: Array<String>) {

//    var person = Person("zhang")
//    println(person)

    var person2 = Person("ketty", 30)
    println(person2)


    var person3 = Person("ketty", 30, "shanghai")

    println(person3)
}