package huawei_machine_test;

import main.huawei_machine_test.NumberTuples;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class NumberTuplesTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int k = scanner.nextInt();
        int target = scanner.nextInt();
        NumberTuples.solution(line, k, target);
    }
}