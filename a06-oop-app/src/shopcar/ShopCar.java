package shopcar;

import java.util.Scanner;

public class ShopCar {
    public static void main(String[] args) {
        Goods[] shopCar = new Goods[100];

        Scanner scanner = new Scanner(System.in);

        operation(scanner, shopCar);

    }

    public static void operation (Scanner scanner, Goods[] shopCar) {
        while (true) {
            System.out.print("请选择操作类型（1：添加；2：查询；3：更改；4：删除；0：结束）：");
            int type = scanner.nextInt();

            switch (type) {
                case 0:
                    System.out.println("结束购物。。。");
                    return;
                case 1:
                    add(scanner, shopCar);
                    break;
                case 2:
                    query(shopCar);
                    break;
                case 3:
                    update(scanner, shopCar);
                    break;
                case 4:
                    delete(scanner, shopCar);
                    break;
                default:
                    System.out.println("输入错误！！！");
            }
        }

    }

    public static void add(Scanner scanner, Goods[] shopCar){
        System.out.print("请输入商品名称：");
        String name = scanner.next();
        System.out.print("请输入商品价格：");
        double price = scanner.nextDouble();
        System.out.print("请输入商品数量：");
        int count = scanner.nextInt();

        Goods goods = new Goods(name, price, count);

        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                shopCar[i] = goods;
                break;
            }
        }
    }

    public static void query(Goods[] shopCar){
        System.out.println("id\t\t\t\t名字\t\t\t\t价格\t\t\t\t数量");
        for (int i = 0; i < shopCar.length; i++) {
            Goods currentGoods = shopCar[i];
            if (shopCar[i] != null) {
                System.out.println(currentGoods.id + "\t\t\t\t" + currentGoods.name + "\t\t\t\t"+currentGoods.price+"\t\t\t\t" + currentGoods.count);
            } else {
                break;
            }
        }
    }

    public static void update(Scanner scanner, Goods[] shopCar){
        if (shopCar[0] == null) {
            System.out.println("购物车空空的！！！");
            return;
        }

        System.out.print("请输入更新商品名称：");
        String name = scanner.next();

        for (int i = 0; i < shopCar.length; i++) {
            Goods currentGoods = shopCar[i];

            if (currentGoods == null) {
                return;
            } else if (currentGoods.name.equals(name)) {
                System.out.print("请输入新的商品数量：");
                int count = scanner.nextInt();
                currentGoods.count = count;
                Goods[] cg = {currentGoods};
                query(cg);
                return;
            }
        }
    }

    public static void delete(Scanner scanner, Goods[] shopCar){
        if (shopCar[0] == null) {
            System.out.println("购物车空空的！！！");
            return;
        }

        System.out.print("请输入删除商品名称：");
        String name = scanner.next();

        boolean haveGetting = false;
        for (int i = 0; i < shopCar.length; i++) {

             if (haveGetting) {
                 if (shopCar[i-1] == null) {
                     return;
                 } else {
                     shopCar[i-1] = shopCar[i];
                 }
            } else if (shopCar[i].name.equals(name)) {
                haveGetting = true;
            }
        }
    }
}
