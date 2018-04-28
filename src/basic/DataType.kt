package basic


fun main(args: Array<String>) {
//    printVarags()
    stringUse("hello")
}
//基础数据类型

//基础数据类型包含：数字类型 字符类型 字符串类型 布尔类型

//数字类型包括Byte Short Int Long Float Double 长度与Java中长度相同
//Kotlin中不存在与Java中相同概念的基本数据类型 在Kotlin中这些都是对象
//Kotlin 中 不支持自动类型转换 比如Int 不能 自动转换为Long

const val i: Int = 1
const val l: Long = i.toLong() //使用 to 方法显式地转换数字类型

//Kotlin不支持8进制表示法

//Kotlin中的Char是一个真正的字符 并不是整数
var char: Char = 'c';
var int: Int = 99;

fun printVarags() {
    println(char == int.toChar())
}

//kotlin支持转义字符 比如\n \r \t \b \' \" \\ \$ 以及Unicode转义写法 \uff00

//Kotlin中的String也是不可变对象
fun stringUse(name: String) {

    //String中常用的一个属性 三个方法
    println("${name}.length=${name.length}")
    println("${name}.subSequence=${name.subSequence(1, 3)}")
    println("${name}.get=${name.get(2)}")
    println("${name}.compareTo(world)=${name.compareTo("google")}")

    //String相当于一个CharArray
    for (c in name) {
        print(c + " ")
    }
}

//Boolean 完全相同