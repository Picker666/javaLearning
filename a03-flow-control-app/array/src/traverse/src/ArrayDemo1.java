import java.util.Random;
import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        int sum = 0;
        for (int i = 0; i< arr.length; i++) {
            System.out.println(arr[i]);
            sum +=arr[i];
        }
        System.out.println(sum);

//        猜数字

        Random random = new Random();

        int[] randomArr = new int[5];
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = random.nextInt(20) + 1;
        }

        Scanner scanner = new Scanner(System.in);

        WHILE:
        while (true) {
            System.out.print("请输入1-20之间的数字：");
            int keyIn = scanner.nextInt();
            for (int i = 0; i < randomArr.length; i++) {
                if (randomArr[i] == keyIn) {
                    System.out.println("猜中了！当前数字的索引是：" + i);
                    break WHILE;
                }
            }
            System.out.println("当前猜测的数字太当前数组中不存在，重来！");
        }

        System.out.println("当前数组如下：");
        for (int i = 0; i < randomArr.length; i++) {
            System.out.print(randomArr[i] + "\t");
        }

        System.out.println("猜数字结束了！");

//        随即排名

        int[] staffIds = new int[10];
        for (int i = 0; i < staffIds.length; i++) {
            staffIds[i] = i;
        }

        int staffNum = staffIds.length;
        for (int i = 0; i < staffNum; i++) {
            int randomIndex = random.nextInt(staffNum);
            int temp = staffIds[i];
            staffIds[i] = staffIds[randomIndex];
            staffIds[randomIndex] = temp;
        }
        System.out.println("最终员工的顺序是：");
        for (int i = 0; i < staffNum; i++) {
            System.out.print(staffIds[i] + "\t");
        }

    }
}
