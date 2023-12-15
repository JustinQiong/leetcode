package j.y2023.q1318;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minFlips() {
        Solution solution = new Solution();
        assertEquals(3, solution.minFlips(2, 6, 5));
        assertEquals(1, solution.minFlips(4, 2, 7));
        assertEquals(0, solution.minFlips(1, 2, 3));
        assertEquals(2, solution.minFlips(1000000000, 999999998, 999999999));
    }
}