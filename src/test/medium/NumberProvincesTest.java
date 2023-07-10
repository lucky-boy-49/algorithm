package test.medium;

import main.medium.NumberProvinces;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberProvincesTest {

    @Test
    void findCircleNum() {
        NumberProvinces numberProvinces = new NumberProvinces();
        int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};

        int circleNum = numberProvinces.findCircleNum2(isConnected);

        System.out.println(circleNum);

    }
}