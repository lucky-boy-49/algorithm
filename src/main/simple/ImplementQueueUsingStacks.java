package main.simple;

import java.util.Stack;

/**
 * 232. Implement Queue using Stacks
 */
public class ImplementQueueUsingStacks {

    private final Stack<Integer> stacks1;

    private final Stack<Integer> stacks2;

    public ImplementQueueUsingStacks() {
        stacks1 = new Stack<>();
        stacks2 = new Stack<>();
    }

    public void push(int x) {
        stacks1.push(x);
    }

    public int pop() {
        if (stacks2.isEmpty()) {
            while (!stacks1.isEmpty()) {
                stacks2.push(stacks1.pop());
            }
        }
        return stacks2.pop();
    }

    public int peek() {
        if (stacks2.isEmpty()) {
            while (!stacks1.isEmpty()) {
                stacks2.push(stacks1.pop());
            }
        }
        return stacks2.peek();
    }

    public boolean empty() {
        return stacks1.isEmpty() && stacks2.isEmpty();
    }

}
