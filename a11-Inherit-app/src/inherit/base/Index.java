package inherit.base;

/**
 * 继承的特点：
 *      1、子类可以继承父类的属性和行为，但是子类不能继承父类的构造器
 *      2、java是单继承模式，一个类只能继承一个父类
 *      3、java不支持多继承，但是支持多层继承
 *      4、java中所有的类都是Object类的子类
 *
 * 子类方法中访问成员（成员变量和成员方法）满足：就近原则
 *      1、优先在子类的局部范围找
 *      2、然后在子类成员范围找
 *      3、最后在父类成员范围找，如果在父类范围还没找到，则 报错。
 *
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


        System.out.println("+========================+");
        student.run();

//        super 指定访问父类中的成员，this指定访问当前类的成员
        student.showAge();

    }
}
