package date;

import java.util.Date;

public class Index {
    public static void main(String[] args) {
//        1、
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        long time1 = System.currentTimeMillis();
        System.out.println(time1);

        Date dd = new Date(time1);
        System.out.println(dd);

        dd.setTime(time1 + (60*60 + 121)*1000);
//        Date dd = new Date(time1);
        System.out.println(dd);

    }
}
