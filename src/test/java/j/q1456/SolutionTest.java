package j.q1456;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxVowels() {
        Solution solution = new Solution();
        assertEquals(3, solution.maxVowels("abciiidef", 3));
        assertEquals(2, solution.maxVowels("aeiou", 2));
        assertEquals(2, solution.maxVowels("leetcode", 3));
        assertEquals(1, solution.maxVowels("a", 1));
        assertEquals(0, solution.maxVowels("k", 1));
    }


}