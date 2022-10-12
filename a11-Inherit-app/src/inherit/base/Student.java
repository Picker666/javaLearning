package inherit.base;

public class Student extends People {

    public int age = 28;
    public void run () {
        System.out.println("student running...");
    }

    public void showAge () {
        System.out.println(super.age); // 指定访问父类的成员
        System.out.println(age);
        int age = 38;
        System.out.println(age);
        System.out.println(this.age);// 指定访问当前类成员
    }
}
