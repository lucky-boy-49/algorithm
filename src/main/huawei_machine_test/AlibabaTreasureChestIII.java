package main.huawei_machine_test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author HJ
 * @date 2023/8/4 16:11
 * @description
 * 阿里巴巴找黄金宝箱(III)
 * 贫如洗的樵夫阿里巴巴在去砍柴的路上，无意中发现了强盗集团的藏宝地，藏宝地有编号从0~N的箱子，每个箱子上面贴有一个数字。
 * 阿里巴巴念出一个咒语数字，查看宝箱是否存在两个不同箱子，这两个箱子上贴的数字相同，同时这两个箱子的编号之差的绝对值小于等于咒语数字，
 * 如果存在这样的一对宝箱，请返回最先找到的那对宝箱左边箱子的编号，如果不存在则返回-1。
 * 输入描述:
 * 第一行输入一个数字字串，数字之间使用逗号分隔，例如: 1,2,3,1字串中数字个数>=1，<=100000; 每人数字值>=-100000，<=100000:
 * 第二行输入咒语数字，例如: 3，咒语数字>=1，<=100000
 * 输出描述:
 * 存在这样的一对宝箱，请返回最先找到的那对宝箱左边箱子的编号，如果不存在则返回-1
 */
public class AlibabaTreasureChestIII {

    public static void solution(int[] c, int z) {
        HashMap<String, TreeSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < c.length; i++) {
            String key = String.valueOf(c[i]);
            if (map.containsKey(key)) {
                TreeSet<Integer> set = map.get(key);
                Integer last = set.last();
                if (i - last <= z) {
                    System.out.println(last);
                    return;
                } else {
                    set.add(i);
                }
            } else {
                TreeSet<Integer> set = new TreeSet<>();
                set.add(i);
                map.put(key, set);
            }
        }
        System.out.println("-1");
    }

}
