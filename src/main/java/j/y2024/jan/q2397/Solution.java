package j.y2024.jan.q2397;

/**
 * 2397. Maximum Rows Covered by Columns
 * Convert each row into a integer. The bit of the integer
 * stands for the 0 and 1 of the cell. Try every possibility
 * from 1(which means cover 1 col) to (1 << n - 1)(which means each col will be covered).
 * Do the & operation to find out if each row will be covered and
 * calculate the maximum covered rows.
 */
public class Solution {
    public int maximumRows(int[][] matrix, int numSelect) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] mt = new int[m];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                mt[i] += (matrix[i][j] << (n-j-1));
            }
        }

        int curr = 0;
        int max = 0;
        int limit = (1 << n);
        while (++curr < limit) {
            if (Integer.bitCount(curr) != numSelect) {
                continue;
            }

            int t = 0;
            for (int i=0; i<m; i++) {
                if ((mt[i] & curr) == mt[i]) {
                    t++;
                }
            }
            max = Math.max(max, t);
        }
        return max;
    }
}
