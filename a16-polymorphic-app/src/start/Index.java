package start;

/**
 * 多态
 *      同类型的对像，执行同一行为，会表现出不同的特征
 *
 *  多态的成员访问特点
 *      方法调用：编译看左边，运行看右边
 *      变量调用：编译看左边，运行也看左边 (多态侧重行为)
 *
 *
 *  前提
 *      有继承，并在存在子类方法重写
 *
 *  优势
 *      在多态形式下可以实现解耦，便于扩展和维护
 *      定义方法的时候，使用父类型作为参数，该方法就可以接收这个父类的一切子类对象，体现出多态的扩展性和便利
 *
 *  问题
 *      多态性不能使用子类的独有功能，（可通过类型转换实现调用独有功能）
 *
 *  强制类型转换
 *      可以在多态的劣势下，实现调用子类独有的变量
 *      注意：转换后的类型和对象的真实类型不是同一种类型，那么转换的时候会出现ClassCastException
 *      java建议强转之前使用instanceof判断当前对象的真实类型，在进行强制转换
 * */

public class Index {
    public static void main(String[] args) {
        // 1、多态形式
        Animal dog = new Dog(); // 自动类型转换
        dog.run();
        System.out.println(dog.name);

        Animal tortoise = new Tortoise();
        tortoise.run();

        Dog dog1 = new Dog();
//        dog.lookDoor(); // 报错 不能调用父类没有的方法
        ((Dog)dog).run(); // 类型转换
        dog1.lookDoor();

        go(dog);
        go(tortoise);

        System.out.println("===================");
//        Dog dog3 = (Dog) tortoise;// 强制类型转换，编译阶段不会报错（注意：有继承或者实现关系阶段可以强转），运行时会报错。

        if(tortoise instanceof Dog) {
            Dog dog3 = (Dog) tortoise;
        }
    }


    public static void go(Animal animal) {
        System.out.println("开始。。。");
        animal.run();
        System.out.println("结束。。。");
    }
}
