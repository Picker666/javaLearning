package instanceInnerClass;

/**
 * 实例内部类
 *      无static修饰的，属于外部类的实例对象
 *
 * 访问
 *      外部类名.内部类名 实例名 = new 外部类构造器().new 内部类构造器();
 *
 *  注意：
 *      成员内部类可以直接访问外部类的静态成员
 *      成员内部类可以直接访问外部类的实例成员
 *
 *      成员内部类必须要先创建外部类对象
 *
 *      成员内部类访问外部类对象： 外部类名.this
 * */
public class Index {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner("Picker", 18);

        inner.show();
        Outer.Inner.staticShow();// 内部类的静态方法
    }
}
