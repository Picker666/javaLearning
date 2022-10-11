package Static1MemberVariable;

public class User {
    private String userName = "picker"; // 被private修饰，不能使用类或者实例直接访问
    private int age;
    public static int onlineNumber = 666;

    public static void main(String[] args) {
//        static 是静态的意思，修饰成员变量和成员方法；
//        static修饰的成员变量表示该变量在内存中只存储一份，可以被共享访问、修改。

//        一、静态成员变量（static修饰，属于类，内存中只存在一个），可以被共享。
//        1、使用类名访问（推荐）
        System.out.println(User.onlineNumber++);// 同一个类中访问静态成员变量，可以直接访问
        System.out.println(onlineNumber);

//        2、使用对象访问
        User user = new User();
        System.out.println(user.onlineNumber);

//      二、实例成员变量（无static修饰，存在每个对象中）；属于对象的信息
        user.userName = "Picker666";// 在类之外，不能这么访问。借助于get方法
        System.out.println(user.userName);
        user.age = 18;
        System.out.println(user.age);

//        三、内存机制
//        当类被执行的时候，静态成员变量会被加载到堆内存中，实例成员变量不会被加载，直到类被实例化，会在堆内存中开辟该实例对应的空间，这时候实例成员变量被初始化，被初始化的成员变量只属于该实例对象。

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static int getOnlineNumber() {
        return onlineNumber;
    }

    public static void setOnlineNumber(int onlineNumber) {
        User.onlineNumber = onlineNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
