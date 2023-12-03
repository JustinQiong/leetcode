package j.q27;

import j.q27.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeElement() {
        Solution solution = new Solution();
        int[] arr = new int[]{3, 2, 2, 3};
        assertEquals(2, solution.removeElement(arr, 3));
        assertArrayEquals(new int[] {2, 2, 2, 3}, arr);

        int[] arr2 = new int[] {0,1,2,2,3,0,4,2};
        assertEquals(5, solution.removeElement(arr2, 2));
        assertArrayEquals(new int[]{0,1,3,0,4, 0, 4, 2}, arr2);

    }
}