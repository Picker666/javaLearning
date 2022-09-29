package stringEqualDemo;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
//        1、字符串对象相等（equals）
        String okName = "Picker";
        String okPassword = "123456";

        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入名字：");
//        String name = scanner.next();
//        System.out.println("请输入密码：");
//        String password = scanner.next();
//
//        if (okName.equals(name) && okPassword.equals((password))) {
//            System.out.println("登陆成功！");
//        } else {
//            System.out.println("登陆失败！");
//        }
//        2、equalsIgnoreCase
        String code = "432d";
        String code1 = "432D";

        System.out.println(code.equalsIgnoreCase(code1));

//        3、public int length()

        String string = "Picker123";
        System.out.println(string.length());

//        4、public char charAt(int index);
        System.out.println(string.charAt(1));

        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }

//        5、public char[] toCharArray();

        char[] chs = string.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }

//        6、public String substring(int beginIndex, int endIndex) - (包前不包后)
        String str1 = string.substring(0, 8);
        System.out.println(str1);

        String str2 = string.substring(6);
        System.out.println(str2);

//        7、public String replace(charSequence target, charSequence replacement);
        String str3 = string.replace("123", "***");
        System.out.println(str3);

//        8、public boolean contains(CharSequence);
        System.out.println(string.contains("123"));

//        9、public boolean startsWith(CharSequence);
        System.out.println(string.startsWith("Picker"));

//        10、public boolean split(CharSequence);
        String name = "Picker,Christine,DongYao";
        String[] str4 = name.split(",");
        for (int i = 0; i < str4.length; i++) {
            System.out.println(str4[i]);
        }
    }
}
