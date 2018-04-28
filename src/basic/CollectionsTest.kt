package basic


/*
kotlin 集合框架
kotlin中的集合框架直接继承自Java 因为Java中的集合框架太优秀了
但是kotlin也做了一些改动，相当于功能加强吧
1. 集合有可变集合和不可变集合之分
2. Iterator 接口 支持迭代 Int Short Long Float Double Char 6中类型
3. 拓展函数
 */

/*
可变与不可变：
1. 可变与不可变不是值元素是var还是val类型的 是指集合本身：元素、大小、序列
2. Kotlin 集合框架里，所有的可变集合都继承自相同的不可变集合，比方说 MutableCollection 是 Collection 的子接口
3. 一般来说，不可变集合只能对元素进行读取和查询，可变集合才能对元素进行增减和赋值
4. 相对于 Java 集合，Kotlin 的不可变集合只拥有一部分功能，可变集合才拥有完整的功能
 */