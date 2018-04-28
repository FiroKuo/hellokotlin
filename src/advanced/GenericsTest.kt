package advanced

/*
kotlin中的泛型
泛型即参数化类型 泛型使得强类型语言更加灵活
kotlin继承了Java的泛型系统 同时进行了一些加强
Kotlin中没有通配符?
 */


//kotlin中的泛型使用 ":" 指定上界 多个上界使用where
class Person<T : CharSequence, R>(var name: T, var age: R)
        where R : Int


fun main(args: Array<String>) {

//因为kotlin中有自动类型推断 所以看起来优雅很多

    var xiaoli: Person<String, Int> = Person<String, Int>("xiaoli", 18)

    var firo = Person<String, Int>("firo", 20)

    var liming = Person("liming", 23)
}

/*
生产者和消费者
kotlin中抛弃了通配符 引入了生产者和消费者
生产者只能读取 消费者只能写入 PECS
Java中的泛型是不型变的 就是说List<String>和List<Object>没有任何关系
协变：读取一个对象时，这个对象既可以是E，也可以是E的子类
逆变：写入一个对象时，这个对象既可以是E,，也可以是E的父类
协变和逆变正好对应于PECS，都是安全的
在kotlin中我们把生产者用out T标记 等价于Java中 ? extends T
把消费者用in T标记 等价于Java中 ? super T
 */

//kotlin中的型变
interface Generics<out T> {

}

fun test(generics: Generics<String>) {
    val obj: Generics<Any> = generics
}