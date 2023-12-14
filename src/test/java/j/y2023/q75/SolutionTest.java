package j.y2023.q75;

import j.y2023.q75.Solution;
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