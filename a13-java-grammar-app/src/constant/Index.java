package constant;

/**
 *  常量
 *      常量是使用了public static final修饰的成员变量，必须有初始值，而且执行过程中其值不能被改变。
 *      常量的作用很好处，可以用作系统的配置信息，方便程序的维护，同时也能提高可读性
 *
 *  命名规范
 *      英文单纯全部大写，多个单词下划线连起来
 *
 *  常量的执行原理
 *      在编译阶段进行"宏替换"，把使用常量的地方全部替换成真实的字面量
 *      这样做的好处是让使用常量的城市执行性能与直接使用字面量一样
 *
 * */
public class Index {
    public final static String DESCRIPTION = "Picker666";
    public static void main(String[] args) {
        System.out.println(DESCRIPTION);
        System.out.println(DESCRIPTION);
        System.out.println(DESCRIPTION);
        System.out.println(DESCRIPTION);
        System.out.println(DESCRIPTION);
        System.out.println(DESCRIPTION);
        System.out.println(DESCRIPTION);
        System.out.println(DESCRIPTION);
        System.out.println(DESCRIPTION);
        System.out.println(DESCRIPTION);
    }
}
