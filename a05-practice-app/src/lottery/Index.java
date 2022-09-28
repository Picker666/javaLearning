package lottery;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Index {
    public static void main(String[] args) {

        String[] myNumber = buyLottery();
        System.out.print("您的号码是：");
        print(myNumber);

        String[] numbers = generateWinningNumbers(7);
        System.out.print("中奖号码是：");
        print(numbers);


        check(myNumber, numbers);
    }

    public static int randomValue (int range, int offset) {
        Random random = new Random();
        int value = random.nextInt(range) + offset;

        return value;
    }

    public static String transfer (int num) {
        String str = String.valueOf(num);
        if (num < 10) {
            str = "0" + String.valueOf(num);
        }
        return str;
    }

    public static int keyInValue (int limitation) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >0 && num <= limitation) {
            return num;
        }
        System.out.println("输入超出限制（0 - " + limitation + "）！");
        return keyInValue(limitation);
    }

    public static String  valueGettingWithCheck (int index, String[] numbers) {
        System.out.println("请输入第"+ (index + 1)+"个号码：");

        int limitation = 32;
        if (index == 6) {
            limitation = 16;
        }
        int num = keyInValue(limitation);
        String numTransfer = transfer(num);

        for (int i = 0; i <= index; i++) {
            if(numbers[i] != null && numbers[i].equals(numTransfer)){
                System.out.println("号码重复，重新输入：");
                return valueGettingWithCheck(index, numbers);
            }
        }
        return numTransfer;
    }

    public static String[] selfGet () {
        String[] numbers = new String[7];

        for (int i = 0; i < 7; i++) {
            numbers[i] = valueGettingWithCheck(i, numbers);
        }
        return numbers;
    }

    public static String[]  buyLottery(){
        System.out.print("请选择机选/自选（1：机选；2：自选）：");
        int type = keyInValue(2);

        if (type == 1) {
            return generateWinningNumbers(7);
        }
        if (type == 2) {
            return selfGet();
        }
        return buyLottery();
    }

    public static String[] generateWinningNumbers (int count) {
        String[] numbers = new String[count];

        for (int i = 0; i < count; i++) {
            int num = randomValue(32, 1);
            numbers[i] = transfer(num);
        }
        int num = randomValue(16, 1);
        numbers[count - 1] = transfer(num);

        return numbers;
    }

    public static void print(String [] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static String winningCheck (int redCount, boolean blurWin) {
        String result = "";
        if (blurWin) {
            switch (redCount) {
                case 1:
                case 2:
                    result = "六等奖";
                    break;
                case 3:
                    result = "五等奖";
                    break;
                case 4:
                    result = "四等奖";
                    break;
                case 5:
                    result = "三等奖";
                    break;
                case 6:
                    result = "一等奖";
                    break;
                default:
                    result = "欢迎下次再来！！！";
                    break;
            }
        } else {
            switch (redCount) {
                case 4:
                    result = "五等奖";
                    break;
                case 5:
                    result = "四等奖";
                    break;
                case 6:
                    result = "二等奖";
                    break;
                default:
                    result = "欢迎下次再来！！！";
                    break;
            }
        }
        return result;
    }


    public static void check(String[] myNumber, String[] winningNumber) {
        int redCount = 0;
        boolean blurWin = myNumber[myNumber.length-1] == winningNumber[winningNumber.length-1];

        for (int i = 0; i < myNumber.length -1; i++) {
            if (myNumber[i].equals((winningNumber[i]))) {
                redCount++;
            }
        }

        String result = winningCheck(redCount, blurWin);
        System.out.println("开奖结果：" + result);
    }
}
