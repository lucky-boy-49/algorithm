package huawei_machine_test;

import main.huawei_machine_test.WeAreATeam;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class WeAreATeamTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        if (n < 1 || n > 100000 || m < 1 || m > 100000) {
            System.out.println("Null");
            return;
        }
        String[] strings = new String[m];
        for (int i = 0; i < m; i++) {
            strings[i] = scanner.nextLine();
        }
        WeAreATeam.solution(strings, n);
    }
}