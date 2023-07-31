package main.huawei_machine_test;

import java.util.Arrays;

/**
 * seat adjustment
 * 疫情期间课堂的座位进行了特殊的调整，不能出现两个同学紧挨着，必须隔至少一个空位给你一个整数数组 desk表示当前座位的占座情况，由若干 0 和 1 组成，其中 0 表示没有占位，1 表示占位。在不改变原有座位秩序情况下，还能安排坐几个人?
 * 输入描述:
 * 第一行是个了数组表示作为占座情况，由若干 0 和1组成，其中 0 表示没有占位，1 表示占位
 * 输出描述:
 * 输出数值表示还能坐几个人
 */
public class SeatAdjustment {

    public static void solution(String line) {

        int[] array = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();

        int res = 0;

        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == 1 && array[i + 1] == 0) {
                if (array[i + 2] != 1 && array[i + 3] != 1) {
                    res++;
                    array[i + 2] = 1;
                    i = i + 2;
                }
            } else if (array[i - 1] != 1 && array[i] == 0 && array[i + 1] == 0) {
                res++;
                array[i] = 1;
            }
        }

        System.out.println(res);

    }


}
