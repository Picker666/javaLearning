package common.api.StringBuilder;

/**
 * StringBuilder
 *      一个可变的字符串类，我们可以把它看成一个对象容器
 *
 *  作用：提高字符串的操作效率，如：拼接、修改等。
 *
 *  注意：
 *      StringBuilder 只是拼接字符串的手段，效率好
 *      最终目的还是恢复成String类型
 * */

public class Index {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); //
        sb.append("a");
        sb.append("b");
        sb.append(1);
        sb.append(2.2);
        sb.append(false);
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder(); //
        sb1.append("a").append(1).append("c");

        System.out.println(sb1);

        sb1.reverse().append(110);
        System.out.println(sb1);

//        恢复成String类型
        String rs = sb1.toString();
        test(rs);
    }

    public static void test(String s) {
        System.out.println(s);
    }

}
