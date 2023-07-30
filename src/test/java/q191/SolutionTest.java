package q191;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void hammingWeight() {
        Solution solution = new Solution();
        assertEquals(3, solution.hammingWeight(11));
        assertEquals(0, solution.hammingWeight(0));
        assertEquals(1, solution.hammingWeight(1));
        assertEquals(2, solution.hammingWeight(3));
    }

    @Test
    void optimizedHammingWeight() {
        Solution solution = new Solution();
        assertEquals(3, solution.optimizedHammingWeight(11));
        assertEquals(0, solution.optimizedHammingWeight(0));
        assertEquals(1, solution.optimizedHammingWeight(1));
        assertEquals(2, solution.optimizedHammingWeight(3));
    }
}