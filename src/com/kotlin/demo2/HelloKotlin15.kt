package com.kotlin.demo2


//对象声明Object Declaration
//对象表达式 Object Expression
//表示声明了一个对象
//对象声明
object MyObject {
    fun method() {
        println("method")
    }
}

//伴生对象 companion object
//在Kotlin中与java不同的是类是没有static方法
//在大多数情况下 kotlin推荐的做法是使用包级别的函数来作为静态方法
//kotlin会将包级别的函数作为静态方法来看待


class MyTest {

    //伴生对象
    //伴随着class存在
    //可以定义方法及method
    //如果没有指定伴生对象的名字 那么编译器会提供一个默认的名字Companion

    //注意:虽然伴生的成员看起来像java中的静态成员
    //但是在运行期间 他们依旧是真实对象的实例成员

    //在JVM上可以将伴生对象的成员真正成为类的静态成员(方法与属性)
    //这是通过@JvmStatic注解来实现的
    //伴生对象在编译后会生成一个静态内部类
    companion object MyCompanionObject {
        var a: Int = 100

        @JvmStatic
        fun method() {
            println("method invoked")
        }
    }

    //每个类有且只允许有一个伴生对象
//    companion object MyCompanionObject2{
//
//    }

}


//public final class com.kotlin.demo2.D {
//    public static final com.kotlin.demo2.D$Companion Companion;
//    public com.kotlin.demo2.D();
//    static {};
//    public static final void foo();
//}

class D {

    companion object {
        @JvmStatic
        fun foo() {
        }

        fun bar() {
        }
    }
}


//字节码:
//public final class com.kotlin.demo2.MyTest {
//    public static final com.kotlin.demo2.MyTest$MyCompanionObject MyCompanionObject;
//    public com.kotlin.demo2.MyTest();
//    static {};
//    public static final int access$getA$cp();
//    public static final void access$setA$cp(int);
//}


//加上 @JvmStatic注解buid
//public final class com.kotlin.demo2.MyTest {
//    public static final com.kotlin.demo2.MyTest$MyCompanionObject MyCompanionObject;
//    public com.kotlin.demo2.MyTest();
//    static {};
//    public static final int access$getA$cp();
//    public static final void access$setA$cp(int);
//    public static final void method();
//}


fun main(args: Array<String>) {

    MyObject.method()

//    MyTest.MyCompanionObject.method()
//    println(MyTest.MyCompanionObject.a)
    println("-------------------")
    MyTest.method()//类似于静态方法 同时kotlin中没有静态方法
    println(MyTest.a)

//    Returns the runtime Java class of this object.
//    内部类
//class com.kotlin.demo2.MyTest$MyCompanionObject
    val v = MyTest.MyCompanionObject
    println(v.javaClass)

    println("-------------------")
    D.Companion.bar()
    D.foo()
}

