package common.api.object;

/**
 * 1、Object的toString方法的作用
 *      默认是打印当前对象的地址；
 *      让子类重写，以便返回子类对象的内容
 *
 * */
public class Index {
    public static void main(String[] args) {
        Student student = new Student("Picker", '男', 18);
        String rs = student.toString();

//        直接输出对象变量，默认可以省略toString（）调用不写
        System.out.println(rs.toString());
        System.out.println(rs);
    }
}
