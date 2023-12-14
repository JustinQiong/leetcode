package j.y2023.q461;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void hammingDistance() {
        Solution solution = new Solution();
        assertEquals(2, solution.hammingDistance(1, 4));
        assertEquals(1, solution.hammingDistance(3, 1));
    }
}