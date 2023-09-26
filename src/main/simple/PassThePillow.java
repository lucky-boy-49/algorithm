package main.simple;

/**
 * @author HJ
 * @date 2023/9/26 20:19
 * @description 2582. 递枕头
 */
public class PassThePillow {

    public int passThePillow(int n, int time) {
        time %= (n - 1) * 2;
        return time < n ? time + 1 : n * 2 - time - 1;
    }

}
