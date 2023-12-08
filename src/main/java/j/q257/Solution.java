package j.q257;

import j.com.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<String> paths = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root, "");
        return paths;
    }

    private void dfs(TreeNode root, String path)  {
        if (root == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(path);
        sb.append(root.val);
        if (root.left == null && root.right == null) {
            paths.add(sb.toString());
        } else {
            sb.append("->");
            String str = sb.toString();
            dfs(root.left, str);
            dfs(root.right, str);
        }
    }
}
