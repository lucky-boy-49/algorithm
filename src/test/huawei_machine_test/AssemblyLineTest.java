package test.huawei_machine_test;

import main.huawei_machine_test.AssemblyLine;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author HJ
 * @date 2023/8/4 14:31
 * @description
 */
class AssemblyLineTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int m = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        int[] line = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        AssemblyLine.solution(m, n, line);
    }
}