package main.huawei_machine_test;

import java.util.*;

/**
 * 题目描述
 * 给定一个射击比赛成绩单
 * 包含多个选手若干次射击的成绩分数
 * 请对每个选手按其最高三个分数之和进行降序排名
 * 输出降序排名后的选手ID序列
 * 条件如下:
 * 一个选手可以有多个射击成绩的分数 且次序不固定
 * 如果一个选手成绩小于三个 则认为选手的所有成绩无效 排名忽略该选手
 * 如果选手的成绩之和相等,则成绩相等的选手按照其ID降序排列
 * 输入描述
 * 输入第一行:一个整数 N
 * 表示该场比赛总共进行了N次射击
 * 产生N个成绩分数 2 <= N <= 100
 * 输入第二行 一个长度为N的整数序列
 * 表示参与本次射击的选手Id
 * 0 <= ID <= 99
 * 输入第三行是长度为N的整数序列
 * 表示参与每次射击的选手对应的成绩
 * 0 <= 成绩 <= 100
 * 输出描述
 * 符合题设条件的降序排名后的选手ID序列
 */
public class ShootingCompetition {

    public static void solution(int N, String id, String score) {
        if (N < 2 || N > 100) {
            return;
        }
        String[] ids = id.split(",");
        String[] scores = score.split(",");
        if (ids.length > 99 || scores.length > 100) {
            return;
        }

        Map<String, List<Integer>> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < N; i++) {
            map.putIfAbsent(ids[i], new ArrayList<>());
            map.get(ids[i]).add(Integer.valueOf(scores[i]));
        }
        map.entrySet().stream()
                .filter(entry -> entry.getValue().size() >= 3)
                .forEach(entry -> {
                    String key = entry.getKey();
                    List<Integer> values = entry.getValue();
                    int v = 0;
                    values.sort(Comparator.reverseOrder());
                    for (int i = 0; i < 3; i++) {
                        v += values.get(i);
                    }
                    map2.put(key, v);
                });
        StringBuilder res = new StringBuilder();
        map2.entrySet().stream().sorted((en1, en2) -> {
            String key1 = en1.getKey();
            String key2 = en2.getKey();
            Integer value1 = en1.getValue();
            Integer value2 = en2.getValue();
            if (Objects.equals(value1, value2)) {
                return key2.compareTo(key1);
            } else {
                return value2 - value1;
            }
        }).forEach(en -> {
            res.append(en.getKey()).append(",");
        });
        res.deleteCharAt(res.length() - 1);
        System.out.println(res);
    }

}
