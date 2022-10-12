package permission.modifier.testing1;

public class Index {
    public static void main(String[] args) {
        Parent parent = new Parent();

//        parent.privateMethod();
        parent.Method();
        parent.protectedMethod();
        parent.publicMethod();
    }
}
