package j.q455;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findContentChildren() {
        Solution solution = new Solution();
        assertEquals(1, solution.findContentChildren(new int[]{1,2,3}, new int[]{1, 1}));
        assertEquals(2, solution.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
        assertEquals(0, solution.findContentChildren(new int[]{1, 2}, new int[]{}));
    }
}