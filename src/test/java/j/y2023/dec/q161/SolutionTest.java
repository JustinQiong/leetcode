package j.y2023.dec.q161;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findPeakElement() {
        Solution solution = new Solution();
        assertEquals(2, solution.findPeakElement(new int[]{1, 2, 3, 1}));
        assertEquals(3, solution.findPeakElement(new int[]{1, 2, 3, 4}));
        assertEquals(0, solution.findPeakElement(new int[]{4, 3, 2, 1}));
        assertEquals(0, solution.findPeakElement(new int[]{1}));
        assertEquals(5, solution.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }
}