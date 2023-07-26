package j.q168;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void convertToTitle() {
        Solution solution = new Solution();
        assertEquals("A", solution.convertToTitle(1));
        assertEquals("AB", solution.convertToTitle(28));
        assertEquals("ZY", solution.convertToTitle(701));
        assertEquals("FXSHRXW", solution.convertToTitle(2147483647));
    }
}