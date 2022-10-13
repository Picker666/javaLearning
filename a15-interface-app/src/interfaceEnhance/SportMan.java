package interfaceEnhance;

/**
 * 注意事项：
 *      1、接口不能创建对像
 *      2、一个类实现多个接口，多个接口中有同样的静态方法，他们不冲突，（因为接口的静态方法只能接口自己调用）
 *      3、一个类继承了父类，同时又实现了接口，父类和接口中有同名的方法，默认用父类的方法
 *      4、一个类实现多个接口，多个接口存在同名的默认方法，不冲突，这个类重写该方法就行了
 *      5、一个接口继承多个接口，是没问题的，但是如果多个接口中存在规范冲突，则不能继承
 *
 * */

public interface SportMan {
//    1、JDK8开始，默认方法，使用default修饰
//    默认方法，接口不能创建实例，这个方法只能过继给实例，由实现类的对象调用
    default void run(){
        go();
        System.out.println("跑的很快。。。");
    }

//    2、静态方法
//    必须使用static修饰，默认使用public修饰
    static void inAdd(){
        System.out.println("这是一个接口的静态方法。。。");
    }

//    3、私有方法
//    JDK 1.9 开始支持，必须在接口内部访问；
    private void go(){
        System.out.println("开始跑了。。。");
    }

}


//5、一个接口继承多个接口，是没问题的，但是如果多个接口中存在规范冲突，则不能继承
//interface A {
//    int go();
//}
//
//interface B {
//    void go();
//}
//
//interface C extends A, B{
//
//}
