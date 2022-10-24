package common.api.StringBuilder;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 99};
        String arrString = toString(arr);
        System.out.println(arrString);
    }

    public static String toString(int[] arr) {
        if (arr == null) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(i == arr.length - 1 ? "" : ", ");
        }

        sb.append("]");

        return sb.toString();
    }
}
