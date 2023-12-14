package j.y2023.q1004;

import j.y2023.q1004.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestOnes() {
        Solution solution = new Solution();
        assertEquals(6, solution.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
        assertEquals(10, solution.longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
        assertEquals(1, solution.longestOnes(new int[] {0}, 1));
        assertEquals(0, solution.longestOnes(new int[] {0}, 0));
        assertEquals(1, solution.longestOnes(new int[] {1}, 0));
    }
}