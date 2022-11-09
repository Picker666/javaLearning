package jdk8.newAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterAPI {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");

//        正向格式化
        String localDateTimeFormatted = dateTimeFormatter.format(localDateTime);
        System.out.println(localDateTimeFormatted);

//        逆向格式化
        String localDateTimeFormatted1 = localDateTime.format(dateTimeFormatter);
        System.out.println(localDateTimeFormatted1);

//        解析字符串时间
        String dateStr = "2022-11-10 15:52:29 周四 下午";
        LocalDateTime localDateTime2 = LocalDateTime.parse(dateStr, dateTimeFormatter);
        System.out.println(dateStr);
    }
}
