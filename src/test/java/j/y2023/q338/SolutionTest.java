package j.y2023.q338;

import j.y2023.q338.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countBits() {
        Solution solution = new Solution();
        assertArrayEquals(new int[] {0,1,1}, solution.countBits(2));
        assertArrayEquals(new int[]{0,1,1,2,1,2}, solution.countBits(5));
        assertArrayEquals(new int[]{0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4,1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,1,2,2,3,2,3,3,4,2,3,3,4,3,4,4,5,2,3,3,4,3,4,4,5
}, solution.countBits(55));
    }
}