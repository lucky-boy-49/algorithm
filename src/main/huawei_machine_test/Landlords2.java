package main.huawei_machine_test;

import java.util.LinkedList;
import java.util.List;

/**
 * 斗地主2
 * 题目描述
 * 在斗地主扑克牌游戏中，扑克牌由小到大的顺序为3 4 5 6 7 8 9 10 J Q K A 2
 * 玩家可以出的扑克牌阵型有，单张，对子，顺子，飞机，炸弹等
 * 其中顺子的出牌规则为，由至少5张由小到大连续递增的扑克牌组成
 * 且不能包含2
 * 例如:{3,4,5,6,7}、{3,4,5,6,7,8,9,10,J,Q,K,A}都是有效的顺子
 * 而{J,Q,K,A,2}、{2,3,4,5,6}、{3,4,5,6}、{3,4,5,6,8}等都不是顺子
 * 给定一个包含13张牌的数组，如果有满足出牌规则的顺子，请输出顺子
 * 如果存在多个顺子，请每行输出一个顺子
 * 且需要按照顺子的第一张牌的大小(必须从小到大)依次输出
 * 如果没有满足出牌规则的顺子，请输出No
 * 输入描述
 * 13张任意顺序的扑克牌，每张扑克牌数字用空格隔开，
 * 每张扑克牌的数字都是合法的
 * 并且不包括大小王：2 9 J 2 3 4 K A 7 9 A 5 6
 * 不需要考虑输入为异常字符的情况
 * 输出描述
 * 组成的顺子 每张扑克牌数字用空格隔开
 * 3 4 5 6 7
 */
public class Landlords2 {

    public static void solution(String line) {

        String[] split = line.split(" ");

        String[] ints = new String[13];

        for (String str : split) {
            if (str.length() == 1) {
                char c = str.charAt(0);
                if (Character.isDigit(c)) {
                    ints[Character.digit(c, 10) - 2] = str;
                } else {
                    switch (c) {
                        case 'A' -> ints[12] = str;
                        case 'J' -> ints[9] = str;
                        case 'Q' -> ints[10] = str;
                        case 'K' -> ints[11] = str;
                        default -> {
                        }
                    }
                }
            } else {
                ints[8] = str;
            }
        }

        List<String> res = new LinkedList<>();
        for (int i = 1; i < ints.length; i++) {
            int count = 0;
            StringBuilder builder = new StringBuilder();
            while (i < ints.length && ints[i] != null) {
                builder.append(ints[i]).append(" ");
                count++;
                i++;
            }
            if (count >= 5) {
                res.add(builder.substring(0, builder.length() - 1));
            }
        }

        if (res.isEmpty()) {
            System.out.println("NO");
        } else {
            res.forEach(System.out::println);
        }

    }

}
