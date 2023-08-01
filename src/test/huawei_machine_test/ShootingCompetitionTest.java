package test.huawei_machine_test;

import main.huawei_machine_test.ShootingCompetition;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class ShootingCompetitionTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String id = scanner.nextLine();
        String score = scanner.nextLine();
        ShootingCompetition.solution(N, id, score);
    }
}