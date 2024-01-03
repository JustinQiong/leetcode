package j.y2024.jan.q901;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 901. Online Stock Span
 * Monotone stack solution:
 * Use a monotone stack to store the [index,price] pairs.
 * If added price is greater or equal than the price of the top element
 * in the stack, pop the elements out. Push the current pair into stack.
 * Return the gap between index of the current top element and added element.
 */
public class StockSpanner {
    private Deque<int[]> stack;
    private int idx;

    public StockSpanner() {
        stack = new ArrayDeque<>();
        stack.push(new int[]{-1, Integer.MAX_VALUE});
        idx = -1;
    }

    public int next(int price) {
        idx++;
        while(price >= stack.peek()[1]) {
            stack.pop();
        }

        int res = idx - stack.peek()[0];
        stack.push(new int[]{idx, price});
        return res;
    }
}
