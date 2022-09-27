package findPrimeNumber;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入开始数据：");
        int start = scanner.nextInt();
        System.out.println("请输入结束数据：");
        int end = scanner.nextInt();
        primeNumberPrint(start, end);
    }

    public static boolean isPrimeNumber (int n) {

        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                return  false;
            }
        }
        return true;
    }

    public static void primeNumberPrint (int start, int end) {
        for (int i = start; i <= end ; i++) {
            boolean is = isPrimeNumber(i);
            if (is) {
                System.out.print(i + "\t");
            }
        }
    }
}
