package j.y2023.q189;

import j.y2023.q189.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void rotate() {

        Solution solution = new Solution();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        solution.rotate(arr, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, arr);

        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        solution.rotate(arr2, 2);
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, arr2);

        int[] arr1 = new int[]{-1, -100, 3, 99};
        solution.rotate(arr1, 2);
        assertArrayEquals(new int[]{3, 99, -1, -100}, arr1);
    }
}