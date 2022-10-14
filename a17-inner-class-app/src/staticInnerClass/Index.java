package staticInnerClass;

public class Index {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner("Picker", 18);
        System.out.println(inner.getName() + "," + inner.getAge() + "岁");
        inner.show();

        System.out.println(Outer.Inner.homeName);
        System.out.println(Outer.outerName);
    }
}
