package SimpleDateFormat.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Index {
    private static long startDate;
    private static long endDate;
    private static Date sd;
    private static Date ed;
    private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");

    public static void main(String[] args) throws ParseException {
        initial();
        judge("2020年11月11日 0:03:47");
        judge("2020年11月11日 0:10:11");
    }

    private static void initial() throws ParseException {
        sd = sdf.parse("2020年11月11日 0:0:0");
        startDate = sd.getTime();
        ed = sdf.parse("2020年11月11日 0:10:0");
        endDate = ed.getTime();
    }


    public static void judge (String date) {
        try {
            Date d = sdf.parse(date);

            System.out.println("======方法一");
//            long time = d.getTime();
//            if (time >= startDate && time <= endDate) {
//                System.out.println("秒杀成功了。。。。");
//            } else {
//                System.out.println("秒杀失败了。。。。");
//            }

            System.out.println("========方法二");
            if (d.after(sd) && d.before(ed)) {
                System.out.println("秒杀成功了。。。。");
            } else {
                System.out.println("秒杀失败了。。。。");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
