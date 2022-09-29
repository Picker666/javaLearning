public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /**
         * 1、String 是字符串类型，可以定义字符串变量指向字符串对象。
         * 2、String变量每次的修改其实都是产生并指向了新的字符串对象。
         * 3、原来的字符串对象是没有改变的，所以称为不可变字符串。
         */

//        一、创建字符串的方式
//        1、直接创建；
        String name = "Picker";

//        2、使用构造器创建
//        （1）、public String() 无参构造器
        String s1 = new String();

//        （2）、public String(String s) 根据传入的字符串创建
        String description = new String("developer");

//        （3）、public String(char[] c)
        char[] ch = {'a', 'b', 'c', 'd'};
        String s3 = new String(ch);
        System.out.println(s3);

//        （4）、public String（byte[] b); 根据字节数组的内存来创建对象
        byte[] bytes = {97,99,98,66,67};
        String s4 = new String(bytes);
        System.out.println(s4);

        System.out.println("==============================");

        String ss1 = "Picker";
        String ss2 = "Picker";
//        此时对比的是 ss1和ss2的内存地址，但是由于""创建的字符串对象存放在字符串常量池中，所以 ss1和ss2指向同一个常量池中的字符串对象
        boolean isEqual1 = ss1 == ss2; // true

        String ss3 = new String("Picker");
        String ss4 = new String("Picker");
//        此时对比的内存地址，通过构造器创建的字符串指向各自的内存地址
        boolean isEqual2 = ss3 == ss4; // false

        System.out.println("isEqual2: " + isEqual2);

//        三、题
        String sss1 = "abc";
        String sss2 = "a" + "b" + "c"; // java存在内部编译机制，会直接编译成"abc"；
        System.out.println(sss1 == sss2); // true

    }
}