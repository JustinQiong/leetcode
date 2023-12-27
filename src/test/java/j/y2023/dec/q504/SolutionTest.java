package j.y2023.dec.q504;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void convertTonBase7() {
        Solution solution = new Solution();
        assertEquals("202", solution.convertTonBase7(100));
        assertEquals("-10", solution.convertTonBase7(-7));
        assertEquals("0", solution.convertTonBase7(0));
        assertEquals("1", solution.convertTonBase7(1));
        assertEquals("-1", solution.convertTonBase7(-1));
        assertEquals("150666343", solution.convertTonBase7(10000000));
        assertEquals("-150666343", solution.convertTonBase7(-10000000));
    }
}