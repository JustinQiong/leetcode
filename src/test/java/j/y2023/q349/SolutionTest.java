package j.y2023.q349;

import j.y2023.q349.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void intersection() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{2}, solution.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{9, 4}, solution.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
        assertArrayEquals(new int[]{}, solution.intersection(new int[]{1}, new int[]{2}));
        assertArrayEquals(new int[]{1}, solution.intersection(new int[]{1}, new int[]{1}));
        assertArrayEquals(new int[]{1000}, solution.intersection(new int[]{1000}, new int[]{1000}));
    }
}