package j.q414;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void thirdMax() {
        Solution solution = new Solution();
        assertEquals(1, solution.thirdMax(new int[]{3, 2, 1}));
        assertEquals(2, solution.thirdMax(new int[]{1, 2}));
        assertEquals(1, solution.thirdMax(new int[]{2, 2, 3, 1}));
        assertEquals(2, solution.thirdMax(new int[]{2, 2, 3, 1, 12, 0}));
        assertEquals(-2147483648, solution.thirdMax(new int[]{1, 2, -2147483648}));
    }
}