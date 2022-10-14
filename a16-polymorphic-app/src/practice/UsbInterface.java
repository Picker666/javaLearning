package practice;

public interface UsbInterface {
    default void input () {
        System.out.println("设备输入。。。");
    }

    default void output(){
        System.out.println("设备输出");
    }

    void operation();
}
