package template.func;

public abstract class Student {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void write() {
        System.out.println("本文的作者：" + name);
        System.out.println("作文题目");
        System.out.println("作文的第一段");
        System.out.println(writeMain());
        System.out.println("作文的最后一段");
    }

    public abstract String writeMain();

}
