package j.y2024.jan.q1926;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void nearestExit() {
        Solution solution = new Solution();
        assertEquals(7, solution.nearestExit(
                new char[][] {{'+','.','+','+','+','+','+'},{'+','.','+','.','.','.','+'},{'+','.','+','.','+','.','+'},{'+','.','.','.','.','.','+'},{'+','+','+','+','.','+','.'}},
                new int[]{0, 1}));
    }
}