package j.y2023.q292;

import j.y2023.q292.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canWinNim() {
        Solution solution = new Solution();
        assertFalse(solution.canWinNim(4));
        assertTrue(solution.canWinNim(2));
        assertTrue(solution.canWinNim(1));
        assertTrue(solution.canWinNim(5));
    }
}