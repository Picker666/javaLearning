package practice;

public class Keyboard extends USB {
    @Override
    public void operation() {
        System.out.println("开始操作。");
    }

    public void type(){
        System.out.println("打字啦。。。");
    }

    public Keyboard(String name) {
        super(name);
    }

    public Keyboard() {
    }
}
