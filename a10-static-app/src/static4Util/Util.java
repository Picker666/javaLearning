package static4Util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 *  工具类内部都是一些静态方法，每个方法完成一个功能
 *  一次编写，处处可用，提高代码的重用性。
 * */
public class Util {

//    由于工具类无需创建对象，因此将构造器隐藏
    private Util(){}

    public static String CreateVerifyCode() {
        String code = "";
        String data="1234567890";

        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(data.length());
            code += data.charAt(index);
        }

        return code;
    }

    public static String arrayToString(ArrayList arr){
        if (arr == null) {
            return null;
        }
        String arrStr = "[";
        for (int i = 0; i < arr.size(); i++) {
            arrStr += arr.get(i) + ", ";
        }

        if (arrStr.length() > 1) {
            arrStr = arrStr.substring(0, arrStr.length() - 2);
        }

        arrStr += "]";

        return arrStr;
    }

    public static String arrayToString(double[] arr){
        if (arr == null) {
            return null;
        }
        String arrStr = "[";
        for (int i = 0; i < arr.length; i++) {
            arrStr += arr[i] + ", ";
        }

        if (arrStr.length() > 1) {
            arrStr = arrStr.substring(0, arrStr.length() - 2);
        }

        arrStr += "]";

        return arrStr;
    }

    public static double[] sort(double[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = i+1; j < scores.length; j++) {
                if (scores[i] > scores[j]) {
                    double temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                }
            }
        }
        return  scores;
    }

    public static double getAverage(double[] scores) {
        int length = scores.length;
        if (length < 3) {
            return 0;
        }

        scores = sort(scores);

        double sum = 0;

        for (int i = 1; i < length - 1; i++) {
            sum += scores[i];
        }

        double average = sum/(length - 2);

        return average;

    }
}
