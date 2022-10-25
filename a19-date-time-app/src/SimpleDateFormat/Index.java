package SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date 对象或者毫秒值转换成我们期望的格式
 * */

public class Index {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        long time = d.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        String rs = sdf.format(d);
        System.out.println(rs);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String rs1 = sdf1.format(time);
        System.out.println(rs1);

        System.out.println("===========case============");
//        2021年08月06日 11:11:11 之后2天14小时49分06秒
        SimpleDateFormat sdft = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date dd = sdft.parse("2021年08月06日 11:11:11");
        long time1 = dd.getTime() + (((2L*24 + 14)*60 + 49)*60 + 6) * 1000;
        String result = sdft.format(time1);
        System.out.println(result);
    }
}
