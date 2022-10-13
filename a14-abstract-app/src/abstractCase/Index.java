package abstractCase;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Index {
    private final static Scanner scanner = new Scanner(System.in);
    private final static Random random = new Random();
    private static ArrayList<Card> cards = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("请选择操作（1：加油；2：办卡）：");
            int operateType = scanner.nextInt();

            switch (operateType) {
                case 1:
                    fuelCharging();
                    break;
                case 2:
                    requestCard();
                    break;
                default:
                    System.out.println("输入的操作不存砸。。。");
            }
        }


    }

    public static void requestCard () {
        System.out.println("请输入充值金额：");
        double rechargeAmount = scanner.nextDouble();
        System.out.println("请输入你的姓名：");
        String userName = scanner.next();

        Card card;

        if (rechargeAmount >= 10000){
            card = new GoldenCard(userName, rechargeAmount);
        } else if (rechargeAmount >= 5000) {
            card = new SilverCard(userName, rechargeAmount);
        } else {
            card = new NormalCard(userName, rechargeAmount);
        }

        cards.add(card);
        System.out.println(card.getUserName() + "你好，你的卡号：" + card.getCardId()+ "，当前余额：" + card.getBalance());
    }

    public static Card queryCard() {
        System.out.println("请输入卡号：");
        String cardIdInput = scanner.next();

        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            String cardId = card.getCardId();
            if (cardId.equals(cardIdInput)) {
                return card;
            }
        }
        System.out.println("你输入的卡号不存在！");
        return queryCard();
    }

    public static int getPrice(){
        return random.nextInt(9) + 1;
    }


    public static void fuelCharging() {
        Card card = queryCard();
        System.out.println("请输入加油升数：");
        double litre = scanner.nextDouble();
        int price = getPrice();
        card.pay(litre, price);
    }
}
