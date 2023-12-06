package j.q2390;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeStars() {
        Solution solution = new Solution();
        assertEquals("lecoe", solution.removeStars("leet**cod*e"));
        assertEquals("", solution.removeStars("erase*****"));
        assertEquals("a", solution.removeStars("abb*cdfg*****x*"));
    }

    @Test
    void removeStarsTwoPointers() {
        Solution solution = new Solution();
        assertEquals("lecoe", solution.removeStarsTwoPointers("leet**cod*e"));
        assertEquals("", solution.removeStarsTwoPointers("erase*****"));
        assertEquals("a", solution.removeStarsTwoPointers("abb*cdfg*****x*"));
    }
}