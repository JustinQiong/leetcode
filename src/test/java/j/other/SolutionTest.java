package j.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void eliminateABCD() {
        Solution solution = new Solution();
        assertEquals("", solution.eliminateABCD("abcd"));
        assertEquals("a", solution.eliminateABCD("aabdc"));
        assertEquals("ace", solution.eliminateABCD("aabccde"));
        assertEquals("a", solution.eliminateABCD("aacdb"));
    }
}