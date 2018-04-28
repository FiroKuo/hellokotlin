package basic

/*
kotlin中属性特点很强大：
1. 属性可以直接声明在包中
2. 除非abstract和lateinit 的属性，必须初始化
3. 具有标准化的getter/setter
4. 大量的修饰符
 */

//格式
//[修饰符] val|var 属性名[: 属性类型][= 初始化语句]
//[get() = getter 语句]
//[set() = setter 语句]

class Student(val name: String, property: String) {

    //注意
//1. 初始化语句一定要有 要么写在init()里
//2. val 类型的变量没有自定义的setter

    val age: Int

    val location: String = "china"

    init {
        age = 18
    }

    //kotlin 将get/set标准化，并且强制属性访问通过getter/setter方法 kotlin中对象.属性其实会编译为getter/setter方法
    //可以提供自定义的getter/setter
    //如果想为一个属性提供自定义的getter和setter 则不能在类头声明var/val 也没办法放在init中，setter/getter要和属性放在一起呀
    //所以只能放在类体中
    var property = property
        set(value) {//这里的value随便取的
            if (value.isEmpty()) {
                field = ""//filed是指幕后字段 相当于this.property
            } else {
                field = value.toUpperCase()
            }
        }
        get() {
            //记得 千万不要在getter中使用当前属性 kotlin对属性的访问都是通过getter去做的，会造成循环引用
//            return property
            if (field.isEmpty()) {
                return ""
            } else {
                return field
            }
        }
}

fun main(args: Array<String>) {

    val student = Student("firo", "greate")
    println(student.property)
    student.property = "not bad."
    println(student.property)

    //greate
    //NOT BAD.
    //可见 通过构造函数设置值并不会调用setter 直接赋值而已
}

/*
类外属性
 */
//包级属性
//可以定义包级属性 包级属性会被反编译成一个文件比方说 FieldTestKt 文件
val maxID = Int.MAX_VALUE
//反编译后是这样的：
//public final class FiledTestKt {
//    private static final int maxID = Integer.MAX_VALUE;
//    public static final int getMaxID() {
//        return maxID;
//    }
//}

//调用该属性的时候Kotlin和Java是不同的
//1. kotlin需要使用“包名.属性名”调用
//2. java需要导入生成文件，通过文件名调用getter方法

//编译期常量
const val minID = Int.MIN_VALUE
//反编译后是这样的：
//public final class FiledTestKt {
//    public static final int maxID = Integer.MAX_VALUE;
//}

//const:
//1. 只能定义在类外或者Object内
//2. 只能使用String 或者 原生类型
//3. 不能自定义getter 因为不需要 直接调用
//4. 注解中使用的常量只能是编译期常量

/**
 * 延时初始化 lateinit var name: String
 *
 * 当属性被标记为lateinit时 属性可以延迟初始化，但是如果在属性没有初始化时调用它 会抛出UninitializedPropertyAccessException异常
 */

