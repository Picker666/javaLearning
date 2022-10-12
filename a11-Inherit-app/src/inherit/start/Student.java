package inherit.start;

public class Student extends People {
    private String gradeClass;

    public void writeListeningFeedback() {
        System.out.println(this.getName() + "填写了听课反馈。。。");
    }
    public Student(String name, int age, String gradeClass) {
        super(name, age);
        this.gradeClass = gradeClass;
    }

    public Student(){}
}
