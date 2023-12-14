package j.y2023.q190;

import j.y2023.q190.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseBits() {
        Solution solution = new Solution();
        assertEquals(964176192, solution.reverseBits(43261596));
    }
}