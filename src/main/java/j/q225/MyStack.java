package j.q225;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private final Queue<Integer> queue;

    public MyStack() {
        this.queue = new LinkedList<>();
    }

    public void push(int x) {
        int n = queue.size();
        queue.offer(x);
        for (int i = 0; i <n; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
