package j.q219;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void containsNearbyDuplicateMap() {
        Solution solution = new Solution();
        assertTrue(solution.containsNearbyDuplicateMap(new int[]{1, 2, 3, 1}, 3));
        assertTrue(solution.containsNearbyDuplicateMap(new int[]{1, 0, 1, 1}, 1));
        assertFalse(solution.containsNearbyDuplicateMap(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

    @Test
    void containsNearbyDuplicateWin() {
        Solution solution = new Solution();
        assertTrue(solution.containsNearbyDuplicateWin(new int[]{1, 2, 3, 1}, 3));
        assertTrue(solution.containsNearbyDuplicateWin(new int[]{1, 0, 1, 1}, 1));
        assertFalse(solution.containsNearbyDuplicateWin(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}