package com.kotlin.demo2

//属性的重写
open class MyParent {
    open var name: String = "parent"
}

class MyChild : MyParent() {
    override var name: String = "child"
}


class MyChild2(override var name: String = "lisi") : MyParent()


open class MyParent3 {

    open fun method() {
        println("parent method")
    }

    //get method
    open val name: String get() = "parent"

}


//var 可以重写val属性[本质上是一个get() var相当于get() set()]增加父类属性的范围
//可读可写-可读
//val 不可以重写var属性
//只读-可读可写

//val 可以override val
//var 可以override val var
//val 不可以override var
//本质上val相当于get() var相当于get() set()
class MyChild3 : MyParent3() {

    override fun method() {
        super.method()
        println("child method")
    }

    override val name: String
        get() = super.name + ",child"
}


fun main(args: Array<String>) {

    println(MyChild().name)
    println(MyChild2().name)

    println("-------------")
    var child3 = MyChild3()
    child3.method()
    println(child3.name)

}