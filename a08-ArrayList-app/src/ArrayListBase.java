import java.util.ArrayList;

public class ArrayListBase {
    public static void main(String[] args) {
        /**
         * 数组长度确定，类型确定，适合长度和类型确定的场景
         * 集合长度不固定，动态变化，类型不固定，比较适合做增删操作的功能，集合有很多丰富的功能。
         */

//        1、ArrayList 创建

        ArrayList list = new ArrayList<>();

//        2、添加
        list.add("Picker");
        list.add(18);
        list.add(666.66);

        // add 方法返回boolean（添加是否成功）

        System.out.println(list); // [Picker, 18, 666.66]

//        3、给指定位置添加元素
        list.add(1, 1314);

        System.out.println(list);

//        5、ArrayList 泛型,
//        在编译阶段约束
        ArrayList<String> list1 = new ArrayList<>(); // 从JDK1.7 开始，泛型后边的类型可以不写

        list1.add("Picker");
//        list1.add(99); // error
        list1.add("666");

        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(1);
        System.out.println(list2);

//        6、get
        String name = list1.get(0);
        System.out.println(name);

//        7、size
        int size = list1.size();
        System.out.println(size);

//        8、遍历
        System.out.println("========遍历===========");
        for (int i = 0; i < size; i++) {
            System.out.println(list1.get(i));
        }

//        9、public E remove(int index)
        System.out.println(list1);
        String name1 = list1.remove(0);
        System.out.println(name1);

//        10、public E remove(E index)

        ArrayList<String> l = new ArrayList<>();
        l.add("Picker");
        l.add("Christine");
        l.add("Picker");
        l.add("Tyler");
        l.add("Roger");
        System.out.println(l);
        l.remove("Picker"); // 默认删除第一个
        System.out.println(l);

        System.out.println(list2);
        list2.remove(1); // 如果传入的是数字，认为是 index
        System.out.println(list2);

//        11、set
        l.set(2, "Fizz");

        System.out.println(l);

    }
}
