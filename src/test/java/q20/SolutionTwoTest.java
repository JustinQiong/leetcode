package q20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTwoTest {

    @Test
    void testIsValid() {
        SolutionTwo solution = new SolutionTwo();
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("{}[]()"));
        assertTrue(solution.isValid("{[()]()}"));
        assertFalse(solution.isValid("{[(}"));
    }

}