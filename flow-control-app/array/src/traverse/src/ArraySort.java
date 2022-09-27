import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        Random random = new Random();

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

        for (int j = 0; j < staffNum - 1; j++) {
            for (int i = 1; i < staffNum - j; i++) {
                if (staffIds[i - 1] > staffIds[i]) {
                    int temp = staffIds[i];
                    staffIds[i] = staffIds[i - 1];
                    staffIds[i-1] = temp;
                }
            }
        }


        System.out.println("结果：");
        for (int i = 0; i < staffIds.length; i++) {
            System.out.print(staffIds[i] + "\t");
        }

    }
}
