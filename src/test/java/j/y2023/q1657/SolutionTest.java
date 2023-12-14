package j.y2023.q1657;

import j.y2023.q1657.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void closeStrings() {
        Solution solution = new Solution();
        assertTrue(solution.closeStrings("abc", "bca"));
        assertFalse(solution.closeStrings("a", "aa"));
        assertTrue(solution.closeStrings("cabbba", "abbccc"));
        assertFalse(solution.closeStrings("a", "c"));
        assertTrue(solution.closeStrings("a", "a"));
        assertTrue(solution.closeStrings("ac", "ca"));
    }
}