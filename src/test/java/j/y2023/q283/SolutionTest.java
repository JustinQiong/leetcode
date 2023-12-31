package j.y2023.q283;

import j.y2023.q283.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void moveZeroesTest() {
        Solution solution = new Solution();
        int[] nums = new int[]{0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);

        int[] nums1 = new int[]{0};
        solution.moveZeroes(nums1);
        assertArrayEquals(new int[]{0}, nums1);

        int[] nums2 = new int[]{1};
        solution.moveZeroes(nums2);
        assertArrayEquals(new int[]{1}, nums2);

        int[] nums3 = new int[]{1, 0};
        solution.moveZeroes(nums3);
        assertArrayEquals(new int[]{1, 0}, nums3);

        int[] nums4 = new int[]{1, 0, 1};
        solution.moveZeroes(nums4);
        assertArrayEquals(new int[]{1, 1, 0}, nums4);
    }
}