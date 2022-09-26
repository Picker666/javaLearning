import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i =0; i < 10; i++) {
            int num = random.nextInt(10);
            System.out.println(num);
        }

        int num = random.nextInt(100);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("请输入：");
            int tempNum = sc.nextInt();
            if(tempNum < num) {
                System.out.println("小了！");
            } else if (tempNum > num) {
                System.out.println("大了！");
            } else {
                System.out.println("猜对了！");
                break;
            }
        }
    }
}
