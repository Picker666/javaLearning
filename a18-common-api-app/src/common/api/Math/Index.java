package common.api.Math;

/**
 * Math
 *      包含执行基本数字运算的方法，Math类没有提供公开的构造器
 *      静态成员通过类名直接调用即可
 * */
public class Index {
    public static void main(String[] args) {
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10));

        System.out.println(Math.ceil(4.0001));
        System.out.println(Math.ceil(4.0000));

        System.out.println(Math.floor(4.99999));
        System.out.println(Math.floor(4.000));

        System.out.println(Math.pow(2,3));

        System.out.println(Math.round(4.0001));
        System.out.println(Math.round(4.5001));

        System.out.println(Math.random()); // 0.0 - 1.0 (包前不包后)

        // 3-8
        System.out.println(Math.floor(Math.random() * 6) + 3);
    }
}
