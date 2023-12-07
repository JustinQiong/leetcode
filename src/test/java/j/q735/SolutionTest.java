package j.q735;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void asteroidCollision() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{5, 10}, solution.asteroidCollision(new int[]{5, 10, -5}));
        assertArrayEquals(new int[]{}, solution.asteroidCollision(new int[]{8, -8}));
        assertArrayEquals(new int[]{10}, solution.asteroidCollision(new int[]{10, 2, -5}));
        assertArrayEquals(new int[]{-2, -1, 1, 2}, solution.asteroidCollision(new int[]{-2, -1, 1, 2}));
    }
}