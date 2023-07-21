package q88;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mergeTest() {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 0, 0, 0};
        solution.merge(nums, 3, new int[]{2, 5, 6}, 3);
        assertArrayEquals(nums, new int[]{1, 2, 2, 3, 5, 6});
    }
}