package test.huawei_machine_test;

import main.huawei_machine_test.MatrixSparseScan;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

class MatrixSparseScanTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] split1 = string.split(" ");
        int m = Integer.parseInt(split1[0]);
        int n = Integer.parseInt(split1[1]);
        int[][] s = new int[m][n];
        for (int i = 0; i < m; i++) {
            String line = scanner.nextLine();
            int[] split = Arrays.stream(line.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            System.arraycopy(split, 0, s[i], 0, n);
        }
        MatrixSparseScan.solution(s);
    }
}