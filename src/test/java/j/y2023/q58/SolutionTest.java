package j.y2023.q58;

import j.y2023.q58.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testLengthOfLastWord() {
        Solution solution = new Solution();
        assertEquals(5, solution.lengthOfLastWord("hello world"));
        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));
        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));

    }
}