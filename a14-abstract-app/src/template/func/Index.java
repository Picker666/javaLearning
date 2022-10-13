package template.func;

/**
 * 模版方法模式
 *      当系统中出现同一个功能多处在开发，而该功能中大部分代码是一样的，只有其中部分可能是不同的时候。
 *
 * 模版方法模式实现模式
 *      1、把功能定义成一个所谓的模版方法，放在抽象类中，模版方法中只定义通用且能确定的代码
 *      2、模版方法中不能决定的功能定义成抽象方法让具体子类去实现。
 * */
public class Index {
    public static void main(String[] args) {
        StudentMiddle studentMiddle = new StudentMiddle("Picker");
        StudentPupil studentPupil = new StudentPupil("Christine");

        studentMiddle.write();
        studentPupil.write();
    }
}
