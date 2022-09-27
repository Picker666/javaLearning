package overLoad;

public class MethodDemo1 {
    public static void main(String[] args) {
//    方法重载
//    同一个类中，出现了多个方法名相同，但是形参列表不同，那么这些方法就是重载方法。
//        (修饰符和返回值无所谓，形参名字一样不一样无所谓)
//        形参不同：参数的个数、顺序和类型不同；

        fire();
        fire("岛国");
        fire("热锅", 1000);

        chu(4, 0);
    }

    public static void fire() {
        fire("米国");
    }

    public static void fire(String location) {
        System.out.println("默认发射一枚武器是" + location +"！");
    }

    public static void fire(String location, int num) {
        System.out.println("默认发射" + num + "枚武器是" + location +"！");
    }

//    return关键字 单独使用，可适用于有/无返回值的方法，可以结束方法执行

    public static void chu (int a, int b) {
        if (b == 0) {
            System.out.println("b不能等于0");
            return;
        }
        int c = a/b;
        System.out.println(c);
    }
}
