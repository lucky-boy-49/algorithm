package test.huawei_machine_test;

import main.huawei_machine_test.AlibabaTreasureChestV;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class AlibabaTreasureChestVTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int k = scanner.nextInt();
        AlibabaTreasureChestV.solution(k, line);
    }
}