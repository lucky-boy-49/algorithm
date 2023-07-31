package main.huawei_machine_test;

import java.util.Arrays;

/**
 * 题目0008-双十一
 * 双十一众多商品进行打折销售，小明想购买一些自己心仪的商品，
 * 但由于受购买资金限制，所以他决定从众多心意商品中购买3件，
 * 而且想尽可能的花完资金，
 * 现在请你设计一个程序帮助小明计算尽可能花费的最大资金额。
 * 第一行为整型数组M，数组长度小于100，数组元素记录单个商品的价格；
 * 单个商品价格小于1000；
 * 第二行输入为购买资金的额度R；
 * R < 100000。
 * 输出为满足上述条件的最大花费额度
 * 如果不存在满足上述条件的商品请返回-1
 */
public class MaximumMountSpent {

    public static void solution(int limit, String[] commodity) {
        Arrays.sort(commodity);

        int res = 0;

        for (int i = commodity.length - 1; i >= 2; i--) {
            int sum = Integer.parseInt(commodity[i]) + Integer.parseInt(commodity[i - 1]) + Integer.parseInt(commodity[i - 2]);
            if (sum <= limit) {
                System.out.println(sum);
            }
        }

        System.out.println("-1");

    }

}
