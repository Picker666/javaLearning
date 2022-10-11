package Static3;

public class Index {
    private static int onlineNumber = 0;
    public String name="Picker";

//    1、静态方法只能访问静态成员，不可以直接访问实例成员
    private static void test() {
        System.out.println(onlineNumber);
        test2();
    }

    private static void test2(){
        System.out.println("this is test2...");
    }

//    2、实例方法可以访问静态成员，也可以访问实例成员
    public void go () {
        test2();
        System.out.println(name);
    }

//    3、静态方法中不可以出现this关键字


}
