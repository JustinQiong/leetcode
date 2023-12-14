package j.y2023.q202;

import j.y2023.q202.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isHappyHash() {
        Solution solution = new Solution();
        assertTrue(solution.isHappyHash(19));
        assertFalse(solution.isHappyHash(2));
    }

    @Test
    void isHappyTwoPoint() {
        Solution solution = new Solution();
        assertTrue(solution.isHappyTwoPoint(19));
        assertFalse(solution.isHappyTwoPoint(2));
    }

    @Test
    void isHappyMath() {
        Solution solution = new Solution();
        assertTrue(solution.isHappyMath(19));
        assertFalse(solution.isHappyMath(2));
    }
}