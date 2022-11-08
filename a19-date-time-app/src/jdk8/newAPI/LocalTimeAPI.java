package jdk8.newAPI;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalTimeAPI {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println("今天的时间是：" + nowTime);

        int hour = nowTime.getHour();
        System.out.println("hour: " + hour);

        int minute = nowTime.getMinute();
        System.out.println("minute: " + minute);

        int second = nowTime.getSecond();
        System.out.println("second:" + second);

        int nano = nowTime.getNano(); // 纳秒
        System.out.println("nano: " + nano);

        System.out.println("=====================");
        System.out.println(LocalTime.of(13,14));
        System.out.println(LocalTime.of(13,14,15));
        System.out.println(LocalTime.of(13,14,15, 99));

        System.out.println("========================");
        System.out.println(LocalDateTime.of(1991, Month.NOVEMBER,11,8,20));
        System.out.println(LocalDateTime.of(1991, Month.NOVEMBER,11,8,20,21));
        System.out.println(LocalDateTime.of(1991, Month.NOVEMBER,11,8,20,21,66));
        System.out.println(LocalDateTime.of(1991, Month.NOVEMBER,11,8,20));

        System.out.println("======================");

        System.out.println(nowTime.plusHours(1));
        System.out.println(nowTime.plusMinutes(1));
        System.out.println(nowTime.plusSeconds(1));
        System.out.println(nowTime.plusNanos(1));
        System.out.println(nowTime);// 不可变对象

    }

}
