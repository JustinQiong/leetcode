package j.q232;

import java.util.Stack;

public class MyQueue {

    private final Stack<Integer> in;
    private final Stack<Integer> out;

    public MyQueue() {
        this.in = new Stack<>();
        this.out = new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (out.empty()) {
            in2out();
        }
        return out.pop();
    }

    public int peek() {
        if (out.empty()) {
            in2out();
        }
        return out.peek();
    }

    public boolean empty() {
        return in.empty() && out.empty();
    }

    private void in2out() {
        while (!in.empty()) {
            out.push(in.pop());
        }
    }

}
