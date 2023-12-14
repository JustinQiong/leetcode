package j.y2023.q643;

import j.y2023.q643.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findMaxAverage() {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 12, -5, -6, 50, 3};
        assertEquals(12.75, solution.findMaxAverage(nums, 4));
    }

    @Test
    void findMaxAverageSingle() {
        Solution solution = new Solution();
        int[] nums = new int[]{5};
        assertEquals(5.00000, solution.findMaxAverage(nums, 1));
    }
}