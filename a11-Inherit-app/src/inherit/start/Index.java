package inherit.start;

public class Index {
    public static void main(String[] args) {
        Student student = new Student("Picker", 18, "十年级十班");

        System.out.println(student.getName() + "年龄：" + student.getAge());
        student.queryClassList();
        student.writeListeningFeedback();

        Teacher teacher = new Teacher("P", 28, "IT");

        System.out.println(teacher.getName() + "老师，年龄：" + teacher.getAge());
        teacher.queryClassList();
        teacher.publishProblem();
    }
}
