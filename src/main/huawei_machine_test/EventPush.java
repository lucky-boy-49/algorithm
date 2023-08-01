package main.huawei_machine_test;

/**
 * 题目0132-事件推送
 * 页面内容
 * 讨论
 * 最后编辑
 * Amos
 * 09/17/2022
 * 事件推送
 * 题目描述
 * 同一个数轴X上有两个点的集合A={A1, A2, …, Am}和B={B1, B2, …, Bn}，
 * Ai和Bj均为正整数，A、B已经按照从小到大排好序，A、B均不为空，
 * 给定一个距离R(正整数)，
 * 列出同时满足如下条件的所有（Ai, Bj）数对：
 * Ai <= Bj
 * Ai, Bj之间的距离小于等于R
 * 在满足1,2的情况下，每个Ai只需输出距离最近的Bj
 * 输出结果按Ai从小到大的顺序排序
 * 输入描述
 * 第一行三个正整数m，n，R
 * 第二行m个正整数，表示集合A
 * 第三行n个正整数，表示集合B
 * 输入限制：
 * 1 <= R <= 100000，1 <= n,m <= 100000，1 <= Ai,Bj <= 1000000000
 * 输出描述
 * 每组数对输出一行Ai和Bj，以空格隔开
 */
public class EventPush {

    public static void solution(int m, int n, int R, int[] A, int[] B) {
        int[] res = new int[m];
        int j = 0;
        for (int i = 0; i < m; i++) {
            while (B[j] < A[i]) {
                j++;
            }
            if (B[j] - A[i] <= R) {
                res[i] = B[j++];
            }
        }
        for (int i = 0; i < res.length; i++) {
            if (res[i] != 0) {
                System.out.println(A[i] + " " + res[i]);
            }
        }
    }

}
