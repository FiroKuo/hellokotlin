package basic

/*
 Kotlin中Array的用法
 */
fun main(args: Array<String>) {

    for (a in emptyArray1) {
        println(a)
    }

    println(array[0])
}


//常用构造array的方式
//其一 arrayOf()
var array = arrayOf("hello", "world", 1, 5L)

//其二 arrayOfNulls() 创建指定size的Array 但是每个元素都是null
val arrayNulls = arrayOfNulls<Int>(5)

//其三 构造函数 创建 元素具有某种规律的array
val specArray = Array(10, { i -> i * i })

//其四 创建一个null数组
val emptyArray1 = arrayOfNulls<String>(0)

//其五 创建基本类型的数组可以使用优化过的array  intArrayOf()优于Array<Int>
val doubleArray = doubleArrayOf(3.3, 4.3, 5.6)
val doubleArray0 = arrayOf(3.3, 4.3, 5.6)
//没法比较 不是相同的类型
//var isSame = Arrays.equals(doubleArray0, doubleArray)
