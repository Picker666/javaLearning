package template.func;

public class StudentPupil extends Student {

    public StudentPupil() {
    }

    public StudentPupil(String name) {
        super(name);
    }

    @Override
    public String writeMain() {
        return "小学生作文的正文。。。";
    }
}
