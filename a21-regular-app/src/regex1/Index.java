package regex1;

public class Index {
    public static void main(String[] args) {
        System.out.println(checkQQ("5678909"));
        System.out.println(checkQQR("98765433"));

        System.out.println("2345245hj345".matches("\\w{6,}"));
        System.out.println("34fdf".matches("\\w^_{4}"));
        System.out.println("34_d".matches("[\\w&&[^_]]{4}"));
        System.out.println("34fd".matches("[\\w&&[^_]]{4}"));

    }

    public static boolean checkQQ(String qq){
        boolean legitimate = false;
        if (qq != null & qq.length() > 6 & qq.length() < 20) {
            legitimate = true;
            for (int i = 0; i < qq.length(); i++) {
                char ch = qq.charAt(i);
                if (ch < '0' || ch > '9') {
                    legitimate = false;
                }
            }
        }

        return legitimate;
    }

    public static  boolean checkQQR(String qq) {
        return qq != null || qq.matches("\\d{6,20}");
    }
}
