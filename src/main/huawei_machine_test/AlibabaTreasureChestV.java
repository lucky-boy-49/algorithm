package main.huawei_machine_test;

import java.util.Arrays;

/**
 * 阿里巴巴找黄金宝箱(V)
 * 阿里巴巴找黄金宝箱(V)
 * 题目描述
 * 一贫如洗的樵夫阿里巴巴在去砍柴的路上，无意中发现了强盗集团的藏宝地，藏宝地有编号从0~N的箱子，每个箱子上面贴有一个数字。
 * 阿里巴巴念出一个咒语数字k(k<N)，找出连续k个宝箱数字和的最大值，并输出该最大值。
 * 输入描述
 * 第一行输入一个数字字串，数字之间使用逗号分隔，例如：2,10,-3,-8,40,5
 * 1 ≤ 字串中数字的个数 ≤ 100000
 * -10000 ≤ 每个数字 ≤ 10000
 * 第二行输入咒语数字，例如：4，咒语数字大小小于宝箱的个数
 * 输出描述
 * 连续k个宝箱数字和的最大值，例如：39
 */
public class AlibabaTreasureChestV {

    public static void solution(int k, String line) {
        int[] array = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int left = 0, right = k - 1, curValue = 0, maxValue = Integer.MIN_VALUE;
        for (int i = 0; i <= right; i++) {
            curValue += array[i];
        }
        maxValue = curValue;
        while (right + 1 < array.length) {
            curValue += (array[++right] - array[left++]);
            maxValue = Math.max(maxValue, curValue);
        }
        System.out.println(maxValue);
    }

}
