package main.medium;

import java.util.*;

/**
 * @author HJ
 * @date 2023/5/23 16:32
 * @description 1376. 通知所有员工所需的时间
 */
public class TimeNeededToInformEmployees {

    public int numOfMinutes(int n, int headId, int[] manager, int[] informTime) {
        // 使用 HashMap 来构建图
        Map<Integer, List<Integer>> g = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            g.putIfAbsent(manager[i], new ArrayList<>());
            g.get(manager[i]).add(i);
        }
        // 1.深度算法
        // 从根节点开始进行 DFS 并返回总时间
        // return dfs(headId, informTime, g);

        // 2.广度算法
        Queue<int[]> deque = new ArrayDeque<>();
        // 将起点放入队列
        deque.offer(new int[]{headId, 0});
        int result = 0;
        while (!deque.isEmpty()) {
            int[] arr = deque.poll();
            int tmpId = arr[0], val = arr[1];
            // 如果当前节点没有下属，说明到达了叶子节点，更新结果
            if (!g.containsKey(tmpId)) {
                result = Math.max(result, val);
            } else {
                // 将当前节点的下属加入队列，更新时间
                for (int ne : g.get(tmpId)) {
                    deque.offer(new int[]{ne, val + informTime[tmpId]});
                }
            }
        }
        return result;
    }

    public int dfs(int cur, int[] informTime, Map<Integer, List<Integer>> g) {
        int res = 0;
        // 遍历当前节点的邻居节点
        for (Integer neighbor : g.getOrDefault(cur, new ArrayList<>())) {
            res = Math.max(res, dfs(neighbor, informTime, g));
        }
        // 返回当前节点被通知需要的时间以及所有邻居节点被通知所需的最大时间
        return informTime[cur] + res;
    }

    public static void main(String[] args) {
        int n = 6, headId = 2;
        int[] manager = {2, 2, -1, 2, 2, 2};
        int[] informTime = {0, 0, 1, 0, 0, 0};
        TimeNeededToInformEmployees test = new TimeNeededToInformEmployees();
        System.out.println(test.numOfMinutes(n, headId, manager, informTime));
    }

}
