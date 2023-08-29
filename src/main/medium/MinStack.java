package main.medium;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 155. 最小栈sa
 */
public class MinStack {

    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public MinStack() {
        xStack = new LinkedList<>();
        minStack = new LinkedList<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        if (!minStack.isEmpty()) {
            minStack.push(Math.min(minStack.peek(), x));
        }
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        if (!xStack.isEmpty()) {
            return xStack.peek();
        }
        return -1;
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        return -1;
    }

}
