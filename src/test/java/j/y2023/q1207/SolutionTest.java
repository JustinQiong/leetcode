package j.y2023.q1207;

import j.y2023.q1207.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void uniqueOccurrences() {
        Solution solution = new Solution();
        assertTrue(solution.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        assertFalse(solution.uniqueOccurrences(new int[]{1, 2}));
        assertTrue(solution.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
    }
}