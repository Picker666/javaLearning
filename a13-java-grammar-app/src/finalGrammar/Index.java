package finalGrammar;

/**
 *  final 的作用
 *
 *      1、final可以修饰类、方法和变量
 *      2、修饰类，表明该类是最终类，不能被继承
 *      3、修饰方法，表示该方法是最终方法，不能被重写
 *      4、修饰变量，表示变量第一次赋值之后，不能再次被赋值（有且仅能被赋值一次）
 *
 *  注意：
 *      final 修饰的是基本类型的话，变量对应的数据值不能发生变化
 *      final 修饰的引用数据类型的话，变量对应的内存地址不能发生变化，但是变量的值是可以发生变化
 * */

public class Index {
//    变量有两种
//      1、局部变量
    public static void main(String[] args) {
        final double rate = 3.14;

//        rate = 3.15;
        buy(0.1);
    }

//    2、成员变量（静态成员变量，实例成员变量）
    public static final String name = "Picker";// 常量  静态成员变量

    private final String privateName="Picker666";// 实例成员变量

    public static  void buy(final double discount) {
//        discount = 1
    }

}

class Student {
//    @Override // 不能被重写
//    public void eat() {
//
//    }

}

class People {
    public final void eat(){
        System.out.println("eating");
    }
}
