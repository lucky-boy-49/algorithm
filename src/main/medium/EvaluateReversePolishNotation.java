package main.medium;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 150. 逆波兰表达式求值
 */
public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") ||
                    token.equals("*") || token.equals("/")) {
                count(stack, token);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }

    private void count(Deque<Integer> stack, String token) {
        switch (token) {
            case "+" -> stack.push(stack.pop() + stack.pop());
            case "-" -> {
                Integer pop1 = stack.pop();
                Integer pop2 = stack.pop();
                stack.push(pop2 - pop1);
            }
            case "*" -> stack.push(stack.pop() * stack.pop());
            case "/" -> {
                Integer pop1 = stack.pop();
                Integer pop2 = stack.pop();
                stack.push(pop2 / pop1);
            }
        }
    }

}
