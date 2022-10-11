package static4Util;

import java.util.Random;

public class Login {
    public static void main(String[] args) {
        String code = Util.CreateVerifyCode();
        System.out.println(code);
    }
}
