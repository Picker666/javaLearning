package verficationCode;

import java.util.Random;

public class Index {
    public static void main(String[] args) {
        String verificationCode = generateCodes(6);
        System.out.println(verificationCode);
    }

    public static int randomValue (int range) {
        int value = randomValue(range, 0);
        return value;
    }

    public static int randomValue (int range, int offset) {
        Random random = new Random();
        int value = random.nextInt(range) + offset;

        return value;
    }

    public static String getCode () {
        int type = randomValue(3);

        String code = "";

        switch (type) {
            case 0:
                int value = randomValue(10);
                code = String.valueOf(value);
                break;
            case 1:
                int value1 = randomValue(26, 65);
                code = String.valueOf((char)value1);
                break;
            case 2:
                int value2 = randomValue(26, 97);
                code = String.valueOf((char)value2);
                break;
        }

        return code;
    }

    public static String generateCodes (int number) {
        String code = "";
        for (int i = 0; i < number; i++) {
            code += getCode();
        }

        return code;
    }
}
