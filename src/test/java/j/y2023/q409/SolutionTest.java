package j.y2023.q409;

import j.y2023.q409.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestPalindrome() {
        Solution solution = new Solution();
        assertEquals(7, solution.longestPalindrome("abccccdd"));
        assertEquals(1, solution.longestPalindrome("a"));
        assertEquals(5, solution.longestPalindrome("abccCcdd"));
        assertEquals(55, solution.longestPalindrome("zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez"));
    }
}