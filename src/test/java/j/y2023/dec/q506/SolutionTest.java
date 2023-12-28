package j.y2023.dec.q506;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findRelativeRanks() {
        Solution solution = new Solution();
        assertArrayEquals(new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"}, solution.findRelativeRanks(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new String[]{"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"}, solution.findRelativeRanks(new int[]{10, 3, 8, 9, 4}));
    }
}