package j.q263;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isUgly() {
        Solution solution = new Solution();
        assertTrue(solution.isUgly(6));
        assertTrue(solution.isUgly(1));
        assertFalse(solution.isUgly(14));
    }
}