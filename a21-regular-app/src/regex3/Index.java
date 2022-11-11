package regex3;

public class Index {
    public static void main(String[] args) {
        String names = "中国666统一333了";
        String[] namesA = names.split("\\w+");
        System.out.println(namesA);
        for (int i = 0; i < namesA.length; i++) {
            System.out.println(namesA[i]);
        }

        System.out.println(names.replaceAll("\\w", ""));
    }
}
