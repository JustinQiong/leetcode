package j.y2023.q137;

import j.y2023.q137.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void singleNumber() {
        Solution solution = new Solution();
        assertEquals(3, solution.singleNumber(new int[]{2, 2, 3, 2}));
        assertEquals(99, solution.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99}));
    }
}