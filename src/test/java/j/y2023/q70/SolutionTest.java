package j.y2023.q70;

import j.y2023.q70.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void climbStairsTest() {
        Solution solution = new Solution();
        assertEquals(2, solution.climbStairs(2));
        assertEquals(3, solution.climbStairs(3));
        assertEquals(1, solution.climbStairs(1));
    }
}