package main.huawei_machine_test;

/**
 * 矩阵最大值
 * 矩阵最值
 * 题目描述
 * 给定一个仅包含0和1的n*n二维矩阵
 * 请计算二维矩阵的最大值
 * 计算规则如下
 * 每行元素按下标顺序组成一个二进制数(下标越大约排在低位)，
 * 二进制数的值就是该行的值，矩阵各行之和为矩阵的值
 * 允许通过向左或向右整体循环移动每个元素来改变元素在行中的位置
 * 比如
 * [1,0,1,1,1]向右整体循环移动两位[1,1,1,0,1]
 * 二进制数为11101值为29
 * [1,0,1,1,1]向左整体循环移动两位[1,1,1,1,0]
 * 二进制数为11110值为30
 * 输入描述
 * 数据的第一行为正整数，记录了N的大小，0 < N <= 20
 * 输入的第2到n+1行为二维矩阵信息，行内元素边角逗号分割
 * 输出描述
 * 矩阵的最大值
 */
public class MatrixMostValue {

    public static void solution(int[][] m) {
        int res = 0;
        for (int[] ints : m) {
            int length = ints.length;
            int max = 0;
            int i = 0;
            while (i < length) {
                StringBuilder builder = new StringBuilder();
                for (int anInt : ints) {
                    builder.append(anInt);
                }
                int max2 = Integer.parseInt(builder.toString(), 2);
                builder = new StringBuilder();
                int tmp = ints[length - 1];
                for (int j = length - 1; j > 0; j--) {
                    ints[j] = ints[j - 1];
                }
                ints[0] = tmp;
                max = Math.max(max, max2);
                i++;
            }
            res += max;
        }
        System.out.println(res);
    }

}
