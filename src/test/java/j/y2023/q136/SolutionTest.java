package j.y2023.q136;

import j.y2023.q136.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void singleNumber() {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 2, 1};
        assertEquals(1, solution.singleNumber(nums));

        int[] nums1 = new int[]{4, 1, 2, 1, 2};
        assertEquals(4, solution.singleNumber(nums1));
    }
}