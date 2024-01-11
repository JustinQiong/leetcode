package j.y2024.jan.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecurSolutionTest {

    @Test
    void solution() {
        RecurSolution solution = new RecurSolution();
        assertTrue(solution.solution(new String[] {"bcc", "ab", "cdef", "cab", "bc"}));
        assertFalse(solution.solution(new String[] {"bcc", "ab", "cdef", "cabc", "bc"}));
    }
}