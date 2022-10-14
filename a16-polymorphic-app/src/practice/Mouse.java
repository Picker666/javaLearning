package practice;

public class Mouse extends USB{

    @Override
    public void operation() {
        System.out.println("开始操作。");
    }

    public void click(){
        System.out.println("点击啦。。。");
    }

    public Mouse(String name) {
        super(name);
    }

    public Mouse() {
    }
}
