package huawei_machine_test;

import main.huawei_machine_test.PriorityQueue2;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class PriorityQueueTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        PriorityQueue2.solution(line);
    }
}