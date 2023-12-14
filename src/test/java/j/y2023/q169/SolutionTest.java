package j.y2023.q169;

import j.y2023.q169.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void majorityElement() {
        Solution solution = new Solution();
        assertEquals(3, solution.majorityElement(new int[]{3, 2, 3}));
        assertEquals(2, solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}