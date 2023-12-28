package j.y2023.q215;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortSolutionTest {

    @Test
    void findKthLargest() {
        SortSolution solution = new SortSolution();
        assertEquals(5, solution.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
        assertEquals(4, solution.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }
}