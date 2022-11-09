package jdk8.newAPI;

import java.util.Date;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantAPI {
    public static void main(String[] args) {
        Instant instant = Instant.now(); // 标准时间
        System.out.println(instant);

//        2、本地时间
        ZonedDateTime localTime = instant.atZone(ZoneId.systemDefault());
        System.out.println(localTime);

//        3、如果转成时间对象
        Date date = Date.from(instant);// 转换之后是当地时间
        System.out.println(date);

        Instant instant1 = date.toInstant();// 转换之后是标准时间
        System.out.println(instant1);
    }
}
