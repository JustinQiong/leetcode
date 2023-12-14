package j.y2023.q405;

import j.y2023.q405.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void toHex() {
        Solution solution = new Solution();
        assertEquals("1a", solution.toHex(26));
        assertEquals("ffffffff", solution.toHex(-1));
        assertEquals("0", solution.toHex(0));
        assertEquals("1", solution.toHex(1));
    }
}