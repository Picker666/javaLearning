package create;

public class MethodDemo1 {
    public static void main(String[] args) {
        int res = add(1,2);
        System.out.println(res);

        System.out.println("==========================");

        print("Picker");
    }

    public static int add(int a,int b) {
        int c = a + b;
        return c;
    }

    public static void print(String name) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello " + name);
        }
    }

//    1、方法的编写顺序无所谓；
//    2、方法与方法之间是平级关系不能嵌套；
//    3、方法的返回值类型位void，方法内部就不能使用return返回数据，如果方法的返回值写了类型，那么方法就必须返回对应的类型；
//    4、return 语句之后是不能写代码的，因为return之后的代码永远不会执行；
//    5、方法不调用就不执行，如果调用就必须严格执行方法的参数情况；
//    6、有返回值的方法，调用时要用变量接收，或者输出调用，甚至直接调用，无返回值的方法只能直接调用。
}
