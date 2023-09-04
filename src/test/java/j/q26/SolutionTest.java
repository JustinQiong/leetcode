package j.q26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeDuplicates() {
        Solution solution = new Solution();
        int[] arr = new int[]{1, 1, 2};
        assertEquals(2, solution.removeDuplicates(arr));
        assertArrayEquals(new int[]{1, 2, 2}, arr);

        int[] arr2 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, solution.removeDuplicates(arr2));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 2, 2, 3, 3, 4}, arr2);
    }
}