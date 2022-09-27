package summaryScore;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {

        double[] scoreArr = getScore(4);
        double averageScore = calcAverageScore(scoreArr);
        System.out.println("平均分是：" + averageScore);
    }

    public static double[] getScore (int num) {
        Scanner scanner = new Scanner(System.in);
        double[] scoreArr = new double[num];
        for (int i = 0; i < num; i++) {
            System.out.print("请输入评分：");
            double score = scanner.nextFloat();
            scoreArr[i] = score;
        }

        return scoreArr;
    }

    public static double calcAverageScore(double[] scoreArr) {
        double min = scoreArr[0];
        double max = min;
        double sum = min;

        for (int i = 1; i < scoreArr.length; i++) {
            double current = scoreArr[i];
            if (min > current) {
                min = current;
            }
            if (max < current) {
                max = current;
            }
            sum += current;
        }

        double averageScore = (sum - min - max)/(scoreArr.length - 2);

        return averageScore;
    }
}
