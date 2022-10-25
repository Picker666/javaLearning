package Calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * 代表了系统此刻日期对应的日历对象
 * Calendar是一个抽象类，不能直接创建对象
 * */
public class Index {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println(calendar);

        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

        int month = calendar.get(Calendar.MONTH) + 1;
        System.out.println(month);

        int days = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);

//        修改日历信息
        calendar.set(Calendar.HOUR, 12);
        System.out.println(calendar);


        calendar.add(Calendar.DAY_OF_YEAR, 10);

        Date d = calendar.getTime();
        System.out.println(d);

        long time = calendar.getTimeInMillis();
        System.out.println(time);
    }
}
