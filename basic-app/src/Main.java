public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//    一、自动类型转换
//    byte - short - int - long - float - double
//               chat -

        byte a = 20;
        int b = a;

        int age = 20;
        double db = age;
        System.out.println(db);

        char ch = 'a';
        int code = ch;
        System.out.println(code);

//      二、表达式的自动类型换
//        （byte、short、char） - int - long - float - double

        /*
        表达式的结果是由表达式中最高类型决定的；
        表达式中的 byte、short、char 是直接转换成int类型参与运算的；
         */

//      三、强制类型转换
        /*
        1、把一个大范围的变量/数据赋值给小范围的变量，不能直接赋值，会报错

        2、在数据/变量 前 加上 （），和要转换的类型，实现类型强制转换
         */
        int i = 1500;
        byte j = (byte) i;
        System.out.println(j);

//      3、强制类型转换可能造成数据（丢失）溢出
//      4、浮点型强转成整型，直接丢掉小数部分，保留整数部分返回。
    }
}