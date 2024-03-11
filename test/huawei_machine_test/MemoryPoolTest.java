package huawei_machine_test;

import main.huawei_machine_test.MemoryPool;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class MemoryPoolTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String m = scanner.nextLine();
        String apply = scanner.nextLine();
        MemoryPool.solution(m, apply);
    }
}