package test.huawei_machine_test;

import main.huawei_machine_test.SequenceReduction;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class SequenceReductionTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        SequenceReduction.solution(n);
    }
}