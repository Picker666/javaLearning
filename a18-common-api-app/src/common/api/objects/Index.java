package common.api.objects;

import java.util.Objects;

/**
 * Objects和Object还是继承关系，Objects是从JDK 1.7开始之后才有
 *
 *      官方在进行字符串比较的时候，没有对象自己的equals方法进行比较，而是选择使用Objects的equals方法进行比较两个对象。
 *      虽然两个equals的结果是一样的。但是，Objects的equals方法更安全。做了非空校验
 * */
public class Index {
    public static void main(String[] args) {
        String s1 = "Picker";
        String s2 = new String("Picker");

        System.out.println(s1.equals(s2));

        String s3 = null;

//        System.out.println(s3.equals(s1)); // 报错
        System.out.println(Objects.equals(s3, s1));

//       public static boolean equals(Object a, Object b) {
//        return (a == b) || (a != null && a.equals(b));
//       }

        System.out.println(Objects.isNull(s3));
    }
}
