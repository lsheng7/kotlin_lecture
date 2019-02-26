package com.kotlin.demo

//通过官方的compiler编译执行

//使用javap命令反编译查看编译后的文件
//kotlin编译会自动将不在任何类的函数 放到一个类中
//从而符合jvm规范

//C:\alipay\kotlin_lecture\out\production\kotlin_lecture\com\kotlin\demo>javap CompilerKt.class
//Compiled from "Compiler.kt"
//public final class com.kotlin.demo.CompilerKt {
//    public static final void main(java.lang.String[]);
//}

//需要结合jvm的字节码进行比较查看
//C:\alipay\kotlin_lecture\out\production\kotlin_lecture\com\kotlin\demo>javap -c CompilerKt.class
//Compiled from "Compiler.kt"
//public final class com.kotlin.demo.CompilerKt {
//    public static final void main(java.lang.String[]);
//    Code:
//    0: aload_0
//    1: ldc           #9                  // String args
//    3: invokestatic  #15                 // Method kotlin/jvm/internal/Intrinsics.checkParameterIsNotNull:(Ljava/lang/Object;Lja
//    va/lang/String;)V
//    6: ldc           #17                 // String hello world
//    8: astore_1
//    9: getstatic     #23                 // Field java/lang/System.out:Ljava/io/PrintStream;
//    12: aload_1
//    13: invokevirtual #29                 // Method java/io/PrintStream.println:(Ljava/lang/Object;)V
//    16: return
//}

//可以使用kotlinc命令完成kotlin源码的打包
//kotlinc HelloWordDemo.kt -include-runtime -d Kt.jar
fun main(args: Array<String>) {
    println("hello world")
}
