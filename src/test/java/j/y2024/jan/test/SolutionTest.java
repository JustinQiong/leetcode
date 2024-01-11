package j.y2024.jan.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void palindrome() {
        Solution solution = new Solution();
        assertTrue(solution.palindrome(new String[] {"bcc", "ab", "cdef", "cab", "bc"}));
        assertFalse(solution.palindrome(new String[] {"bcc", "abd", "cdef", "cab", "bc"}));
        assertFalse(solution.palindrome(new String[] {"bcc", "ab", "cdef", "cabc", "bc"}));
    }
}