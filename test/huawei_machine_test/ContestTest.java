package huawei_machine_test;

import main.huawei_machine_test.Contest;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class ContestTest {

    @Test
    void solution() {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Contest.solution(line);

    }
}