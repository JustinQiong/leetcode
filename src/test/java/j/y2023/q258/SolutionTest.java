package j.y2023.q258;

import j.y2023.q258.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addDigits() {
        Solution solution = new Solution();
        assertEquals(2, solution.addDigits(38));
        assertEquals(0, solution.addDigits(0));
        assertEquals(9, solution.addDigits(999));
    }
}