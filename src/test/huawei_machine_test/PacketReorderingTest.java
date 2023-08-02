package test.huawei_machine_test;

import main.huawei_machine_test.PacketReordering;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class PacketReorderingTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        PacketReordering.solution(N, line);
    }
}