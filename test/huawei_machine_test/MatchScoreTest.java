package huawei_machine_test;

import main.huawei_machine_test.MatchScore;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class MatchScoreTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        MatchScore.solution(s);
    }
}