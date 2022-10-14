package anonymousInnerClass;

/**
 * 匿名内部类
 *      本质上是没有名字的局部内部类，定义在方法中，代码块中
 *
 *      没有名字的内部类
 *      匿名内部类写出来就可以创建一个匿名内部类对象
 *      匿名内部类创建的对象类型相当于当前new的那个类 的子类
 *
 * 作用
 *      方便创建子类对象，最终目的是为了简化代码编写
 * */
public class Index {
    public static void main(String[] args) {
        Animal animal = new Tiger();
        animal.run();

        Animal animal1 = new Animal() {
            @Override
            public void run() {
                System.out.println("老虎这样夜跑的很快。。。。");
            }
        };

        animal1.run();
    }
}
