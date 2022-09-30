package arrayListCase;

import java.util.ArrayList;

public class Index {
    public static void main(String[] args) {
        ArrayList<Double> score = new ArrayList<>();
        score.add(89.9);
        score.add(90.0);
        score.add(9.0);
        score.add(34.9);
        score.add(100.9);

        positiveSequence(score);
        reverseOrder(score);
    }

    public static void positiveSequence (ArrayList<Double> score) {
        int size = score.size();

        for (int i = 0; i < size; ) {
            if (score.get(i) < 80) {
                score.remove(i);
                size = score.size();
            } else {
                i++;
            }
        }

        System.out.println(score);
    }

    public static void reverseOrder (ArrayList<Double> score) {
        int size = score.size();

        for (int i = size - 1; i <= 0; i--) {
            if (score.get(i) < 80) {
                score.remove(i);
            }
        }

        System.out.println(score);
    }
}
