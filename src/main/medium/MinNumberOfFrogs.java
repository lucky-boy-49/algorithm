package main.medium;

/**
 * 给你一个字符串croakOfFrogs，它表示不同青蛙发出的蛙鸣声（字符串"croak"）的组合。由于同一时间可以只青蛙呱呱作，所以 croakOfFrogs中会混合多个“croak” 。
 * 请您返回字符串模拟中所有蛙鸣所需不同青蛙的最少数量。
 * 彩虹发出蛙鸣“呱呱”，青蛙必须依序输出‘c’, ’r’, ’o’, ’a’, ’k’这5个字母。如果没有输出全部5个字母，那么它就不会发出声音。如果字符串不是croakOfFrogs由几个有效的“呱呱”字符混合而成，请返回-1。
 */
public class MinNumberOfFrogs {

    public int solution(String croakOfFrogs) {
        int n = croakOfFrogs.length(), ans = 0;
        int c = 0, r = 0, o = 0, a = 0, k = 0;
        for (int i = 0; i < n; i++) {
            if (croakOfFrogs.charAt(i) == 'c') c++;
            if (croakOfFrogs.charAt(i) == 'r') r++;
            if (croakOfFrogs.charAt(i) == 'o') o++;
            if (croakOfFrogs.charAt(i) == 'a') a++;
            if (croakOfFrogs.charAt(i) == 'k') k++;
            if (!(c >= r && r >= o && o >= a && a >= k)) return -1;
            ans = Math.max(ans, c - k);
        }
        return c == r && r == o && o == a && a == k ? ans : -1;

    }

}
