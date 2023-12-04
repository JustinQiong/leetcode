package j.com.q5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestPalindrome() {
        Solution solution = new Solution();
        String res = solution.longestPalindrome("babad");
        assertTrue(res.equals("bab") || res.equals("aba"));
        assertEquals("bb", solution.longestPalindrome("cbbd"));
        assertEquals("a", solution.longestPalindrome("a"));
        assertEquals("a", solution.longestPalindrome("abc"));
        assertEquals("bab", solution.longestPalindrome("babd"));
    }
}