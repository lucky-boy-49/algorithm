package huawei_machine_test;

import main.huawei_machine_test.RestoreNumberSequence;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class RestoreNumberSequenceTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] split = line.split(" ");
        String lines = split[0];
        int len = Integer.parseInt(split[1]);
        RestoreNumberSequence.solution(lines, len);
    }
}