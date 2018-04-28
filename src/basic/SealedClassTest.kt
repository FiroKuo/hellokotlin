package basic

/*
密封类
是一个抽象类 不能实例化对象
密封类是为继承而设计的，可以看作封装类的枚举。
除了确定的子类外，密封类不能有其他直接的子类。
密封类的直接子类 要么写在父类内部 要么与父类放在同一个文件里
 */

sealed class Editor(val name: String) {

    //会被编译成静态内部类 public static final class IDEA{}
    class IDEA(name: String) : Editor(name) {

    }
}

//写在同一个文件中 不会被编译成内部类
class Eclipse(name: String) : Editor(name) {

}

/*
密封类的另外一个作用 在when语句中最后不用else 因为密封类的子类是确定的
 */