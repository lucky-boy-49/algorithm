package huawei_machine_test;

import main.huawei_machine_test.FindEnd;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class FindEndTest {

    @Test
    void solution() {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        FindEnd.solution(line);
    }
}