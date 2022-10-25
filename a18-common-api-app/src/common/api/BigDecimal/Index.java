package common.api.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Index {
    public static void main(String[] args) {
        System.out.println(0.009 + 0.001);
        System.out.println(1.0 - 0.32);
        System.out.println(1.015 * 100);
        System.out.println(1.301 / 100);

        System.out.println("-------------------");

        System.out.println(0.1 + 0.2);

        System.out.println("-------------------");


        double a = 0.1;
        double b = 0.2;

        // 不能直接使用 new BigDecimal(double);来转换，精度损失
        // 使用 new BigDecimal(String)；或者BigDecimal.valueOf(double)
        BigDecimal a1 = new BigDecimal(0.1);
        BigDecimal b1 = new BigDecimal(0.2);
        BigDecimal c1 = a1.add(b1);
        System.out.println(c1);


        BigDecimal bda = BigDecimal.valueOf(0.1);
        BigDecimal bdb = BigDecimal.valueOf(0.2);
        BigDecimal c = bda.add(bdb);
        System.out.println(c);
        System.out.println(c.doubleValue());

        double aa = 10.0;
        double bb = 3.0;
        BigDecimal aa1 = BigDecimal.valueOf(aa);
        BigDecimal bb1 = BigDecimal.valueOf(bb);
//        BigDecimal rs = aa1.divide(bb1);// 无限循环，报错
        BigDecimal rs = aa1.divide(bb1, 2, RoundingMode.HALF_UP);
        System.out.println(rs);


    }
}
