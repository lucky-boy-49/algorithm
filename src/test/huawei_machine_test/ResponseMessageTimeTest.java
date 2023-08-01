package test.huawei_machine_test;

import main.huawei_machine_test.ResponseMessageTime;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class ResponseMessageTimeTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        int[] T = new int[C];
        int[] M = new int[C];
        for (int i = 0; i < C; i++) {
            T[i] = scanner.nextInt();
            M[i] = scanner.nextInt();
        }
        ResponseMessageTime.solution(C, T, M);
    }
}