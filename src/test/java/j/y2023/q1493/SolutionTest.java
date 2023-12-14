package j.y2023.q1493;

import j.y2023.q1493.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestSubarray() {
        Solution solution = new Solution();

        assertEquals(3, solution.longestSubarray(new int[]{1, 1, 0, 1}));
        assertEquals(5, solution.longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}));
        assertEquals(2, solution.longestSubarray(new int[]{1, 1, 1}));
        assertEquals(0, solution.longestSubarray(new int[]{1}));
    }
}