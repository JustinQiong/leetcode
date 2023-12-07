package j.q1137;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void tribonacci() {
        Solution solution = new Solution();
        assertEquals(0, solution.tribonacci(0));
        assertEquals(1, solution.tribonacci(1));
        assertEquals(1, solution.tribonacci(2));
        assertEquals(2, solution.tribonacci(3));
        assertEquals(4, solution.tribonacci(4));
        assertEquals(1389537, solution.tribonacci(25));
    }
}