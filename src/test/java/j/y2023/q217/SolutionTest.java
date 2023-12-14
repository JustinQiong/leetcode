package j.y2023.q217;

import j.y2023.q217.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void containsDuplicateSet() {
        Solution solution = new Solution();
        assertTrue(solution.containsDuplicateSet(new int[]{1, 2, 3, 1}));
        assertFalse(solution.containsDuplicateSet(new int[]{1, 2, 3, 4}));
        assertTrue(solution.containsDuplicateSet(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    @Test
    void containsDuplicateSort() {
        Solution solution = new Solution();
        assertTrue(solution.containsDuplicateSort(new int[]{1, 2, 3, 1}));
        assertFalse(solution.containsDuplicateSort(new int[]{1, 2, 3, 4}));
        assertTrue(solution.containsDuplicateSort(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
        assertFalse(solution.containsDuplicateSort(new int[]{0}));
    }
}