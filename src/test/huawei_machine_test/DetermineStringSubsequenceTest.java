package test.huawei_machine_test;

import main.huawei_machine_test.DetermineStringSubsequence;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class DetermineStringSubsequenceTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String target = scanner.nextLine();
        String source = scanner.nextLine();

        DetermineStringSubsequence.solution(source, target);

    }
}