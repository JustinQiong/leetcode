package j.y2023.q155;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> min;

    public MinStack() {
        stack = new LinkedList<>();
        min = new LinkedList<>();
        min.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        stack.push(val);
        min.push(Math.min(min.peek(), val));
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
