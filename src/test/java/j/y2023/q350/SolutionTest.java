package j.y2023.q350;

import j.y2023.q350.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void intersect() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{2, 2}, solution.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{2}, solution.intersect(new int[]{1, 2, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{9, 4}, solution.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
        assertArrayEquals(new int[]{9, 4, 9}, solution.intersect(new int[]{4, 9, 9, 5}, new int[]{9, 4, 9, 8, 4}));
        assertArrayEquals(new int[]{}, solution.intersect(new int[]{1}, new int[]{2}));
        assertArrayEquals(new int[]{1}, solution.intersect(new int[]{1}, new int[]{1}));
        assertArrayEquals(new int[]{1000}, solution.intersect(new int[]{1000}, new int[]{1000}));
    }
}