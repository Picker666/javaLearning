package Static5CodeBlock;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 1、代码块是类的五大成分之一（成员变量、构造器、方法、代码块、内部类），定义在类中 方法外。
 * 2、在java类中，使用{}括起来的代码被称为代码块。
 *
 * 代码块分为静态代码块和动态代码块
 *
 * 1、静态代码块
 *      格式：static{}
 *      特点：需要通过static关键字修饰，随着类加载而加载，自动触发，并且只执行一次
 *      使用场景：在类加载的时候做一些静态数据初始化
 * 2、构造代码块
 *      格式：{}
 *      特点：每次创建对象调用构造器执行是都会执行该代码块中的代码，并且在构造器执行前执行
 *      使用场景：初始化实例资源。
 * */

public class Index {

    private String name;
    public static String schoolName;
    public static ArrayList<String> cards = new ArrayList<>();

    static {
        schoolName = "北大";
        cards.add("A");
        cards.add("2");
        System.out.println("静态代码块执行");
    }

    {
        name = "Picker";
        System.out.println("实例代码块执行----");
    }

    public static void main(String[] args) {
        System.out.println("main方法的代码执行");
        System.out.println(schoolName);

        Index d = new Index();
        System.out.println(d.name+"----");
    }

    public Index () {
        System.out.println("无参构造器----");
    }


}
