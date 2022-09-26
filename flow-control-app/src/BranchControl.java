import java.util.Scanner;

public class BranchControl {
    public static void main(String[] args) {
//      一、if
        int heartBeat = 30;
        if (heartBeat < 60 || heartBeat > 100) {
            System.out.println("您的心率是：" + heartBeat + "，需要进一步检查！");
        } else {
            System.out.println("您的心率是：" + heartBeat + "，可以回家了！");
        }
        System.out.println("检查结束。");

        System.out.println("----------if end-----------");
//      二、switch
//        通常适合做值匹配的分支选择，结构清晰，格式良好
        System.out.println("请输入数字：");
        Scanner scanner = new Scanner(System.in);
        int keyIn = scanner.nextInt();
        switch (keyIn) {
            case 0:
                System.out.println("你输入的是"+keyIn + "对应的是周一");
                break;
            case 1:
                System.out.println("你输入的是"+keyIn + "对应的是周二");
                break;
            case 2:
                System.out.println("你输入的是"+keyIn + "对应的是周三");
                break;
            case 3:
                System.out.println("你输入的是"+keyIn + "对应的是周四");
                break;
            case 4:
                System.out.println("你输入的是"+keyIn + "对应的是周五");
                break;
                case 5:
                System.out.println("你输入的是"+keyIn + "对应的是周六");
                break;
            case 6:
                System.out.println("你输入的是"+keyIn + "对应的是周七");
                break;
            default:
                System.out.println("你输入的是"+keyIn + "对应的是放假");
        }

//        注意事项：
//        1、switch的表达式只能是byte、short、int、char，JDK5开始支持枚举，JDK7开始支持String、不支持double、float、long。（double、float小数不精确，long太大不需要）
//        2、case给出的值不允许重复，且只能是字面量，不能是变量。
//        3、不能忘了break，否则会有穿透想象。
    }
}
