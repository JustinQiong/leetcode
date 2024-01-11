package j.y2024.jan.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OtherSolutionTest {

    @Test
    void makePalindrome() {
        OtherSolution solution = new OtherSolution();
        assertFalse(solution.makePalindrome(new String[] {"bcc", "ab", "cdef", "cabc", "bc"}));
    }
}