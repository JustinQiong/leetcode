package j.q735;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = asteroids.length;
        for (int i = 0; i < n; i++) {
            int as = asteroids[i];
            boolean alive = true;
            while (alive && !stack.isEmpty() && as < 0 && stack.peek() > 0) {
                alive = stack.peek() < -as;
                if (stack.peek() <= -as) {
                    stack.pop();
                }
            }
            if (alive) {
                stack.push(as);
            }
        }

        int size = stack.size();
        int[] ans = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
