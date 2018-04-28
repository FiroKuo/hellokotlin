package basic


/*
Java中空指针异常造成的崩溃不是第二也是第一了
而且NPE属于运行时异常，并不容易发现
即使有意识小心谨慎地去避免 总有点亡羊补牢的意思 并且这种模版代码(if-else)使程序有点难看

Kotlin并不是消灭NPE 但它相当于能让你在编译时注意到NPE的存在
 */

//在Kotlin中 所有的数据类型默认都是非空的 除非显式声明此类型可能为null


//val name: String = null 这是编译不过的
val name: String? = "My name is Firo." //使用?声明为可空类型

//这样在使用non-null类型的变量时 可以放心的调用变量的属性方法 不用担心NPE

/*
对于可空对象 如何安全的调用它的属性方法呢？
使用空安全操作符 "?." 它就是个语法糖 背后就是个三元表达式
如果在变量使用之前已经进行过null判断 那么kotlin会将变量转换为非空类型 比较智能
 */

/*
Elvis操作符
Elvis操作符是指 "?:" 是三元表达式的一种简写形式
可以使用Elvis和空安全操作符搭配使用，为空安全操作符提供了else ==null 的处理情况
 */

fun main(args: Array<String>) {
    val result = name?.length ?: "0"
    println("result=$result")

//    val array = arrayOf(1, 2, 3, 4)
//    printData(array)
    printProperty(null)
//    Exception in thread "main" kotlin.KotlinNullPointerException
//    at basic.NullSafeTestKt.printProperty(NullSafeTest.kt:66)
//    at basic.NullSafeTestKt.main(NullSafeTest.kt:38)
}

/*
空安全操作符"?."加强版--配合let使用
主要是let可以接受函数 提供了更多的操作可能
 */

fun <T> printData(array: Array<T>?) {

    array?.let {
        it.forEach {
            println(it.toString())
        }
    }
}

/*
非空操作符"!!"
在kotlin中产生NPE的办法有两个：一是主动throw NPE ; 一是使用非空操作符"!!"

当使用非空操作符"!!"的时候 如果数据本身为null 肯定会抛出NPE异常 有点自欺欺人的意思

Kotlin不建议广泛使用"!!" 因为广泛使用"!!"会使kotlin中的安全机制作废 就和Java没啥区别了
 */

fun <T> printProperty(data: T?) {

    print(data!!.toString())
}