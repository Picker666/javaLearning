package inherit.constructor;

public class Dog extends Animal{

    private int age;
    public Dog () {
        System.out.println("子类无参数构造器执行了。。。");
    }

    public Dog(String  name) {
        this(name, 2);
        System.out.println("子类的有参数构造器执行了。。。。");
    }

    public Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
