package huawei_machine_test;

import main.huawei_machine_test.ReplantingUnsurvivedPopulusEuphratica;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

class ReplantingUnsurvivedPopulusEuphraticaTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int[] ms = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int K = Integer.parseInt(scanner.nextLine());
        ReplantingUnsurvivedPopulusEuphratica.solution(N, M, ms, K);
    }
}