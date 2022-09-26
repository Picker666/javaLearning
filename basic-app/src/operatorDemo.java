import java.util.Scanner;

public class operatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入年龄：");
        int age = scanner.nextInt();
        System.out.println("请您输入年龄：" + age);

        System.out.println("请输入您的名字:");
        String name = scanner.next();
        System.out.println("请输入您的名字:" + name);
    }
}
