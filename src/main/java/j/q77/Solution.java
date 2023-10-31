package j.q77;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<Integer> temp = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        dfs(1, n, k);
        return ans;
    }

    private void dfs(int curr, int n, int k) {
        if (temp.size() + n - curr + 1 < k) {
            return;
        }

        if (temp.size() == k) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(curr);
        dfs(curr + 1, n, k);
        temp.remove(temp.size() - 1);
        dfs(curr + 1, n, k);
    }

}
