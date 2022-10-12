package permission.modifier.testing2;

import permission.modifier.testing1.Parent;

public class Child extends Parent {
    public static void main(String[] args) {
        Child child = new Child();

//        child.privateMethod();
//        child.Method();
        child.protectedMethod();
        child.publicMethod();
    }

}
