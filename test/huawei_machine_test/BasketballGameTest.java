package huawei_machine_test;

import main.huawei_machine_test.BasketballGame;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class BasketballGameTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        BasketballGame.solution(s);
    }
}