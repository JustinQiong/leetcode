package j.y2023.dec.q557;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseWords() {
        Solution solution = new Solution();
        assertEquals("s'teL ekat edoCteeL tsetnoc", solution.reverseWords("Let's take LeetCode contest"));
        assertEquals("rM gniD", solution.reverseWords("Mr Ding"));
        assertEquals(" rM gniD ", solution.reverseWords(" Mr Ding "));
        assertEquals(" rM gniD", solution.reverseWords(" Mr Ding"));
    }
}