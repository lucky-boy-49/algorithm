package test.huawei_machine_test;

import main.huawei_machine_test.LongestContiguousSubsequence;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class LongestContiguousSubsequenceTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int sum = scanner.nextInt();
        LongestContiguousSubsequence.solution(line, sum);
    }
}