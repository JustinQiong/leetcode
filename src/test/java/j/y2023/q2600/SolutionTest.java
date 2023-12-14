package j.y2023.q2600;

import j.y2023.q2600.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void kItemsWithMaximumSumTest() {
        Solution solution = new Solution();
        assertEquals(2, solution.kItemsWithMaximumSum(3, 2, 0, 2));
        assertEquals(3, solution.kItemsWithMaximumSum(3, 2, 0, 4));
        assertEquals(5, solution.kItemsWithMaximumSum(6, 6, 6, 13));
    }
}