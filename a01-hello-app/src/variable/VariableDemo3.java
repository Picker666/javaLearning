package variable;

public class VariableDemo3 {
    public static void main(String[] args) {
//        1、byte 字节类型一个字节 -128～127
//        2、short 两个字节
//        3、int（默认）四个字节
//        4、long 长整型
        long lg = 1234567;
        long lg2 = 1234567899999L;
//        随便一个数字默认是整型，但是超过了整型的范围，需要在数字的之后加上L/l
//        5、float 浮点型，四个字节
//            随便一个小数默认是double类型的，如果定义是float，则需要在数字的结尾加上F/f
            float fs = 98.3F;
//        6、double 双精度，八个字节
        double dd = 99.99;
//        7、char 字符
        char ch = 'd';
//        8、布尔类型
        boolean b = true;
        boolean b1 = false;

//        ---------------------------

//        引用数据类型
        String name = "Picker";
        System.out.println(name);

        long lg3 = 9999;
        float flt = lg3;
        double db = flt;

        int i1 = 1500;
        byte b3 = (byte) i1;
        System.out.println(b3);


    }
}
