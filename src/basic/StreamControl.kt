package basic


fun main(args: Array<String>) {

//    println("max:${max(100, 200)}")
//    isSwitchType(8)
//    isSwitchType(-300)
//    println("flag=${flag}")

    forTest()
}
/*
条件语句
 */

//Kotlin中if既是个语句 又是个表达式 所以Kotlin中不需要“三元表达式”这种东西

//if 作表达式 当if作语句的时候 一定有表达式
fun max(a: Int, b: Int): Int = if (a > b) a else b

//if 作语句
fun min(a: Int, b: Int): Int {
    if (a > b) {
        return b
    } else {
        return a
    }
}

//when
//when表达式可比switch优秀多了 Java中的 switch 仅限于整数的包装类、String、枚举
//when中可以用is/in

fun isSwitchType(x: Any?) {
    when (x) {
        !is Int -> println("${x} is not integer")
        in 1..10 -> println("${x} is from 1 to 10")
        else -> println("${x} is not from 1 to 10")
    }
}

//when可以有不带参数的表达式 相当于if-else if -else

fun isSwitchType(x: Int?) {
    when {
        x !is Int -> println("x is not integer")
        x < 0 -> println("x <0")
        else -> println("x >=0")
    }
}

//when 可以用作表达式

val flag = when {
    (1 and 1) == 1 -> true
    else -> false
}

/*
循环语句
 */

//原则：能用流的地方不要用循环
//Kotlin中没有三段式参数 使用关键字in
//如需遍历数组和集合的index 可用indices属性
//如需遍历索引和值 可用withIndex()方法

fun forTest() {
    val list = listOf<Int>(1, 2, 3, 4, 5)
//    for (i in list.indices) {
//        println("list[$i]=${list[i]}")
//    }
//    for ((index, value) in list.withIndex()) {
//        println("list[$index]=${value}")
//    }
    for (i in list.withIndex()) {
        println("list=$i")
    }
    /*
list=IndexedValue(index=0, value=1)
list=IndexedValue(index=1, value=2)
list=IndexedValue(index=2, value=3)
list=IndexedValue(index=3, value=4)
list=IndexedValue(index=4, value=5)
     */

    for (i in 5 downTo 1) println(i)
    for (i in 10 downTo 0 step 3) println(i)
}

//区间 min..max 只要实现了compare接口的类型 都可以使用区间 但是我们使用较多的是整数区间
//而且只有整数区间才可以使用for循环
//使用downTo()倒序
//使用step() 设置步长 只能是整数

//Kotlin中的while 和Java中完全一样

/*
跳转语句
 */

//Kotlin中的跳转语句和Java中相同 ：break continue return, 但Kotlin的强大之处在于return @tag 1;这种形式
//也就是说Kotlin可以返回到tag位置，而不是像Java那样 跳出整个函数 kotlin为每一个高阶函数设置了标签，即方法名本身
