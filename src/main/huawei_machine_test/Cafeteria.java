package main.huawei_machine_test;

import java.util.Arrays;

public class Cafeteria {

    public static void solution(int N, int M, String line) {

        if (N < 1 || N > 1000) return;

        int[] split = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();

        if (split.length != N) return;

        int last = 1;
        boolean flag = true;

        do {
            int tmp = M;
            int i;
            for (i = 0; i < N; i++) {
                if (tmp > split[i]) {
                    tmp -= split[i];
                    tmp += last;
                } else {
                    break;
                }
            }
            if (i == N) flag = false;
            else last++;
        } while (flag);

        System.out.println(last);

    }

}
