package Static6Cards;

import java.util.ArrayList;

public class Index {
//    1、定义一个集合只加载一次，后续直接使用。
    public static ArrayList<String> cards = new ArrayList<>();

//    2、在程序执行前（main），把牌放进去
    static {
//    3、做牌
//    4、定义数组存储点数，类型和个数确定，
        String[] sizes = {"A", "1", "2", "3", "4", "5", "6", "7", "9", "10", "J", "Q", "K"};
        String[] colors = {"♥️", "♦️", "♠️", "♣️"};
        
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                cards.add(sizes[i] + colors[j]);
            }
        }
//        单独加入大小王
        cards.add("🃏");
        cards.add("🃏");

        System.out.println(cards);
    }

    public static void main(String[] args) {

    }
}
