package j.q326;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPowerOfThree() {
        Solution solution = new Solution();
        assertTrue(solution.isPowerOfThree(27));
        assertFalse(solution.isPowerOfThree(0));
        assertFalse(solution.isPowerOfThree(28));
        assertFalse(solution.isPowerOfThree(-1));
    }
}