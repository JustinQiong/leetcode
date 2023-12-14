package j.y2023.q448;

import j.util.ArrayUtils;
import j.y2023.q448.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findDisappearedNumbers() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{5, 6}, ArrayUtils.toArray(solution.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1})));
        assertArrayEquals(new int[]{2}, ArrayUtils.toArray(solution.findDisappearedNumbers(new int[]{1, 1})));
    }
}