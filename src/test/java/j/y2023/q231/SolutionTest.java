package j.y2023.q231;

import j.y2023.q231.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPowerOfTwo() {
        Solution solution = new Solution();
        assertTrue(solution.isPowerOfTwoCountBit(1));
        assertTrue(solution.isPowerOfTwoCountBit(2));
        assertTrue(solution.isPowerOfTwoCountBit(16));
        assertFalse(solution.isPowerOfTwoCountBit(3));
        assertFalse(solution.isPowerOfTwoCountBit(-2147483648));
    }
}