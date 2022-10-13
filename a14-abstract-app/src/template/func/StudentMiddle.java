package template.func;

public class StudentMiddle extends Student{

    public StudentMiddle() {
    }

    public StudentMiddle(String name) {
        super(name);
    }

    @Override
    public String writeMain() {
        return "中学生作文的正文。。。";
    }
}
