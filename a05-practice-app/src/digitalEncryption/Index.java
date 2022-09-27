package digitalEncryption;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {

        int count = getKeyIn("请输入要加密数字的个数：");
        int[] digital = sumDigital(count);
        System.out.println("加密前的数据：");
        print(digital);
        System.out.println();
        int[] expectedDigital = encryption(digital);
        System.out.println("加密后的数据：");
        print(expectedDigital);
    }

    public static int getKeyIn(String remind) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(remind);
        int number = scanner.nextInt();
        return number;
    }

    public static int[] sumDigital (int count) {
        int[] EncryptionDigital = new int[count];
        for (int i = 0; i < count; i++) {
            EncryptionDigital[i] = getKeyIn("请输入要加密的数字：");
        }

        return EncryptionDigital;
    }

    public static int[] encryption (int[] digital) {
        int length = digital.length;
        int[] digitalN = new int[length];
        for (int i = 0; i < length; i++) {
            int current = digital[i];
            current += 5;
            current %= 10;
            digitalN[length - 1 - i] = current;
        }

        return digitalN;
    }

    public static void print(int[] digital){
        for (int i = 0; i < digital.length; i++) {
            System.out.print(digital[i] + "\t");
        }
    }
}
