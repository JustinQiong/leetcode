package j.y2023.dec.q485;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findMaxConsecutiveOnes() {
        Solution solution = new Solution();
        assertEquals(3, solution.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
        assertEquals(2, solution.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
    }
}