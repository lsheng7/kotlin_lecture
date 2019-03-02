package com.kotlin.demo2


//抽象类的概念

open class BasicClass {


    open fun method() {

    }
}

abstract class ChildClass : BasicClass() {

    override abstract fun method()

}

fun main(args: Array<String>) {

}