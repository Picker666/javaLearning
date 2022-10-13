package interfaceImplements;
/**
 * 接口的用法：
 *      接口是用来被类实现的，实现接口的类叫做实现类，实现类可以认为是子类
 *      接口可以被单实现，也可以被多实现
 *
 *  注意事项
 *      一个类实现接口，必须重写全部接口的全部抽象方法，否则这个类需要定一个成抽象类
 *
 * */
public class Index {
    public static void main(String[] args) {
        PingPangMan pingPangMan = new PingPangMan("Picker");
        pingPangMan.run();
        pingPangMan.competition();
        pingPangMan.rule();
    }
}
