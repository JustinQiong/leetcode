package j.y2023.q647;

import j.y2023.q647.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countSubstrings() {
        Solution solution = new Solution();
        assertEquals(3, solution.countSubstrings("abc"));
        assertEquals(6, solution.countSubstrings("aaa"));
        assertEquals(1, solution.countSubstrings("a"));
    }
}