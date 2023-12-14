package j.y2023.q746;

import j.y2023.q746.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minCostClimbingStairs() {
        Solution solution = new Solution();
        assertEquals(15, solution.minCostClimbingStairs(new int[]{10, 15, 20}));
        assertEquals(6, solution.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
        assertEquals(0, solution.minCostClimbingStairs(new int[]{0, 0, 1, 0}));
    }
}