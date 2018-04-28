package basic


/*
kotlin中的Unit、Noting和null
 */


//官方解释Unit对应于Java中的void
//源码中Unit用object声明 表明这是一个单例
//Unit覆盖了toString()方法"Kotlin.Unit"
fun fail(): Unit {

}

//官方解释Nothing表示“从不存在”的值 没有实例
//源码中只是一个声明 没有方法体 并且将主构造函数private了
//当一个方法返回Nothing时 表示此方法永远不会执行成功
//Nothing 只是一个编译期的抽象概念（所以没有实例）。只有需要将一个函数显式标记为无法完成时，才有用 Nothing 类型的必要
//Nothing? 类型有且只有一个值：null
fun run(): Nothing {
    throw NullPointerException()
}

fun main(args: Array<String>) {

    var result = fail()
    //如果fail() 返回Unit result自动推断为Any类型
    //如果fail() 返回Nothing result自动推断为String类型 此时result要么不为null 要么抛异常
}

