package q69;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mySqrtTest() {
        Solution solution = new Solution();
        assertEquals(2, solution.mySqrt(4));
        assertEquals(2, solution.mySqrt(8));
        assertEquals(3, solution.mySqrt(9));
        assertEquals(46339, solution.mySqrt(2147395599));
        assertEquals(0, solution.mySqrt(0));
        assertEquals(1, solution.mySqrt(1));
    }
}