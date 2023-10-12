package j.q74;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void searchMatrix() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        Solution solution = new Solution();
        solution.searchMatrix(matrix, 3);
    }
}