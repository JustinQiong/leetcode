package j.q205;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isIsomorphicHash() {
        Solution solution = new Solution();
        assertTrue(solution.isIsomorphicHash("egg", "add"));
        assertFalse(solution.isIsomorphicHash("foo", "bar"));
        assertTrue(solution.isIsomorphicHash("paper", "title"));
    }

    @Test
    void isIsomorphicArray() {
        Solution solution = new Solution();
        assertTrue(solution.isIsomorphicArray("egg", "add"));
        assertFalse(solution.isIsomorphicArray("foo", "bar"));
        assertTrue(solution.isIsomorphicArray("paper", "title"));
    }
}