package j.y2023.dec.q875;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minEatingSpeed() {
        Solution solution = new Solution();
        assertEquals(4, solution.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
        assertEquals(30, solution.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
        assertEquals(23, solution.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
        assertEquals(2, solution.minEatingSpeed(new int[]{312884470}, 312884469));
        assertEquals(1, solution.minEatingSpeed(new int[]{312884470}, 312884470));
        assertEquals(3, solution.minEatingSpeed(new int[]{805306368, 805306368, 805306368}, 1000000000));
    }
}