package Static7SingleCase;

public class Index {
    public static void main(String[] args) {
        SingleInstance singleInstance = SingleInstance.singleInstance;
        SingleInstance singleInstance1 = SingleInstance.singleInstance;

        System.out.println(singleInstance == singleInstance1);

        System.out.println("============================");

        LazySingleInstance lazySingleInstance = LazySingleInstance.getInstance();
        LazySingleInstance lazySingleInstance1 = LazySingleInstance.getInstance();

        System.out.println(lazySingleInstance == lazySingleInstance1);
    }
}
