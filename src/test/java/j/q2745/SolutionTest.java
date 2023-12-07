package j.q2745;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestString() {
        Solution solution = new Solution();
        assertEquals(12, solution.longestString(2, 5, 1));
        assertEquals(14, solution.longestString(3, 2, 2));
        assertEquals(16, solution.longestString(2, 2, 4));
    }
}