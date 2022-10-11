package static4Util;

import java.util.ArrayList;

public class index {
    public static void main(String[] args) {
        ArrayList arrLst = new ArrayList();
        String arrStr = Util.arrayToString(arrLst);
        System.out.println(arrStr);

        arrLst.add("Picker");
        arrLst.add("666");

        arrStr = Util.arrayToString(arrLst);
        System.out.println(arrStr);

        double[] scores = new double[]{99.99, 100.99, 40.99, 89.0, 90.0, 60.2, 59.9};

        scores = Util.sort(scores);

        String scoreStr = Util.arrayToString(scores);
        System.out.println(scoreStr);

        double average = Util.getAverage(scores);
        System.out.println(average);

    }
}
