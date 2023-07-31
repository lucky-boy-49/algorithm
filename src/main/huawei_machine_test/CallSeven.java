package main.huawei_machine_test;

import java.util.Arrays;

/**
 * 题目0016-喊七
 * 喊7，是一个传统的聚会游戏，
 * N个人围成一圈，按顺时针从1 - 7编号，
 * 编号为1的人从1开始喊数，
 * 下一个人喊得数字是上一个人喊得数字+1，
 * 但是当将要喊出数字7的倍数或者含有7的话，
 * 不能喊出，而是要喊过。
 * 假定N个人都没有失误。
 * 当喊道数字k时，
 * 可以统计每个人喊“过"的次数。
 * 现给定一个长度N的数组，
 * 存储打乱的每个人喊”过"的次数，
 * 请把它还原成正确顺序。
 * 即数组的第i个元素存储编号i的人喊“过“的次数
 */
public class CallSeven {

    public static void solution(int[] lines) {
        int peopleNum = lines.length;
        int[] peoples = new int[peopleNum];
        int CallSum = Arrays.stream(lines).sum();

        int currCall = 1, call = 1, index = 0;

        while (currCall <= CallSum) {
            String strCall = String.valueOf(call);
            if (call % 7 == 0 || strCall.contains("7")) {
                peoples[index % peopleNum]++;
                currCall++;
            }
            call++;
            index++;
        }
        Arrays.stream(peoples).forEach(System.out::print);
    }

}
