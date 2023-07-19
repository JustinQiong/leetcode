package q58;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testLengthOfLastWord() {
        Solution solution = new Solution();
        assertEquals(5, solution.lengthOfLastWord("hello world"));
        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));

    }
}