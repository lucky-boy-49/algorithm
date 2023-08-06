package test.huawei_machine_test;

import main.huawei_machine_test.BirthdayPresent;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class BirthdayPresentTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String cakes = scanner.nextLine();
        String gift = scanner.nextLine();
        int x = Integer.parseInt(scanner.nextLine());
        BirthdayPresent.solution(cakes, gift, x);
    }
}