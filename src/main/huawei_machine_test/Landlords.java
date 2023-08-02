package main.huawei_machine_test;

import java.util.HashMap;

/**
 * 斗地主
 * 题目描述
 * 斗地主起源于湖北十堰房县，
 * 据传是一位叫吴修全的年轻人根据当地流行的扑克玩法“跑得快”改编的，
 * 如今已风靡整个中国，并流行于互联网上
 * 牌型：
 * 单顺，又称顺子，最少5张牌，最多12张牌(3...A),不能有2，
 * 也不能有大小王，不计花色
 * 例如：3-4-5-7-8，7-8-9-10-J-Q，3-4-5-6-7-8-9-10-J-Q-K-A
 * 可用的牌3<4<5<6<7<8<9<10<J<Q<K<A<2<B(小王)<C(大王)，
 * 每种牌除大小王外有4种花色(共有13X4+2张牌)
 * 输入
 * 手上已有的牌
 * 已经出过的牌(包括对手出的和自己出的牌)
 * 输出：对手可能构成的最长的顺子(如果有相同长度的顺子，输出牌面最大的那一个)，
 * 如果无法构成顺子，则输出NO-CHAIN
 * 输入描述
 * 输入的第一行为当前手中的牌
 * 输入的第一行为已经出过的牌
 * 输出描述
 * 最长的顺子
 */
public class Landlords {

    private static final String[] graph = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    public static void solution(String my, String over) {
        HashMap<String, Integer> cards = new HashMap<>();
        for (String s : graph) {
            cards.put(s, 4);
        }

        diff(cards, my);
        diff(cards, over);

        System.out.println(find(cards));

    }

    private static void diff(HashMap<String, Integer> cards, String str) {
        for (String card : str.split("-")) {
            if (cards.containsKey(card)) {
                cards.put(card, cards.get(card) - 1);
            }
        }

    }

    private static String find(HashMap<String, Integer> cards) {
        String res = "NO-CHAIN";

        int l = 0, r = 0;
        for (int i = 0; i < graph.length; i++) {
            String card = graph[i];
            if (cards.get(card) > 0) {
                l = i;
                while (i < graph.length - 1 && cards.get(graph[i + 1]) > 0) {
                    i++;
                }
                r = i + 1;
                if (r - l >= 5) {
                    StringBuilder builder = new StringBuilder();
                    for (int j = l; j < r; j++) {
                        builder.append(graph[j]).append("-");
                    }
                    if (!builder.isEmpty()) {
                        res = builder.substring(0, builder.length() - 1);
                    }
                }
            }
        }
        return res;
    }

}
