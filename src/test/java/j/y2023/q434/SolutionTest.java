package j.y2023.q434;

import j.y2023.q434.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countSegments() {
        Solution solution = new Solution();
        assertEquals(5, solution.countSegments("Hello, my name is John"));
        assertEquals(1, solution.countSegments("Hello"));
        assertEquals(0, solution.countSegments("  "));
        assertEquals(0, solution.countSegments(""));
    }
}