package huawei_machine_test;

import main.huawei_machine_test.IncreasingContiguousSequence;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class IncreasingContiguousSequenceTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        IncreasingContiguousSequence.solution(line);
    }
}