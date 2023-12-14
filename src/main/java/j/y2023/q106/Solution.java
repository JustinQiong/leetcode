package j.y2023.q106;

import j.com.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postOrder) {
        int n = inorder.length;
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }

        return build(postOrder, 0, n - 1, n - 1);
    }

    public TreeNode build(int[] postOrder, int postLeft, int postRight, int inRight) {
        if (postLeft > postRight) {
            return null;
        }
        int root = postOrder[postRight];
        TreeNode rootNode = new TreeNode(root);
        int rootIdx = map.get(root);
        int rightLen = inRight - rootIdx;
        rootNode.left = build(postOrder, postLeft, postRight - rightLen - 1, rootIdx - 1);
        rootNode.right = build(postOrder, postRight - rightLen, postRight - 1, inRight);

        return rootNode;
    }
}
