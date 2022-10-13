package enumeration;

/**
 * 枚举类
 *      1、枚举类都是继承了枚举类型：java.lang.Enum;
 *      2、枚举类是最终类，不可被继承；
 *      3、构造器都是私有的，枚举对外不能创建对象；
 *      4、枚举第一行默认都是罗列当前对象的名称。
 *      5、枚举相当于多例模式
 *
 * 信息标志和分类
 *
 *
 * */
public enum Index {
//    枚举类的第一行必须罗列枚举类的对象名称，建议全部大写。
    SPRING, SUMMER, AUTUMN, WINTER
}

/**
 * 编译之后的结果
 public final class Index extends java.lang.Enum<Index> {
    public static final Index SPRING = new Index();
    public static final Index SUMMER = new Index();
    public static final Index AUTUMN = new Index();
    public static final Index WINTER = new Index();
    public static Index[] value();
    public static Index valueOf(java.lang.String);
 }


 *
 * */
