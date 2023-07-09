package main.simple;

/**
 * 860. Lemonade Change
 */
public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {
        int[] curtChange = new int[3];

        for (int bill : bills) {
            if (bill == 5) {
                curtChange[0]++;
            } else if (bill == 10) {
                if (curtChange[0] <= 0) {
                    return false;
                }
                curtChange[0]--;
                curtChange[1]++;
            } else if (bill == 20) {

                if (curtChange[0] >= 1 && curtChange[1] >= 1) {
                    curtChange[0] -= 1;
                    curtChange[1] -= 1;
                    curtChange[2] += 1;
                } else if (curtChange[0] >= 3) {
                    curtChange[0] -= 3;
                    curtChange[2] += 1;
                } else {
                    return false;
                }

            }


        }

        return true;

    }

}
