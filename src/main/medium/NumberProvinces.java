package main.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 547. Number of Provinces
 */
public class NumberProvinces {

    public int findCircleNum(int[][] isConnected) {
        int cities = isConnected.length;
        boolean[] visited = new boolean[cities];
        int provinces = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < cities; i++) {
            if (!visited[i]) {
                queue.offer(i);
                while (!queue.isEmpty()) {
                    int j = queue.poll();
                    visited[j] = true;
                    for (int k = 0; k < cities; k++) {
                        if (isConnected[j][k] == 1 && !visited[k]) {
                            queue.offer(k);
                        }
                    }
                }
                provinces++;
            }
        }
        return provinces;

    }

    /**
     * 并查集
     * @param isConnected 城市数组
     * @return 省数量
     */
    public int findCircleNum2(int[][] isConnected) {
        int citys = isConnected.length, result = 0;
        int[] head = new int[citys];
        int[] level = new int[citys];
        Arrays.fill(level, 1);
        for (int k = 0; k < citys; k++) {
            head[k] = k;
        }
        for (int i = 0; i < citys; i++) {
            for (int j = i + 1; j < citys; j++) {
                if (isConnected[i][j] == 1) {
                    merge(i, j, head, level);
                }
            }
        }
        for (int i = 0; i < citys; i++) {
            if (head[i] == i) {
                result++;
            }
        }
        return result;
    }

    public void merge(int x, int y, int[] head, int[] level) {
        int i = find(x, head);
        int j = find(y, head);

        if (i == j) {
            return;
        }
        if (level[i] <= level[j]) {
            head[i] = j;
        } else {
            head[j] = j;
        }
        if (level[i] == level[j]) {
            level[i]++;
            level[j]++;
        }
    }

    private int find(int y, int[] head) {
        if (head[y] == y) {
            return y;
        }
        int a = y;
        while (head[a] != y) {
            a = head[a];
        }
        head[y] = a;
        return a;
    }

}
