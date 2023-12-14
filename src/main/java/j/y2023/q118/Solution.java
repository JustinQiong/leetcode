package j.y2023.q118;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new LinkedList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> lastRow = res.get(i-1);
                    row.add(lastRow.get(j-1) + lastRow.get(j));
                }
            }
            res.add(row);
        }

        return res;
    }
}
