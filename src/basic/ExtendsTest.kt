package basic

/*
1. kotlin中所有的顶级父类是Any
2. kotlin中非abstract类默认不可继承
3. kotlin中非抽象类和函数和类属性默认不可覆盖
 */

//类方法属性默认是final的 类如果没有声明为open 属性方法同样为final类型
open class Humanity(open var name: String, age: Int) {
    open var age = age

    open fun eat() {
        println("humanity eat.")
    }
}

//kotlin中“:”表示前者属于后者类型
//如果父类中定义了主构造函数 子类必须显式地调用父类的主构造函数
//覆盖属性、方法必须用override关键字声明
//override 也是可以写在类头的 var name 不能覆盖为 val类型 反之可以
open class Teacher(override var name: String, age: Int, teacherId: Long) : Humanity(name, age) {

    //var age 不能覆盖为 val 这个主要是多态方面没法调用setter赋值
    override var age = age

    open val teacherId = teacherId

    override fun eat() {
        println("teacher eat.")
    }
}

class ChineseTeacher(override var name: String, age: Int, final override val teacherId: Long) : Teacher(name, age, teacherId) {

    override var age = age

    //方法属性声明为final override意为这个方法属性到头了 子类不可覆盖
    final override fun eat() {
        println("chinese teacher eat.")
    }

}

