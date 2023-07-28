package j.q392;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isSubsequence() {
        Solution solution = new Solution();
        assertTrue(solution.isSubsequence("abc", "ahbgdc"));
        assertFalse(solution.isSubsequence("axc", "ahbgdc"));
        assertTrue(solution.isSubsequence("", "ahbgdc"));
    }
}