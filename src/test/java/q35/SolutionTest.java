package q35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testSearchInsert() {
        Solution solution = new Solution();
        assertEquals(2, solution.searchInsert(new int[] {1, 3, 4, 11, 102}, 4));
        assertEquals(4, solution.searchInsert(new int[] {1, 3, 4, 11, 102}, 14));
        assertEquals(4, solution.searchInsert(new int[] {1, 3, 4, 11, 102, 122}, 102));
        assertEquals(5, solution.searchInsert(new int[] {1, 3, 4, 11, 102, 122}, 103));
    }
}