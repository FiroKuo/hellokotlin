package basic

/*
数据类 用data修饰class 即为数据类
 */
//细节： 数据类主构造函数中至少有一个参数 且参数必须用var/val来修饰
data class Intelliji(val name: String, var age: Int)

/*
data类型的Intelliji类反编译后：可以看到仅一行代码 kotlin为我们做了大量的工作

public final class Intelliji {
  @NotNull private final String name;
  private int age;
  //省略 getName()、getAge()、setAge()
  
  public Intelliji(@NotNull String name, int age) {
    this.name = name;
    this.age = age;
  }
  
  public final Intelliji copy(@NotNull String name, int age) {
    return new Intelliji(name, age);
  }
  
  @Override
  public boolean equals(Object o) {
    if (this != o) {
      if (o instanceof Intelliji) {
        Intelliji castedO = (Intelliji) o;
        if (this.name.euqals(castedO.name) 
            && this.age == castedO.age)
          return true;
      }
      return false;
    } else return true;
  }
  
  @Override
  public int hashCode() {
    return this.name.hashCode() * 31 + this.age;
  }
  
  @Override
  public String toString() {
    return "Intelliji(name=" + this.name + ", age=" + this.age + ")";
  }
  
  public final String component1() {
    return this.name;
  }
  
  public final int component2() {
    return this.age;
  }
}
 */

//我们可以发现 构造函数 getter setter
//copy()--更简单的创建对象
//equals() hashcode()
//toString()
//componentN()析构函数