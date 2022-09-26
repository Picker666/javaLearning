package create;

public class ArrayDemo1 {
    public static void main(String[] args) {
//        1、定义(静态初始化数组)
        double[] scores = new double[]{99, 88.8, 33.3,2312.23};
        int[] ages = new int[]{1,2,3,4,5};
        String[] name = new String[]{"fadf", "dfasd"};

        String[] englishName = {"dfasdf", "dfasdf"};

        System.out.println(scores);
//        数组的变量中存储的一个地址信息，数组是引用数据类型

//        2、数组的访问
        System.out.println(scores[0]);
        System.out.println(scores.length);

//        3、动态初始化数组
//        定义数组的时候值确定初始化数组的长度，之后再存入具体的数据

        double[] scoress = new double[3];

        scoress[0] = 99.9;
        System.out.println(scoress[1]);

        String[] nms = new String[3];
        nms[0] = "马尔扎哈";
        System.out.println(nms[0] + nms[2]);

//        4、动态初始化 元素的默认值
//        （1）、整型数组的元素默认值： 0；
//        （2）、字符类型数组的元素默认值是： 0
        char[] ch = new  char[3];
        System.out.println((int)ch[0]);
//        （3）、浮点型的元素默认值： 0.0
//        （4）、布尔类型的数组默认值是： false
//        （5）、String类型数组的默认值是： null
    }
}
