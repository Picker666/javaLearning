/**
 * 包装了就是八种基本类型对应的引用类型
 *      byte -> Byte
 *      short -> Short
 *      int -> Integer
 *      long -> Long
 *      char -> Character
 *      float -> Float
 *      double -> Double
 *      boolean -> Boolean
 *  集合和泛型其实也只能支持包装类型，不支持基本数据类型
 *
 *  包装对象的容错率更高，默认值可以是null；
 * */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int a = 1;
        Integer a1 = 10;
        Integer a2 = a; // 自动装箱

        a = a1; // 自动拆箱

        Integer age = null;
//        int age1 = null; // 报错

        System.out.println("================");
//        包装类可以把基本类型转换成字符串形式；
        String s1 = Integer.toString(a);
        String s2 = a1.toString();
        System.out.println(s1);

//        也可以直接加字符串
        String s3 = a + "";

//        包装类可以把字符串类型的数据转换成整数
        String num = "23";
        int ageN = Integer.parseInt(num);
        int ageN1 = Integer.valueOf(num);
        System.out.println(ageN);
        System.out.println(ageN1);


        String sc = "99.9";
        double score = Double.parseDouble(sc);
        double scores = Double.valueOf(sc);
        System.out.println(score);
        System.out.println(scores);

    }
}