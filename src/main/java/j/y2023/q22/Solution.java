package j.y2023.q22;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return res;
        }

        dfs(new StringBuilder(), 0, 0, n);
        return res;
    }

    private void dfs(StringBuilder sb, int open, int close, int max) {
        if (sb.length() == max * 2) {
            res.add(sb.toString());
            return;
        }

        if (open < max) {
            sb.append('(');
            dfs(sb, open + 1, close, max);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (close < open) {
            sb.append(')');
            dfs(sb, open, close +1, max);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
