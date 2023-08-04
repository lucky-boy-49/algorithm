package main.huawei_machine_test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author HJ
 * @date 2023/8/4 14:53
 * @description
 * 热点网站统计
 * 题目描述
 * 企业路由器的统计页面，有一个功能，需要动态统计公司访问最多的网页URL topN
 * 请设计一个算法，可以高效动态统计TopN的页面
 * 输入描述
 * 每一行都是一个URL或一个数字
 * 如果是URL代表一段时间内的网页访问
 * 如果是一个数字N 代表本次需要输出的TopN个URL
 * 输入约束:
 * 总访问网页数量小于5000个， 单网页访问次数小于65535次
 * 网页URL仅由字母数字和.分隔符组成，且长度小于等于127字节
 * 数字是正整数，小于等于10 ，且小于当前总访问网页数
 * 输出描述
 * 每行输入对应一行输出
 * 输出按访问次数排序的前N个URL，用逗号分割
 * 输出要求：
 * 每次输出要统计之前所有输入，不仅是本次输入
 * 如果有访问次数相等的URL，按URL的字符串字典序升序排列，输出排序靠前的URL
 */
public class HotSiteStatistics {

    private static final Map<String, Integer> topMap = new HashMap<>();

    public static void solution(String line) {
        if (line.length() > 2) {
            topMap.put(line, topMap.getOrDefault(line, 0) + 1);
        } else {
            int n = Integer.parseInt(line);

            List<Map.Entry<String, Integer>> list = topMap.entrySet()
                    .stream()
                    .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                    .toList();

            for (int i = 0; i < n; i++) {
                System.out.print(list.get(i).getKey());
                if (i != n - 1) {
                    System.out.print(",");
                }
            }

            System.out.println();
        }
    }

}
