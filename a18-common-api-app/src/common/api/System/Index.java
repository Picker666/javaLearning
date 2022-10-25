package common.api.System;

import java.util.Arrays;

public class Index {
    public static void main(String[] args) {
        System.out.println("程序开始。。。");
//        System.exit(0);// JWT终止

        System.out.println("程序结束。。。");

        long time = System.currentTimeMillis();
        System.out.println(time);
        // 可以做时间计算，做性能分析

        int[] arr1 = {1,2,3,4,5,6,7,8,9,0};
        int[] arr2 = {1,2,3,4,5,4,3,2,1,0};
        System.arraycopy(arr1, 0, arr2, 5, 5);
        System.out.println(Arrays.toString(arr2));
    }
}
