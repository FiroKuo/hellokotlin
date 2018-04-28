package basic

//操作符重载

//比如“+” 在Int 和 String中体现的行为是不同的
//如何做到的呢？背后都是函数 Int.plus()和String.plus()而已


//kotlin规定重载了操作符的函数用operator标记

//Kotlin中加减乘除自增自减加等非大于小于等与Java相同

//重点是Kotlin与Java不同之处
//==/!=  ===/!==
//前者Kotlin中调用的是对象的equals() 方法 Java中是比较引用地址
//kotlin中如想比较引用地址 使用===/!== 即可

fun <T> isEquals(a: T, b: T): Boolean {
    return if (a != null) {
        return a.equals(b)
    } else {
        return b === null
    }
}

val param = "hello"

fun main(args: Array<String>) {
//    val isEquals = isEquals(null, param)
//    println("isEquals:" + isEquals)
    println("list[x]=${list[4]}")
}

//[] 重载为get()/set() kotlin中[]不仅可以用于数组还可用于集合

val list = listOf<Int>(1, 2, 3, 4, 5)


//Java中有而Kotlin中没有的
//kotlin相比Java少了几个位运算 <<=、>>=、>>>=

//Kotlin中有而Java中没有的
//中缀表示法 是 Kotlin 定义的一种特殊的函数调用方式，标记为 infix ，并且只有一个参数的扩展函数或成员函数，可以使用这种表示方法。
//is !is 相当于Java中的InstanceOf 用于判断某个对象是否是某个类的实例
//in !in  b.contains(a) 用于for循环、Array、集合 相当于contains
//..a.rangeTo(b) 区间

