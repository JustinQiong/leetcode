package j.y2023.dec.q2400;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void successfulPairs() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{4, 0, 3}, solution.successfulPairs(new int[]{5, 1, 3}, new int[]{1, 2, 3, 4, 5}, 7));
        assertArrayEquals(new int[]{2, 0, 2}, solution.successfulPairs(new int[]{3, 1, 2}, new int[]{8, 5, 8}, 16));
    }
}