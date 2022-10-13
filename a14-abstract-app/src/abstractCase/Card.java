package abstractCase;

import java.util.Random;

public abstract class Card {
    private String userName;
    private double balance;
    private String cardId;
    private final static Random random = new Random();

    public abstract void pay(double oilLitre, double price);

    public Card() {
        String cardId="";
        for (int i = 0; i < 6; i++) {
            cardId += random.nextInt(10);
        }
        this.cardId = cardId;
    }

    public Card(String userName, double balance) {
        this();
        this.userName = userName;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }
}
