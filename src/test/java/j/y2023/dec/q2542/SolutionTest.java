package j.y2023.dec.q2542;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxScore() {
        Solution solution = new Solution();
        assertEquals(12, solution.maxScore(new int[]{1, 3, 3, 2}, new int[]{2, 1, 3, 4}, 3));
        assertEquals(30, solution.maxScore(new int[]{4, 2, 3, 1, 1}, new int[]{7, 5, 10, 9, 6}, 1));
    }
}