package huawei_machine_test;

import main.huawei_machine_test.Landlords;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class LandlordsTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String my = scanner.nextLine();
        String over = scanner.nextLine();
        Landlords.solution(my, over);
    }
}