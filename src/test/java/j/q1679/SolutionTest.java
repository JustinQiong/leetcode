package j.q1679;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxOperations() {
        Solution solution = new Solution();
        assertEquals(2, solution.maxOperations(new int[]{1, 2, 3, 4}, 5));
        assertEquals(1, solution.maxOperations(new int[]{3, 1, 3, 4, 3}, 6));
        assertEquals(0, solution.maxOperations(new int[]{5}, 5));
        assertEquals(0, solution.maxOperations(new int[]{5}, 4));
    }
}