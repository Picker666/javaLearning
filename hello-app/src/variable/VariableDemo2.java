package variable;

public class VariableDemo2 {

    public static void main(String[] args) {
//        1、先声明在使用；
//        2、变量声明之后，不能存放其他类型的数据；
//        3、变量的有效范围是从定义到"}"结束，并且在同一个范围内不能定义两个同名的变量；
//        4、变量在定义的时候可以没有初始值，但是在使用的时候必须有值。

        char ch = 'a';
        System.out.println(ch + 1);

        char cha = 'A';
        System.out.println(cha + 1);

        int i1 = 0b01100001;
        System.out.println(i1);

        int i2 = 0141;
        System.out.println(i2);

        int i3 = 0x61;
        System.out.println(i3);
    }
}
