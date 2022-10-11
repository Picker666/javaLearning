package Static7SingleCase;

/**
 * 饿汉模式
 *
 * 在获取对象的时候，对象已经提前为你创建好了
 *
 * 设计步骤：
 *  定一个类，把构造器私有
 *  定义一个静态变量存储对象
 *
 *
 *  速度快，浪费内存
 * */
public class SingleInstance {
//    构造器私有
    private SingleInstance() {}

//    饿汉模式是在获取对象前已经准备好了
    public static SingleInstance singleInstance = new SingleInstance();
}
