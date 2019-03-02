package com.kotlin.demo2

//kotlin接口
//java8开始 interface可以包含方法实现[default method] 向后兼容及Stream支撑


interface A {

    //接口可以声明及实现
    fun method() {
        println("A interface method")
    }

}

open class B {

    open fun method() {
        println("B class method")
    }
}

//类的继承及接口实现
//class C : B(), A {//compile error
//
////    override fun method() {
//////super代表interface 还是class?
////        super.method()//compile error
////        println("C override method")
////
////    }
//}

class C : B(), A {//compile error

    override fun method() {

        //super代表interface 还是class
        //通过<A>指定
        super<A>.method()//compile error
        super<B>.method()
        println("C override method")

    }
}


fun main(args: Array<String>) {
    C().method()
}