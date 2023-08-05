package main.huawei_machine_test;

import java.util.PriorityQueue;

/**
 * 支持优先级的队列
 */
public class PriorityQueue2 {

    public static void solution(String line) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.priority != b.priority) {
                return b.priority - a.priority;
            }
            return a.order - b.order;
        });
        String[] pairs = line.split("\\),\\(");
        int[][] array = new int[pairs.length][];
        for (int i = 0; i < pairs.length; i++) {
            String pair = pairs[i].replaceAll("[()]", "");
            String[] numbers = pair.split(",");
            array[i] = new int[numbers.length];

            for (int j = 0; j < numbers.length; j++) {
                array[i][j] = Integer.parseInt(numbers[j]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            int[] ints = array[i];
            int priority = ints[1];
            String content = String.valueOf(ints[0]);
            pq.offer(new Pair(priority, content, i));
        }
        StringBuilder res = new StringBuilder();
        while (!pq.isEmpty()) {
            res.append(pq.poll().content).append(",");
        }
        System.out.println(res.substring(0, res.length() - 1));
    }

}

class Pair {
    int priority; // 优先级
    String content; // 数据
    int order; // 加入队列的顺序

    public Pair(int priority, String content, int order) {
        this.priority = priority;
        this.content = content;
        this.order = order;
    }

}