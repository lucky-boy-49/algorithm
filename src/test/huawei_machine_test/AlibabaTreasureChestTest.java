package test.huawei_machine_test;

import main.huawei_machine_test.AlibabaTreasureChest;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class AlibabaTreasureChestTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println(AlibabaTreasureChest.solution(next));
    }
}