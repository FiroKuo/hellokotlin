package basic


/*
kotlin中的访问修饰符有四个： public internal protected private
1. kotlin抛弃了java中的默认修饰符 添加了internal修饰符
2. kotlin的修饰符扩大至包级范围 包括包级属性和包级函数
3. kotlin对private和protected的访问范围做了一些修改

1. internal是指模块内可见 模块是一个大于包小于项目的概念

2.包级属性和包级函数的public internal和类相同
--->
    private:同文件内可见.因为包级属性和包级函数会被编译为“文件类”内的静态成员，所以如果用 private 修饰，它们就只在这个文件类里可见，也就是文件内可见。
    protected: 不可用. 因为protected用于继承


3. 对 private 和 protected 的修改
对 private 的修改除了上面的同文件可见外，还包括一点：

外部类不能访问内部类的 private 成员。这让内部类的封装更加完善。

对 protected 的修改也只有一点：

子类覆盖父类的 protected 成员，如果不加访问修饰符，默认也是 protected 的。
 */