package main.huawei_machine_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * 乱序整数序列两数之和绝对值最小
 * 题目描述
 * 给定一个随机的整数数组(可能存在正整数和负整数)nums,
 * 请你在该数组中找出两个数，其和的绝对值(|nums[x]+nums[y]|)为最小值
 * 并返回这两个数(按从小到大返回)以及绝对值。
 * 每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 输入描述
 * 一个通过空格空格分割的有序整数序列字符串，最多1000个整数，
 * 且整数数值范围是[-65535,65535]
 * 输出描述
 * 两个数和两数之和绝对值
 */
public class MinimumAbsolute {

    public static void solution(String numsStr) {
        String[] nums = numsStr.split(" ");
        ArrayList<Integer> list = Arrays.stream(nums)
                .map(Integer::parseInt)
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));

        int min = Integer.MAX_VALUE;

        Set<Integer> resSet = new TreeSet<>();

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i; j < list.size(); j++) {
                Integer a = list.get(i);
                Integer b = list.get(j);
                int sum = Math.abs(a + b);
                if (sum < min && !a.equals(b)) {
                    min = sum;
                    resSet.clear();
                    resSet.add(a);
                    resSet.add(b);
                }
            }
        }

        if (!resSet.isEmpty()) {
            for (Integer i : resSet) {
                System.out.println(i + " ");
            }
            System.out.println(min);
        }

    }

}
