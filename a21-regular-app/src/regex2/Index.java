package regex2;

public class Index {
    public static void main(String[] args) {
        System.out.println(phoneTest("123456789010"));
        System.out.println(phoneTest("12u45678901"));
        System.out.println(phoneTest("22345678901"));
        System.out.println(phoneTest("12345678901"));

        System.out.println("==================");

        System.out.println(emailTest("_123456789010@qq.com"));
        System.out.println(emailTest("123456789010@qq.com.cn"));
        System.out.println(emailTest("123456789_010@126.com.cn"));
        System.out.println(emailTest("3456uu7888@163.com"));
    }

    public static boolean phoneTest (String phoneNum) {
        return phoneNum != null && phoneNum.matches("1[\\d]{10}");
    }

    public static boolean emailTest (String email) {
        return email != null && email.matches("[\\w&&[^_]]\\w{2,}@[a-zA-Z0-9]{2,30}(\\.[a-zA-Z0-9]{2,})+");
    }
}
