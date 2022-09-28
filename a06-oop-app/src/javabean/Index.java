package javabean;

public class Index {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setName("宝马");
        car1.setCount(1);
        car1.setPrice(99.99);

        System.out.println("名字：" + car1.getName());
        System.out.println("数量：" + car1.getCount());
        System.out.println("价格：" + car1.getPrice());

        Car car2 = new Car("奔驰",99, 2);
        System.out.println("名字：" + car2.getName());
        System.out.println("数量：" + car2.getCount());
        System.out.println("价格：" + car2.getPrice());
    }
}
