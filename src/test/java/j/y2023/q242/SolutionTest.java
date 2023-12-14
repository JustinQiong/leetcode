package j.y2023.q242;

import j.y2023.q242.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isAnagram() {
        Solution solution = new Solution();
        assertTrue(solution.isAnagram("anagram", "nagaram"));
        assertFalse(solution.isAnagram("rat", "cat"));
        assertFalse(solution.isAnagram("ab", "a"));
    }
}