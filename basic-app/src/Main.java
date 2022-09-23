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
        表示中的 byte、short、char 是直接转换成int类型参与运算的；
         */

    }
}