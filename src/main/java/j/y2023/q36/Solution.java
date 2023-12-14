package j.y2023.q36;

public class Solution {

    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][][] subs = new int[3][3][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];

                if (ch != '.') {
                    int idx = (ch - '0') - 1;
                    rows[i][idx]++;
                    cols[j][idx]++;
                    subs[i/3][j/3][idx]++;
                    if (rows[i][idx] > 1 || cols[j][idx] > 1 || subs[i/3][j/3][idx] > 1) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

}
