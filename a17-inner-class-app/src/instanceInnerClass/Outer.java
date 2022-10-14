package instanceInnerClass;

public class Outer {
    public static String outerName="outerName";
    private int age=90;
    public String otherName = "otherName";

    class Inner {
        private String name;
        private int age=0;
        public static String homeName="homeName"; // JDK 15不支持静态成员

        public void show() {
            int age = 18;
            System.out.println(age);
            System.out.println(this.age);
            System.out.println(Outer.this.age); // 成员内部类访问外部类对象
            System.out.println("inner show...." + homeName + otherName);
        }

        public static void staticShow() {
            System.out.println("inner static show..." + homeName);
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Inner() {
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
