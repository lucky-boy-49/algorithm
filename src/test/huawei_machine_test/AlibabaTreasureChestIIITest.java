package test.huawei_machine_test;

import main.huawei_machine_test.AlibabaTreasureChestIII;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author HJ
 * @date 2023/8/4 16:42
 * @description
 */
class AlibabaTreasureChestIIITest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int z = Integer.parseInt(scanner.nextLine());
        AlibabaTreasureChestIII.solution(array, z);
    }
}