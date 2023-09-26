package j.q6;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int flag = 1;
        int i = 0;
        for (char ch : s.toCharArray()) {
            rows.get(i).append(ch);
            if (i == numRows-1 || i == 0) {
                flag = -flag;
            }
            i += flag;
        }

        StringBuilder ans = new StringBuilder();
        for (StringBuilder row : rows) {
            ans.append(row);
        }

        return ans.toString();
    }
}
