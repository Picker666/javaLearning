package practice;

import java.util.ArrayList;

public class Computer {
    private static ArrayList<USB> usbs = new ArrayList<>();

    public void start() {
        USB mouse = new Mouse("罗技鼠标");
        USB keyboard = new Keyboard("机械键盘");

        usbs.add(mouse);
        usbs.add(keyboard);
    }

    public void work(){
        for (int i = 0; i < usbs.size(); i++) {
            USB usb =usbs.get(i);
            usb.useDevice();
            if (usb instanceof Mouse) {
                ((Mouse) usb).click();
            } else if (usb instanceof Keyboard) {
                ((Keyboard) usb).type();
            }
        }
    }

    public Computer() {
    }
}
