package basic

//kotlin中数组使用Array而不是T[]
fun main(args: Array<String>) {
    println("Hello World.")

//    println(add());
}

//kotlin 中函数的格式 访问控制符 修饰符 fun 泛型 扩展接受类型.函数名(参数列表) 返回值类型
//kotlin 中的访问控制符分为四种：public protected internal private  默认为public
//kotlin 中的修饰符比如 infix inline

fun <T> singleElementList(item: T): List<T> = listOf(item)

//kotlin 没有返回值时可以返回Unit 通常省略
fun sayHello(name: String): Unit = println("Hello,world.")

//kotlin 返回值类型可以自动推断的时候 返回值类型可省略
fun multipy(arg1: Double, arg2: Double) = arg1 * arg2

//kotlin 函数体只有一句时 可省略大括号

//kotlin 可以为参数指定默认值
fun add(a: Int = 0, b: Int = 1) = a + b

//可变参数用关键字vararg 标志 放在参数列表最后一项 在函数内表现为对应的数组
fun add(a: Int, b: Int, vararg n: Int): Int {

    var c: Int = a + b

    for (i in n) {
        c += i
    }
    return c;
}