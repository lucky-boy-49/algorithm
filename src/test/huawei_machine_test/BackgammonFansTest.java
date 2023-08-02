package test.huawei_machine_test;

import main.huawei_machine_test.BackgammonFans;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class BackgammonFansTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        int nub = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        BackgammonFans.solution(nub, line);
    }
}