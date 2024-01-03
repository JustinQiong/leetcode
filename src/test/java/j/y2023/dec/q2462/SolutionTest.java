package j.y2023.dec.q2462;

import j.y2024.jan.q2462.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void totalCost() {
        Solution solution = new Solution();
        assertEquals(11L, solution.totalCost(new int[]{17,12,10,2,7,2,11,20,8}, 3, 3));
        assertEquals(4L, solution.totalCost(new int[]{1,2,4,1}, 3, 3));
    }
}