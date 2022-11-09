package jdk8.newAPI;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/*
* Period
*   对比日期之间的差值 LocalDate
*
* Duration
*   计算时间的差异，LocalDateTime || Instant
* */

public class DurationAndPeriodAPI {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate birthDay = LocalDate.of(1991,6,27);
        Period period = Period.between(birthDay, localDate);

        int years = period.getYears();
        System.out.println(years);

        int months = period.getMonths();
        System.out.println(months);

        int days = period.getDays();
        System.out.println(days);

        System.out.println("======================");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime birthday = LocalDateTime.of(1991,6,27,19,30,59);
        System.out.println(birthday);

        Duration duration = Duration.between(birthday, localDateTime);

        long d = duration.toDays();
        long h = duration.toHours();
        long m = duration.toMinutes();
        long s = duration.toSeconds();
        System.out.println(d+ "==" +h+ "==" +m+ "==" +s);
        long dp =duration.toDaysPart();
        System.out.println(dp);

    }
}
