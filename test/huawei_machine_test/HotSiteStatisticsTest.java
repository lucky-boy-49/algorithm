package huawei_machine_test;

import main.huawei_machine_test.HotSiteStatistics;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author HJ
 * @date 2023/8/4 15:17
 * @description
 */
class HotSiteStatisticsTest {

    @Test
    void solution() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            HotSiteStatistics.solution(scanner.nextLine());
        }
    }
}