package interfaceStart;

/**
 * 接口：
 *      JDK8之前，接口中只能包含抽象方法和常量
 *
 *      接口是一种规范，规范一定是公开的
 * */
public interface Index {

//    1、常量
//    常量可以省略public static final
//    public static final String NAME = "Picker";
    String NAME = "Picker";

//    2、抽象方法
//    由于接口体现规范，规范要公开，所以，public abstract 可以省不写
//    public abstract void run();
    void run();

//    public abstract void eat();
    void eat();
}
