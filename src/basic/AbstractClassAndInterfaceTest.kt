package basic


/*
kotlin中抽象类同java中相同 用abstract 关键字修饰
abstract关键字默认带有open光环
 */

//可以看到 属性、非抽象的方法还是需要open修饰 否则就是final类型
abstract class Pen(open var name: String, open val length: Int)

class Pencil(override var name: String, override var length: Int) : Pen(name, length) {

}

//接口没有构造函数
interface KotlinInterface {

    //kotlin接口中的变量可以存在但只能是抽象的 非抽象的子类必须覆盖该属性
    //kotlin接口中不能定义全局常量（至少现在不行 2018.4.28）
    var status: String

    //可以看到 kotlin中支持默认方法 如同 java_8 default关键字
    //目前kotlin的目标字节码还停留在JDK1.6
    // Kotlin 通过静态内部类 + 添加默认实现方法的方式实现了 JDK 1.6 中不支持的接口默认方法，给接口的设计带来了便利。
    fun printInfo() {
        println("kotlin is smart.")
    }

    fun learn()
}

abstract class AbstractLearnKotlin(status: String) : KotlinInterface {

//    override var status = status
}

class LearnKotlin(override var status: String) : KotlinInterface {

    override fun learn() {
    }

}
