package main.simple;

/**
 * @author HJ
 * @date 2023/9/22 23:04
 * @description 591. 将钱分给最多的儿童
 */
public class DistributeMoneyMaximumChildren {

    public int distMoney(int money, int children) {
        if (money < children) {
            return -1;
        }
        money -= children;
        int cnt = Math.min(money / 7, children);
        money -= cnt * 7;
        children -= cnt;
        if ((children == 0 && money > 0) || (children == 1 && money == 3)) {
            cnt--;
        }
        return cnt;
    }

}
