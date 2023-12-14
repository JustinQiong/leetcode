package j.y2023.q459;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void repeatedSubstringPattern() {
        Solution solution = new Solution();
        assertTrue(solution.repeatedSubstringPattern("abab"));
        assertFalse(solution.repeatedSubstringPattern("aba"));
        assertTrue(solution.repeatedSubstringPattern("abcabcabcabc"));
        assertFalse(solution.repeatedSubstringPattern("a"));
    }
}