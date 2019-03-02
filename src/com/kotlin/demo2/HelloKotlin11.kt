package com.kotlin.demo2


open class Fruit {

    //函数默认也是final的必须指定好open修饰符
    open fun name() {
        println("fruit")
    }

    fun expirationDate() {
        println("one month")
    }

}

//Fruit()必须在类的声明处调用构造器
class Tomato : Fruit() {

    //重写父类的方法必须使用override修饰

    override fun name() {
        println("fruit:tomato")
    }
}


open class Orange : Fruit() {

    //方法不能被继承
    final override fun name() {
        println("fruit:orange")
    }
}

class ZsjOrange : Orange()


fun main(args: Array<String>) {

    var tomato = Tomato()
    tomato.name()
    tomato.expirationDate()

}