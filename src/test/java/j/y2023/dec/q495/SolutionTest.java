package j.y2023.dec.q495;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findPoisonedDuration() {
        Solution solution = new Solution();
        assertEquals(4, solution.findPoisonedDuration(new int[]{1, 4}, 2));
        assertEquals(3, solution.findPoisonedDuration(new int[]{1, 2}, 2));
        assertEquals(2, solution.findPoisonedDuration(new int[]{1}, 2));
    }
}