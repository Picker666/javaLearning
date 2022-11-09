package jdk8.newAPI;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitAPI {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime birthday = LocalDateTime.of(1991,6,27,19,30,59);
        System.out.println(birthday);

        System.out.println("年：" + ChronoUnit.YEARS.between(birthday, localDateTime));
        System.out.println("月：" + ChronoUnit.MONTHS.between(birthday,localDateTime));
        System.out.println("周：" + ChronoUnit.WEEKS.between(birthday,localDateTime));
        System.out.println("天：" + ChronoUnit.DAYS.between(birthday,localDateTime));
        System.out.println("小时：" + ChronoUnit.HOURS.between(birthday,localDateTime));
        System.out.println("秒：" + ChronoUnit.SECONDS.between(birthday,localDateTime));
        System.out.println("毫秒：" + ChronoUnit.MILLIS.between(birthday,localDateTime));
        System.out.println("微秒：" + ChronoUnit.MICROS.between(birthday,localDateTime));
        System.out.println("半天：" + ChronoUnit.HALF_DAYS.between(birthday,localDateTime));
        System.out.println("十年：" + ChronoUnit.DECADES.between(birthday,localDateTime));
        System.out.println("世纪（百年）：" + ChronoUnit.CENTURIES.between(birthday,localDateTime));
        System.out.println("千年：" + ChronoUnit.MILLENNIA.between(birthday,localDateTime));
        System.out.println("纪元：" + ChronoUnit.ERAS.between(birthday,localDateTime));
    }
}
