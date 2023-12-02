package j.q345;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseVowels() {
        Solution solution = new Solution();
        assertEquals("holle", solution.reverseVowels("hello"));
    }

    @Test
    void reverseVowelsWithBlank() {
        Solution solution = new Solution();
        assertEquals("race car", solution.reverseVowels("race car"));
    }

    @Test
    void reverseVowelsTwo() {
        Solution solution = new Solution();
        assertEquals("leotcede", solution.reverseVowels("leetcode"));
    }

    @Test
    void reverseVowelsWithOneVowels() {
        Solution solution = new Solution();
        assertEquals("string", solution.reverseVowels("string"));
    }

    @Test
    void reverseVowelsWithNoVowels() {
        Solution solution = new Solution();
        assertEquals("strng", solution.reverseVowels("strng"));
    }
}