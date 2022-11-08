package jdk8.newAPI;

import java.time.LocalDateTime;

public class LocalDateTimeApi {
    public static void main(String[] args) {
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime);

        System.out.println(nowDateTime.getYear());
        System.out.println(nowDateTime.getMonthValue());
        System.out.println(nowDateTime.getDayOfMonth());
        System.out.println(nowDateTime.getHour());
        System.out.println(nowDateTime.getMinute());
        System.out.println(nowDateTime.getNano());


        System.out.println(nowDateTime.getDayOfYear());
        System.out.println(nowDateTime.getDayOfWeek());

        System.out.println(nowDateTime.getMonth());
        System.out.println(nowDateTime.getMonth().getValue());

        System.out.println(nowDateTime.toLocalDate());
        System.out.println(nowDateTime.toLocalTime());
        System.out.println(nowDateTime.toLocalTime().getHour());
    }
}
