package abstractCase;

public class NormalCard extends Card {
    private final static double discount=10.0;

    public NormalCard() {
    }

    public NormalCard(String userName, double balance) {
        super(userName, balance);
    }

    @Override
    public void pay(double oilLitre, double price) {
        double balance = getBalance();
        double consumption = oilLitre * discount * price / 10;
        balance -= consumption;
        setBalance(balance);
        System.out.println(getUserName() + "你好！，你本次加油消费：" + consumption + "元，余额：" + balance +"元！");
        System.out.println("欢迎下次光临！");
    }
}
