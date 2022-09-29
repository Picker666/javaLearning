package verificationCode;

import java.util.Random;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        verificationCode();

        logIn();
    }

    public static void verificationCode () {
        String codeSource ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        String code = "";
        Random random = new Random();
        int length = codeSource.length();
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(length);
            char c = codeSource.charAt(index);
            code +=c;
        }
        System.out.println(code);
    }

    public static void logIn () {
        Scanner scanner = new Scanner(System.in);

        String name = scanKeyIn(scanner, "请输入名字：");
        String password = scanKeyIn(scanner, "请输入密码：");
        verify(scanner, name, password);
    }

    public static String scanKeyIn (Scanner scanner, String Remind) {
        System.out.print(Remind);
        String keyIn = scanner.next();
        return keyIn;
    }

    public static void verify (Scanner scanner, String name, String password) {
        int times = 3;
        String nm = scanKeyIn(scanner, "请输入名字：");
        if (!nm.equals(name)) {
            System.out.println("用户名不存在");
            return;
        }
        do {
            String psw = scanKeyIn(scanner, "请输入密码：");

            if (password.equals(psw)) {
                System.out.println("登陆成功！");
                return;
            }
        } while (times-- > 1);

        System.out.println("登陆失败！");
    }


}
