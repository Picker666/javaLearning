package inherit.start;

public class Teacher extends People {
    private String department;

    public void publishProblem() {
        System.out.println(this.getName() + "发布了问题。。。");
    }

    public Teacher(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public Teacher() {}

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
