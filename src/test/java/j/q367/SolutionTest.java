package j.q367;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sqrt() {
        Solution solution = new Solution();
        assertEquals(4d, solution.sqrt(16));
        assertEquals(2.23606797749979d, solution.sqrt(5));
    }
}