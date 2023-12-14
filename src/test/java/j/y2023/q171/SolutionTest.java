package j.y2023.q171;

import j.y2023.q171.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void titleToNumber() {
        Solution solution = new Solution();
        assertEquals(1, solution.titleToNumber("A"));
        assertEquals(28, solution.titleToNumber("AB"));
        assertEquals(701, solution.titleToNumber("ZY"));
    }
}