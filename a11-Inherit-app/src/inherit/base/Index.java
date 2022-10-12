package inherit.base;

/**
 * 继承的特点：
 *      1、子类可以继承父类的属性和行为，但是子类不能继承父类的构造器
 *      2、java是单继承模式，一个类只能继承一个父类
 *      3、java不支持多继承，但是支持多层继承
 *      4、java中所有的类都是Object类的子类
 * */
public class Index {

    public static void main(String[] args) {

//        1、子类继承父类的私有成员？
//        可以继承，但是不能直接访问
        Student student = new Student();
//        student.name;
//        student.run();

//        2、子类能不能继承父类的静态成员
//        可以访问，但是不算是继承，只能算是共享
        System.out.println(Student.location);

    }
}
