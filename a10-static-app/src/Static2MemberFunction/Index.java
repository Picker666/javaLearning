package Static2MemberFunction;

public class Index {
    private String name;

    //    一、静态成员方法（没有static修饰，属于类方法），推荐类名直接访问，也可以使用实例访问
    public static int getMax(int age, int age2) {
        return age > age2 ? age : age2;
    }

    //   二、实例成员方法（无static修饰，属于对象），只能通过对象访问。
    public void study(){
        System.out.println("learning");
    }

    public static void main(String[] args) {

        System.out.println(Index.getMax(1,2));
        System.out.println(getMax(3,2));

        Index index = new Index();
        index.name = "Picker";
        index.study();


        System.out.println(index.getMax(3,4));// 不推荐
    }

//    三、使用场景
//    1、实例方法，表示对象自己的行为，并且需要访问实例成员的，
//    2、静态方法，以执行一个共用的功能为目的

//    四、内存机制
//    类被加载时候，静态方法会被邮件加载到方法区，实例方法直到类被实例化之后，在堆内存创建实例对象，实例方法被加载到方法区，对象的方法应用指向方法区的实例方法

}
