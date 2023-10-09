package j.q54;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        int left = 0, top = 0;
        int bottom = matrix.length - 1, right = matrix[0].length - 1;
        while (left <= right && top <= bottom) {
            for (int column = left; column <= right; column++) {
                res.add(matrix[top][column]);
            }

            for (int row = top + 1; row <= bottom; row++) {
                res.add(matrix[row][right]);
            }

            for (int column = right - 1; column > left; column--) {
                res.add(matrix[bottom][column]);
            }

            for (int row = bottom - 1; row > top; row--) {
                res.add(matrix[row][left]);
            }
            left++;
            right--;
            top++;
            bottom--;
        }

        return res;
    }
}
