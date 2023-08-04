package main.huawei_machine_test;

import java.util.Scanner;

/**
 * @author HJ
 * @date 2023/8/4 15:30
 * @description
 * 题目0246-需要打开多少监控器
 * 题目描述
 * 某长方形停车场，每个车位上方都有对应监控器，当且仅当在当前车位或者前后左右四个方向任意一个车位范围停车时，监控器才需要打开，给出某一时刻停车场的停车分布，请统计最少需要打开多少个监控器
 * 输入描述
 * 第一行输入m，n表示长宽，满足1<m,n<=20;后面输入m行，
 * 每行有n个0或1的整数，整数间使用一个空格隔开，
 * 表示该行已停车情况，其中0表示空位，1表示已停
 * 输出描述
 * 最少需要打开监控器的数量;
 */
public class ManyMonitorsNeedTurnedOn {

    static int m, n;
    static int[][] a = new int[25][25];
    static int[][] dirs = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}, {0, 0}};

    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                a[i][j] = scanner.nextInt();

        int ans = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int[] dir : dirs) {
                    int x = i + dir[0];
                    int y = j + dir[1];
                    if (x >= 1 && x <= m && y >= 1 && y <= n && a[x][y] == 1) {
                        ans++;
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }

}
