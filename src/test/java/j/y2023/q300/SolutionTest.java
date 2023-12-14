package j.y2023.q300;

import j.y2023.q300.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lengthOfLISDynamic() {
        Solution solution = new Solution();
        assertEquals(4, solution.lengthOfLISDynamic(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        assertEquals(4, solution.lengthOfLISDynamic(new int[]{0, 1, 0, 3, 2, 3}));
        assertEquals(1, solution.lengthOfLISDynamic(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }

    @Test
    void lengthOfLIS() {
        Solution solution = new Solution();
        assertEquals(4, solution.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        assertEquals(4, solution.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
        assertEquals(1, solution.lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7}));
        assertEquals(3, solution.lengthOfLIS(new int[]{1, 2, -10, -8, -7}));
    }
}