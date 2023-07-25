package j.q20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionOneTest {

    @Test
    void testIsValid() {
        SolutionOne solution = new SolutionOne();
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("{}[]()"));
        assertTrue(solution.isValid("{[()]()}"));
        assertFalse(solution.isValid("{[(}"));
    }
}