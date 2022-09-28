package shopcar;

import java.util.Random;

public class Goods {
    String id;
    String name;
    double price;
    int count;

    public Goods (String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
        Random random = new Random();
        this.id = String.valueOf((char)(random.nextInt(26) + 65));
    }
}
