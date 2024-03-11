package huawei_machine_test;

import main.huawei_machine_test.Landlords2;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class Landlords2Test {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Landlords2.solution(s);
    }
}