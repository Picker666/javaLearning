package abstractCase;

public class GoldenCard extends Card {
    private final static double discount=8.0;

    public GoldenCard() {
    }

    public GoldenCard(String userName, double balance) {
        super(userName, balance);
    }

    @Override
    public void pay(double oilLitre, double price) {
        double balance = getBalance();
        double consumption = oilLitre * discount * price / 10;
        balance -= consumption;
        setBalance(balance);
        System.out.println(getUserName() + "你好！，今天油价：" + price+"元/升，你本次加油消费：" + consumption + "元，余额：" + balance +"元！");
        System.out.println("欢迎下次光临！");
    }
}
