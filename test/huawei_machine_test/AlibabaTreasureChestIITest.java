package huawei_machine_test;

import main.huawei_machine_test.AlibabaTreasureChestII;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author HJ
 * @date 2023/8/4 17:13
 * @description
 */
class AlibabaTreasureChestIITest {

    @Test
    void solution() {
        String line = new Scanner(System.in).nextLine();
        AlibabaTreasureChestII.solution(line);
    }

}