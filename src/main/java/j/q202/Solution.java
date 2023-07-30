package j.q202;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    private final static Set<Integer> cycleMembers = new HashSet<>(List.of(4, 16, 37, 58, 89, 145, 42, 20));

    /**
     * hash表解法
     */
    public boolean isHappyHash(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = next(n);
        }
        return n == 1;
    }

    /**
     * 数学解法
     */
    public boolean isHappyMath(int n) {
        while (n != 1 && !cycleMembers.contains(n)) {
            n = next(n);
        }

        return n == 1;
    }

    /**
     * 双指针解法
     */
    public boolean isHappyTwoPoint(int n) {
        int slow = n;
        int fast = next(n);
        while (fast != 1 && slow != fast) {
            slow = next(slow);
            fast = next(next(fast));
        }
        return fast == 1;
    }

    private int next(int n) {
        int sum = 0;
        while (n > 0) {
            int x = n % 10;
            sum += x * x;
            n /= 10;
        }
        return sum;
    }
}
