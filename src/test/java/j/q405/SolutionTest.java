package j.q405;

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