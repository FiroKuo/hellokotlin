package basic

//kotlin中类的格式如下
//class 类名[主构造函数][{
//    //类成员
//}]

//kotlin中分为主构造函数和次构造函数 主构造函数写在类头 有且只有一个
//1. 如果主构造函数没有任何修饰符 可以省略constructor 关键字
//2. 如果主构造函数参数使用var/val修饰 意味着会自动创建同名成员变量 并会自动为其赋值(调用构造函数传入的值)
//3. kotlin 可以在函数参数中为形参指定默认值，这就避免了Java中写多个构造函数的情况
//4. 如果一个类有了主构造函数，那么次构造函数都应该直接或者间接（委托给其他次构造）地委托给主构造函数
class Person(val name: String, var age: Int, val sex: String = "male") {

    init {
        //主构造函数的函数体 完全可以将var/val声明到主构造函数中 这样会自动赋值
//        this.age = age
    }

    //次构造函数中不能声明var/val
    var location: String = "shanghai"

    //次构造函数必须调用主构造函数 : this()
    constructor(location: String = "beijing") : this("firo", 22) {
        //location变量不能声明为val 因为这里要赋值
        this.location = location
    }

    //创建对象不使用new关键字
    var info = StringBuilder("I'm from China.")

    fun main(args: Array<String>) {

    }
}