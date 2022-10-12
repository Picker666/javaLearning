package inherit.constructor;

public class Animal {
    public String name;
    public Animal () {
        System.out.println("父类无参构造器执行。。。");
    }

    public Animal (String name) {
        System.out.println("父类有参构造器执行。。。");
        this.name = name;
    }
}
