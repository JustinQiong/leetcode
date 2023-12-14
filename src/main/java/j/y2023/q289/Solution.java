package j.y2023.q289;

public class Solution {
    public void gameOfLife(int[][] board) {
        int[] neighbours = new int[]{0, 1, -1};
        int rows = board.length;
        int cols = board[0].length;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int lives = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int nRow = row + neighbours[i];
                        int nCol = col + neighbours[j];
                        if (!(i == 0 && j == 0)) {
                            if ((nRow >= 0 && nRow < rows) && (nCol >= 0 && nCol < cols) && Math.abs(board[nRow][nCol]) == 1) {
                                lives++;
                            }
                        }
                    }
                }

                if (board[row][col] == 1 && (lives < 2 || lives > 3)) {
                    board[row][col] = -1;
                }

                if (board[row][col] == 0 && lives == 3) {
                    board[row][col] = 2;
                }
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (board[row][col] > 0) {
                    board[row][col] = 1;
                } else {
                    board[row][col] = 0;
                }
            }
        }
    }
}
