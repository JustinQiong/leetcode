package q88;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficialSolutionTest {

    @Test
    void mergeTest() {
        OfficialSolution solution = new OfficialSolution();
        int[] nums = new int[]{1, 2, 3, 0, 0, 0};
        solution.merge(nums, 3, new int[]{2, 5, 6}, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums);

        int[] nums1 = new int[]{1};
        solution.merge(nums1, 1, new int[]{}, 0);
        assertArrayEquals(new int[] {1}, nums1);

        int[] nums2 = new int[]{0};
        solution.merge(nums2, 0, new int[]{1}, 1);
        assertArrayEquals(new int[] {1}, nums2);
    }
}