package j.y2023.dec.q739;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 739. Daily Temperatures
 * Monotone stack solution:
 * Iterate through temperatures array.
 * If current element is greater than the top of stack, stack.pop()
 * and update the days to wait by current index i - stack.pop().
 * Push each index into the stack after the comparison and pop operation.
 */
public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new LinkedList<>();
        int n = temperatures.length;
        int[] res = new int[n];
        for (int i=0; i<n; i++) {
            int temperature = temperatures[i];
            while (!stack.isEmpty() && temperature > temperatures[stack.peek()]) {
                int pre = stack.pop();
                res[pre] = i-pre;
            }
            stack.push(i);
        }

        return res;
    }
}
