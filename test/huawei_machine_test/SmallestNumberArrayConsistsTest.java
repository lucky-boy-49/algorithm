package huawei_machine_test;

import main.huawei_machine_test.SmallestNumberArrayConsists;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class SmallestNumberArrayConsistsTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        SmallestNumberArrayConsists.solution(s);
    }
}