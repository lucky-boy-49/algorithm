package huawei_machine_test;

import main.huawei_machine_test.EventPush;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

class EventPushTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(" ");
        int m = Integer.parseInt(split[0]);
        int n = Integer.parseInt(split[1]);
        int R = Integer.parseInt(split[2]);
        String s = scanner.nextLine();
        int[] A = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        s = scanner.nextLine();
        int[] B = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        EventPush.solution(m, n, R, A, B);
    }
}