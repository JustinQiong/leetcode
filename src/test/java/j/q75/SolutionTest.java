package j.q75;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void gcdOfStrings() {
        Solution solution = new Solution();
        assertEquals("ABC", solution.gcdOfStrings("ABCABC", "ABC"));
        assertEquals("AB", solution.gcdOfStrings("ABABAB", "ABAB"));
        assertEquals("", solution.gcdOfStrings("LEET", "CODE"));
    }
}