package staticInnerClass;

/**
 * 静态内部类
 *      使用static修饰，属于外部类本身
 *      和正常的类使用完全一样
 *
 * 使用
 *      外部类名.内部类名 实例名 = new 外部类名.内部类构造器()
 *
 * 注意
 *      内部类可以直接访问外部类的静态成员变量
 *      内部类不能直接访问外部类的实例成员变量
 * */
public class Outer {
    public static String outerName="outerName";

    public static class Inner {
        private String name;
        public int age;
        public static String homeName="innerHomeName";

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Inner() {
        }

        public void show() {
            System.out.println("inner function show....and outer name is: " + outerName);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
