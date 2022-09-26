import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
//        一、for
        int ii = 1;
        for (; ii < 6; ii++) {
            System.out.println(ii);
        }
        System.out.println("out of loop, ii is "+ii);

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        System.out.println("水仙花数：");
        for (int i = 100; i < 1000; i++) {
            int g = i%10;
            int s = i/10%10;
            int b = i/100%10;
            if (g*g*g + s*s*s + b*b*b == i) {
                System.out.println(i + "\t" + '!');
            }
        }

        System.out.println("=============for end==============");

//        二、while
        int i= 0;
        while (i<10) {
            System.out.println(i++ + "while");
        }

//        0.1毫米的纸折叠多少次高于珠穆朗玛峰的高度，8848.86m

        double height = 0.1;
        double peakHeight = 8848860;
        int count = 0;

        while (height < peakHeight) {
            height *= 2;
            count++;
        }
        System.out.println("折叠次数：" + count + "，当前的高度是：" + height);

        System.out.println("===============while end=======================");

//        三、do while
//        一定先执行一次循环体

//        四、死循环
//        for(; ;) {
//            System.out.println("Hello world!!!");
//        }

//        while (true) {
//            System.out.println("这是一个经典的死循环");
//        }
//        do {
//            System.out.println("do while 死循环");
//        } while(true);

        int password = 666;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入密码：");
            int keyIn = sc.nextInt();
            if (keyIn == password) {
                System.out.println("输入正确！");
                break;
            }
        }

//        五、嵌套循环
        for (int k = 0; k<5;k++) {

            for (int j = 0; j<5;j++) {
                System.out.print('*' + "\t");
            }
            System.out.println();
        }

//        六、continue 、break
//        break 只能结束当前循环，包含switch
//        continue 只能在循环中使用


    }
}
