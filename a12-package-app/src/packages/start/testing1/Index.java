package packages.start.testing1;

import packages.start.testing2.Student;

/**
 * 1、相同包下的类可以直接访问
 * 2、不同包下的类必须先导包
 * 3、如果这个类中使用不同包下的相同类名，此时默认只能导出以类的包，另一个要使用全名访问
 * */
public class Index {
    public static void main(String[] args) {
        System.out.println("-===========相同包============-");
        User user = new User("Picker", 20);

        System.out.println("-===========不同包============-");
        Student student = new Student();

        System.out.println("-===========多个包============-");
        packages.start.testing3.Student student1 = new packages.start.testing3.Student();
    }

}
