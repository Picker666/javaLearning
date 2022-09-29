package verificationCode;

import java.util.Random;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        verificationCode();
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

}
