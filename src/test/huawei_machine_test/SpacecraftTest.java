package test.huawei_machine_test;

import main.huawei_machine_test.Spacecraft;
import org.junit.jupiter.api.Test;

class SpacecraftTest {

    @Test
    void spacecraft() {
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.spacecraft("10,9,8,7,6,1,4,3,2,1");
    }
}