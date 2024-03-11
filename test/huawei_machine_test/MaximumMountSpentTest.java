package huawei_machine_test;

import main.huawei_machine_test.MaximumMountSpent;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class MaximumMountSpentTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String m = scanner.nextLine();
        int r = scanner.nextInt();
        MaximumMountSpent.solution(r, m.split(","));
    }
}