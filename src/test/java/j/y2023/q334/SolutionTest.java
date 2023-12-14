package j.y2023.q334;

import j.y2023.q334.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void increasingTriplet() {
        Solution solution = new Solution();
        assertTrue(solution.increasingTriplet(new int[]{1, 6, 3, 9, 5, 10}));
        assertFalse(solution.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
        assertTrue(solution.increasingTriplet(new int[]{4, 5, 1, 2, 3, 6}));
        assertFalse(solution.increasingTriplet(new int[]{1, 2}));
        assertTrue(solution.increasingTriplet(new int[]{1, 2, 3}));
    }
}