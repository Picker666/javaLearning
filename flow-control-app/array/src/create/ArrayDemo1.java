package create;

public class ArrayDemo1 {
    public static void main(String[] args) {
//        1、定义
        double[] scores = new double[]{99, 88.8, 33.3,2312.23};
        int[] ages = new int[]{1,2,3,4,5};
        String[] name = new String[]{"fadf", "dfasd"};

        String[] englishName = {"dfasdf", "dfasdf"};

        System.out.println(scores);
//        数组的变量中存储的一个地址信息，数组是引用数据类型

//        2、数组的访问
        System.out.println(scores[0]);
        System.out.println(scores.length);
    }
}
