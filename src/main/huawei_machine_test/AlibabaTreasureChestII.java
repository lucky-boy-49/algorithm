package main.huawei_machine_test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author HJ
 * @date 2023/8/4 16:49
 * @description
 * 一贫如洗的樵夫阿里巴巴在去砍柴的路上，无意中发现了强盗集团的藏宝地，藏宝地有编号从0~N的箱子，每个箱子上面贴有箱子中藏有金币的数量。
 * 从金币数量中选出一个数字集合，并销毁贴有这些数字的每个箱子，如果能销毁一半及以上的箱子，则返回这个数字集合的最小大小。
 * 输入描述:
 * 一个数字字串，数字之间使用逗号分隔，例如: 6,6,6,6,3,3,3,1,1,5字串中数字的个数为偶数，并且个数>=1，<=100000; 每个数字>=1，<=100000;
 * 输出描述
 * 这个数字集合的最小大小，例如: 2
 */
public class AlibabaTreasureChestII {

    public static void solution(String line) {
        String[] split = line.split(",");
        int half = split.length / 2;
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : split) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        List<Map.Entry<String, Integer>> list = map.entrySet().stream().sorted((e1, e2) -> {
            return e2.getValue() - e1.getValue();
        }).toList();
        int res = 0, curr = 0;
        for (Map.Entry<String, Integer> entry : list) {
            res++;
            curr += entry.getValue();
            if (curr > half) {
                System.out.println(res);
                return;
            }
        }
    }

}
