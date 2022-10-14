package localInnerClass;
/**
 * 局部内部类
 *      局部内部类放在方法，代码块，构造器等执行体中
 *      局部内部类的类文件名位：外部类$N内部类.class
 *
 * */
public class Index {
    static {
        class B {

        }

        abstract class C {

        }

        interface D {

        }
    }

    public static void main(String[] args) {
        class A {
            private String name;
            public static int age = 100;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
