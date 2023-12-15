package j.y2023.q463;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void islandPerimeter() {
        Solution solution = new Solution();
        assertEquals(16, solution.islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}));
        assertEquals(4, solution.islandPerimeter(new int[][]{{1}}));
        assertEquals(4, solution.islandPerimeter(new int[][]{{1, 0}}));
    }
}