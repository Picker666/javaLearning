package inherit.start;

public class People {
    private String name;
    private int age;

    public void queryClassList() {
        System.out.println(this.name + "查看了课表。。。");
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People(){}

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
