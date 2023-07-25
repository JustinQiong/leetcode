package j.q66;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void testPlusOne() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{1, 0, 0, 0}, solution.plusOne(new int[]{9, 9, 9}));
        assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 1}, solution.plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
    }
}