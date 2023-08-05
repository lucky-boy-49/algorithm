package test.huawei_machine_test;

import main.huawei_machine_test.MatrixMostValue;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

class MatrixMostValueTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] m = new int[n][n];
        for (int[] ints : m) {
            int[] array = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
            System.arraycopy(array, 0, ints, 0, n);
        }
        MatrixMostValue.solution(m);
    }
}