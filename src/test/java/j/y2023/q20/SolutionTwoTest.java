package j.y2023.q20;

import j.y2023.q20.SolutionTwo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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