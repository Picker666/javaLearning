package planeTicket;

import java.util.Scanner;

public class PlaneTicket {
    public static void main(String[] args) {

        int month = keyInMonth();
        int type = keyInType();
        double price = keyInPrice();
        double finalPrice = discountPrice(month, type, price);

        System.out.println("机票目前的价格是：" + finalPrice + "元");

    }

    public static int keyInMonth () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入月份（1-12）：");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("没有您输入的月份！");
            month = keyInMonth();
        }

        return month;
    }

    public static int keyInType () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入仓位类型（1: 头等舱，2：经济舱）：");
        int type = scanner.nextInt();

        if (type != 1 && type != 2) {
            System.out.println("没有您输入的仓位！");
            type = keyInType();
        }

        return type;
    }

    public static double keyInPrice () {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入价格：");
        double price = scanner.nextInt();

        if (price < 0) {
            System.out.println("您输入的价格过低，赔钱！");
            price = keyInPrice();
        }

        return price;
    }

    public static double discountPrice (int month, int type, double price) {
        double finalPrice;

        if (month > 4 && month < 11) {
            if (type == 1) {
                finalPrice = price * 0.9;
            } else {
                finalPrice = price * 0.85;
            }
        } else {
            if (type == 1) {
                finalPrice = price * 0.7;
            } else {
                finalPrice = price * 0.65;
            }
        }

        return finalPrice;
    }

}
