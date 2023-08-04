package main.huawei_machine_test;

/**
 * 经典屏保
 */
public class ClassicScreenSaver {

    public static void solution(int x, int y, int t) {
        boolean xFlag = true, yFlag = true;
        for (int i = 1; i <= t; i++) {
            if (xFlag) x++;
            else x--;
            if (yFlag) y++;
            else y--;
            if ((x + 50 == 800 && y + 25 == 600) || (x == 0 && y == 0)) {
                xFlag = !xFlag;
                yFlag = !yFlag;
            } else if (x + 50 == 800 || x == 0) {
                xFlag = !xFlag;
            } else if (y + 25 == 600 || y == 0) {
                yFlag = !yFlag;
            }
        }
        System.out.println(x + " " + y);
    }

}
