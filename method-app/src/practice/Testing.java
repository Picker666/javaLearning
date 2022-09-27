package practice;

import java.util.Random;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        int s = sum(100);
        System.out.println(s);

//        testNum();

//        maxIndex();

        printArray();
    }

    public static int sum (int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static String justify (int n) {
        String result = "偶数";
        if (n%2 == 1) {
            result = "奇数";
        }

        return result;
    }

    public static int scanKeyIn () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数字：");
        int keyIn = scanner.nextInt();

        return keyIn;
    }

    public static int[] generateArr (int max) {
        int[] arr = new int[max + 1];

        for (int i = 0; i <= max; i++) {
            arr[i] = i;
        }

        return arr;
    }

    public static int[] disorder (int[] arr) {
        Random random = new Random();
        int[] arrNew = arr.clone();

        for (int i = 0; i < arrNew.length; i++) {
            int randomInt = random.nextInt(arrNew.length);
            int temp = arrNew[i];
            arrNew[i] = arrNew[randomInt];
            arrNew[randomInt] = temp;
        }
        return arrNew;
    }

    public static void printArr (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void testNum () {
        int keyIn = scanKeyIn();
        String result = justify(keyIn);
        System.out.println(result);
    }


    public static void maxIndex () {
        int keyIn = scanKeyIn();

        int[] arr = generateArr(keyIn);

        arr = disorder(arr);

        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        printArr(arr);

        System.out.println("最大值在：" + maxIndex);
    }

//    参数传递
//    1、基本数据类型传递的是值
//    2、引用数据类型传递的是地址；

//    打印任意数据的类型

    public static void printArray() {
        int keyIn = scanKeyIn();

        int[] arr = generateArr(keyIn);

        arr = disorder(arr);

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }

        }
        System.out.println("]");
    }
}
