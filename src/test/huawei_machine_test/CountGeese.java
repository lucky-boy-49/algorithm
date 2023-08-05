package test.huawei_machine_test;

/**
 * 数大雁
 */
public class CountGeese {

    public static void solution(String line) {
        int len = line.length(), ans = 0;
        int q = 0, u = 0, a = 0, c = 0, k = 0;
        for (int i = 0; i < len; i++) {
            char c1 = line.charAt(i);
            if (c1 == 'q') q++;
            if (c1 == 'u') u++;
            if (c1 == 'a') a++;
            if (c1 == 'c') c++;
            if (c1 == 'k') k++;
            if (!(q >= u && u >= a && a >= c && c >= k)) {
                System.out.println(-1);
                return;
            }
            ans = Math.max(ans, q - k);
        }
        System.out.println((q == u && u == a && a == c && c == k) ? ans : -1);
    }

}
