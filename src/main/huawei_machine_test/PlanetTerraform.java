package main.huawei_machine_test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 宜居星球改造计划
 */
public class PlanetTerraform {

    public static void solution(String[][] grid) {
        int row = grid.length;
        int column = grid[0].length;

        int[][] d = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                if (grid[i][j].equals("YES")) {
                    queue.offer(new int[]{
                            i, j
                    });
                }
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                int[] current = queue.poll();
                if (current != null) {
                    int x = current[0];
                    int y = current[1];
                    for (int[] dir : d) {
                        int newX = x + dir[0];
                        int newY = y + dir[1];
                        if (newX >= 0 && newX < row && newY >= 0 && newY < column && grid[newX][newY].equals("NO")) {
                            grid[newX][newY] = "YES";
                            queue.offer(new int[]{newX, newY});
                        }
                    }
                }
            }
            count++;
        }
        for (String[] strings : grid) {
            for (int j = 0; j < column; j++) {
                if (strings[j].equals("NO")) {
                    System.out.println(-1);
                }
            }
        }
        System.out.println(count - 1);
    }

}
