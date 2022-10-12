package permission.modifier.testing1;

/**
 *   1、 private，只能本类访问
 *   2、缺省，只能在本类和同包的其他类中访问（包访问）
 *   3、 protected，在本类，同包的其他类和其他包的子类中访问 (类访问)
 *   4、 public，在本类，同包的其他类，其他包的子类 和 其他包的无关类 中访问
 *
 *  使用
 *      成员变量一般私有
 *      方法一般公开
 *      如果成员希望本类中访问，使用privat修饰；
 *      如果成员希望本类，同一包下的其他类和子类访问，使用protected 修饰。
 * */
public class Parent {

//   1、 private，只能本类访问
    private void privateMethod(){
        System.out.println("---private---");
    }

//    2、只能在本类和同包的其他类中访问（包访问）
    void Method(){
        System.out.println("---缺省---");
    }

//   3、 protected，在本类，同包的其他类和其他包的子类中访问 (类访问)
    protected void protectedMethod(){
        System.out.println("---protected---");
    }

//   4、 public，在本类，同包的其他类，其他包的子类 和 其他包的无关类 中访问
    public void publicMethod(){
        System.out.println("---public---");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();

        parent.privateMethod();
        parent.Method();
        parent.protectedMethod();
        parent.publicMethod();
    }

}
