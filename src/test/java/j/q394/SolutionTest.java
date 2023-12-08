package j.q394;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void decodeString() {
        Solution solution = new Solution();
        assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"));
        assertEquals("accaccacc", solution.decodeString("3[a2[c]]"));
        assertEquals("abcabccdcdcdef", solution.decodeString("2[abc]3[cd]ef"));
    }
}