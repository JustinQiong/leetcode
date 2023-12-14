package j.y2023.q2697;

import j.y2023.q2697.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void makeSmallestPalindrome() {
        Solution solution = new Solution();
        assertEquals("efcfe", solution.makeSmallestPalindrome("egcfe"));
        assertEquals("abba", solution.makeSmallestPalindrome("abcd"));
        assertEquals("neven", solution.makeSmallestPalindrome("seven"));
        assertEquals("e", solution.makeSmallestPalindrome("e"));
        assertEquals("aa", solution.makeSmallestPalindrome("ea"));
    }
}