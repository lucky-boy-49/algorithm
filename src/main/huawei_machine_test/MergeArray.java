package main.huawei_machine_test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 合并数组
 * 题目描述
 * 现在有多组整数数组，需要将他们合并成一个新的数组，
 * 合并规则：从每个数组里按顺序取出固定长度的内容，合并到新的数组。
 * 取完的内容会删除掉，如果该行不足固定长度，或者已经为空，
 * 则直接取出剩余部分的内容放到新的数组中继续下一行。
 * 输入描述
 * 第1行为每次读取的固定长度len，0 < len < 10，
 * 第2行是整数数组的数目num， 0 < num < 10000，
 * 第3 ~ n 行是需要合并的数组，
 * 不同的数组用换行分割，
 * 元素之间用逗号分割，
 * 最大不超过100个元素
 * 输出描述
 * 输出一个新的数组，用逗号分割
 */
public class MergeArray {

    public static void solution(int len, String[] line) {
        List<int[]> ints = new LinkedList<>();
        for (String s : line) {
            int[] array = Arrays.stream(s.split(","))
                    .mapToInt(Integer::parseInt).toArray();
            ints.add(array);
        }

        StringBuilder res = new StringBuilder();
        int i = 0, listSize = ints.size();
        while (!ints.isEmpty()) {
            int[] a = ints.get(i % listSize);
            if (a.length > len) {
                for (int j = 0; j < len; j++) {
                    res.append(a[j]).append(",");
                }
                a = Arrays.copyOfRange(a, len, a.length);
                ints.set(i % listSize, a);
                i++;
            } else {
                for (int k : a) {
                    res.append(k).append(",");
                }
                ints.remove(a);
                listSize = ints.size();
            }
        }

        System.out.println(res.substring(0, res.length() - 1));

    }

}
