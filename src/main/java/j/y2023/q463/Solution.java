package j.y2023.q463;

public class Solution {

    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int res = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] == 1) {
                    res += perimeter(grid, row, col);
                }
            }
        }

        return res;
    }

    private int perimeter(int[][] grid, int row, int col) {
        int res = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        if (row == 0 || grid[row - 1][col] == 0) {
            res++;
        }

        if (row == rows - 1 || grid[row + 1][col] == 0) {
            res++;
        }

        if (col == 0 || grid[row][col - 1] == 0) {
            res++;
        }

        if (col == cols - 1 || grid[row][col + 1] == 0) {
            res++;
        }
        return res;
    }

}
