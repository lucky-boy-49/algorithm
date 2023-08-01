package main.huawei_machine_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 数组组成的最小数字
 * 题目描述
 * 给定一个整型数组，请从该数组中选择3个元素组成最小数字并输出
 * （如果数组长度小于3，则选择数组中所有元素来组成最小数字）。
 * 输入描述
 * 一行用半角逗号分割的字符串记录的整型数组，
 * 0 < 数组长度 <= 100，
 * 0 < 整数的取值范围 <= 10000。
 * 输出描述
 * 由3个元素组成的最小数字，
 * 如果数组长度小于3，
 * 则选择数组中所有元素来组成最小数字。
 */
public class SmallestNumberArrayConsists {

    public static void solution(String line) {
        String[] split = line.split(",");
        int length = split.length;
        StringBuilder builder = new StringBuilder();
        if (length == 1) {
            builder = new StringBuilder(split[0]);
        } else {
            List<String> list = new ArrayList<>();
            int[] ints = new int[length];
            for (int i = 0; i < length; i++) {
                ints[i] = Integer.parseInt(split[i]);
            }
            Arrays.sort(ints);
            int numbLen;
            if (length == 2) {
                numbLen = 2;
            } else {
                numbLen = 3;
            }
            for (int i = 0; i < numbLen; i++) {
                list.add(String.valueOf(ints[i]));
            }
            Collections.sort(list);
            for (int i = 0; i < numbLen; i++) {
                builder.append(list.get(i));
            }
        }
        System.out.println(Integer.valueOf(builder.toString()));
    }

}
