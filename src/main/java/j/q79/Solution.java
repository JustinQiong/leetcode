package j.q79;

public class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0) {
            return false;
        }

        int rows = board.length;
        int cols = board[0].length;
        char[] chs = word.toCharArray();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, i, j, chs, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, int row, int col, char[] chs, int index) {
        if (row >= board.length || row < 0
                || col >= board[0].length || col < 0
                || chs[index] != board[row][col]) {
            return false;
        }

        if (index == chs.length - 1) {
            return true;
        }

        board[row][col] = ' ';
        boolean res = dfs(board, row + 1, col, chs, index + 1)
                || dfs(board, row - 1, col, chs, index + 1)
                || dfs(board, row, col + 1, chs, index + 1)
                || dfs(board, row, col - 1, chs, index + 1);
        board[row][col] = chs[index];
        return res;
    }
}