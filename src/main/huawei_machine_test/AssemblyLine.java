package main.huawei_machine_test;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author HJ
 * @date 2023/8/4 14:18
 * @description
 * 流水线
 * 题目描述
 * 一个工厂有m条流水线
 * 来并行完成n个独立的作业
 * 该工厂设置了一个调度系统
 * 在安排作业时，总是优先执行处理时间最短的作业
 * 现给定流水线个数m
 * 需要完成的作业数n
 * 每个作业的处理时间分别为 t1,t2...tn
 * 请你编程计算处理完所有作业的耗时为多少
 * 当n > m时 首先处理时间短的m个作业进入流水线
 * 其他的等待
 * 当某个作业完成时，
 * 依次从剩余作业中取处理时间最短的
 * 进入处理
 * 输入描述
 * 第一行为两个整数(采取空格分隔)
 * 分别表示流水线个数m和作业数n
 * 第二行输入n个整数(采取空格分隔)
 * 表示每个作业的处理时长 t1,t2...tn
 * 0 < m, n< 100
 * 0 < t1,t2...tn < 100
 * 输出描述
 * 输出处理完所有作业的总时长
 */
public class AssemblyLine {

    public static void solution(int m, int n, int[] times) {
        Arrays.sort(times);
        if (n <= m) {
            System.out.println(times[n - 1]);
        } else {
            int i = 0, res = 0;
            LinkedList<Integer> list = new LinkedList<>();
            for (i = 0; i < m; i++) {
                list.add(times[i]);
            }
            while (!list.isEmpty()) {
                res++;
                for (int j = 0; j < list.size(); j++) {
                    int cur = list.get(j);
                    cur--;
                    if (cur == 0) {
                        if (i < n) {
                            list.set(j, times[i++]);
                        } else {
                            list.remove(j--);
                        }
                    } else {
                        list.set(j, cur);
                    }
                }
            }
            System.out.println(res);
        }
    }

}
