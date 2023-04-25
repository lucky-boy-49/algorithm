package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author HJ
 * @date 2023/4/25 20:01
 * @description 1409. 查询带键的排列
 */
public class QueriesOnPermutationKey {
    public int[] processQueries(int[] queries, int m) {
        int[] p = IntStream.rangeClosed(1, m).toArray();
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int finalI = i;
            int index = IntStream.range(0, p.length).filter(j -> queries[finalI] == p[j]).findFirst().orElse(-1);
            result[i] = index;
            int temp = p.length-1;
            for (int j = p.length - 1; j >= 0; j--) {
                if ( j != index) {
                    p[temp--] = p[j];
                }
            }
            p[temp] = queries[i];
        }
        return result;
    }

    public int[] processQueries2(int[] queries, int m) {
        List<Integer> p = new ArrayList<>();
        for (int i = 1; i <= m; ++i) {
            p.add(i);
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; ++i) {
            int query = queries[i];
            int pos = -1;
            for (int j = 0; j < m; ++j) {
                if (p.get(j) == query) {
                    pos = j;
                    break;
                }
            }
            ans[i] = pos;
            p.remove(pos);
            p.add(0, query);
        }
        return ans;
    }

    public int[] processQueries3(int[] queries, int m) {
        int n = queries.length;
        BIT bit = new BIT(m + n);

        int[] pos = new int[m + 1];
        for (int i = 1; i <= m; ++i) {
            pos[i] = n + i;
            bit.update(n + i, 1);
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; ++i) {
            int cur = pos[queries[i]];
            bit.update(cur, -1);
            ans[i] = bit.query(cur);
            cur = n - i;
            pos[queries[i]] = cur;
            bit.update(cur, 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        QueriesOnPermutationKey queriesKey = new QueriesOnPermutationKey();
        int[] queries = {3, 1, 2, 1};
        int m = 5;
        Arrays.stream(queriesKey.processQueries3(queries, m)).forEach(System.out::println);
    }

}

class BIT {
    int[] a;
    int n;

    public BIT(int n) {
        this.n = n;
        this.a = new int[n + 1];
    }

    public int query(int x) {
        int ret = 0;
        while (x != 0) {
            ret += a[x];
            x -= lowbit(x);
        }
        return ret;
    }

    public int update(int x, int dt) {
        while (x <= n) {
            a[x] += dt;
            x += lowbit(x);
        }
        return x;
    }

    public static int lowbit(int x) {
        return x & (-x);
    }
}
