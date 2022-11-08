package jdk8.newAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class LocalDateAPI {
    public static void main(String[] args) {
        java.time.LocalDate nowDate = LocalDate.now();
        System.out.println("今天的日期是：" + nowDate);

//        年份
        int year = nowDate.getYear();
        System.out.println("year:" + year);

//        第几个月
        int month = nowDate.getMonthValue();
        System.out.println("month:" + month);

//        月份
        Month month1 = nowDate.getMonth();
        System.out.println("month:" + month1);

//        一月的第几天
        int day = nowDate.getDayOfMonth();
        System.out.println("day:" + day);

//        一年的第几天
        int day1 = nowDate.getDayOfYear();
        System.out.println("day:" + day1);

//        星期
        DayOfWeek day2 = nowDate.getDayOfWeek();
        System.out.println("day:" + day2);
        System.out.println(day2.getValue());

        System.out.println("==================");

        java.time.LocalDate bt = java.time.LocalDate.of(1991,5,16);
        java.time.LocalDate bt1 = java.time.LocalDate.of(1991, Month.NOVEMBER, 11);
        System.out.println(bt+"==="+ bt1);

        System.out.println("======================");

        LocalDate myDate = LocalDate.of(1991,5,16);
        System.out.println(nowDate.equals(myDate));
        System.out.println(nowDate.isBefore(myDate));
        System.out.println(nowDate.isAfter(myDate));

        System.out.println("=================");
        MonthDay bd = MonthDay.of(11,8);
        MonthDay nowBD = MonthDay.from(nowDate);
        System.out.println(bd.equals(nowBD));
    }
}
