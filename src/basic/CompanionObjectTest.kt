package basic

/*
kotlin中没有static关键字,为了保持与java的兼容性 有一下几种解决方案:
1. 包级属性和包级函数： 用于全局常量和工具函数
2. 伴生对象： 用于与类紧密关联的变量和函数
3. 使用@JvmStatic注解：与伴生对象搭配使用 将变量和函数声明为真正的JVM静态成员
 */

//---------可以参考FiledTest.kt
//1. 包级属性和包级函数
val property: String = "package_property"

fun getPropertyFromPackage(): String {
    return property
}

//2. 编译时常量 Int/String
const val CONSTANT_INT_MAX_VALUE = Int.MAX_VALUE

//---------伴生对象----------
//kotlin中使用object声明的类型，一般用作单例模式和伴生对象

//1. object声明 意味着属性方法都会成为静态成员 构造函数私有化 生成单例Resource对象
object Resource {

    //属性反编译后 private static final int resId=1300021;
    //会自动生成属性的getter方法 public static final getResId()
    val resId: Int = 1300021

    //反编译后方法为 public static final function()
    fun function() {
        println("This is a function.")
    }
}

//2. kotlin允许在类中声明companion object

class Desk(var name: String, var size: Int) {

    companion object {
        val weight: Int = 100

        fun buyADesk() {
            println("buy a new desk.")
        }
    }
}

/*
反编译后发现：
伴生对象实际上会在Desk类中生成一个名为Companion的静态单例内部类
伴生对象中定义的属性会被直接编译到外部类的属性区 private static final 与之对应的getter方法还是在Companion类中 public static final getter
伴生对象中的函数还是被编译成public static final function() 同样放在Companion类中
 */

///使用属性和方法的时候可以使用外部类.属性方法即可
fun main(args: Array<String>) {
    println("desk's weight=${Desk.weight}")
    println(Desk.buyADesk())
}

//3. @JvmStatic注解
/*
@JvmStatic 注解只能用在伴生对象里，修饰伴生对象内的属性和函数，用来告诉编译器将属性和函数编译为真正的 JVM 静态成员。
需要注意到，如果在伴生对象声明里使用 @JvmStatic 注解，那么没有加该注解的属性和函数将不会被编译为静态成员
 */
class Gift(val name: String) {
    companion object {
        @JvmStatic
        val anonymous = Person("Anonymous")

        fun say() = println("Hello")
    }
}
//上面的伴生对象里定义了两个成员，anonymous 使用 @JvmStatic 注解修饰，会被编译为 Person 类的静态成员，Kotlin 和 Java 中都可以用 Gift.anonymous 来调用它；
//而 say() 方法没有用 @JvmStatic 注解修饰，会被编译为 Gift.Companion 类的成员，Kotlin 中可以用 Gift.say() 来调用，但 Java 中只能用 Gift.Companion.say() 调用。
