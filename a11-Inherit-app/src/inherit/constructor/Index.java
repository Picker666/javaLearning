package inherit.constructor;

/**
 * 子类的全部构造器默认会先访问父类的无参数哦股造器在执行自己
 *      子类在初始化的时候，有可能需要使用到父类的成员，如果父类没有初始化完成，子类将无法使用父类的数据
 *      所以，子类在初始化之前，一定要调用父类构造器，先完成父类空间数据的初始化
 *
 *      默认子类构造器的方法中有 super()，即使没有写，默认也会调用
 *
 *
 *  this() 访问自己的构造器
 *
 *  this和super都要放到第一行，并且不能同事存在
 * */
public class Index {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1);

        System.out.println("-=====================-");

        Dog d2 = new Dog("柯基");
        System.out.println(d2.name + d2.getAge() +"岁");
    }
}
