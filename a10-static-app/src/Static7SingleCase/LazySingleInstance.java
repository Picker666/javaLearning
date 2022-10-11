package Static7SingleCase;

/**
 * 懒汉单例
 *
 * 在真正需要改对象的时候，才去创建一个对象（延迟加载对象）。
 *
 * 设计步骤
 *
 *      定义一个类，构造器私有化
 *      定义一个静态变量，并私有化
 *      提供一个静态方法，以返回单例对象
 *
 *
 *  节省内存
 * */
public class LazySingleInstance {
    private LazySingleInstance () {}

//    定义一个静态成员变量，并私有化
    private static LazySingleInstance singleInstance;

//    对外提供一个方法，获取单例对象
    public static LazySingleInstance getInstance() {
        if (singleInstance == null) {
            singleInstance = new LazySingleInstance();
        }
        return singleInstance;
    }
}
