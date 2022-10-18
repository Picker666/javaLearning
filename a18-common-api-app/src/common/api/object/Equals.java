package common.api.object;

/**
 * Object的equals方法是什么作用
 *      默认是与另一个对象比较地址是否一样
 *      让子类重写一边比较两个子类对象的内容是否相同
 * */
public class Equals {
    public static void main(String[] args) {
        Student student = new Student("Picker", '男', 18);
        Student student1 = new Student("Picker", '男', 18);

        System.out.println(student.equals(student1));
        System.out.println(student == student1);
    }
}
