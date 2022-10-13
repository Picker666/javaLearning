package abstractKey;

// 抽象类
public abstract class Animal {
    private String name;

//    抽象方法，不能写方法体
    public abstract void run();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
