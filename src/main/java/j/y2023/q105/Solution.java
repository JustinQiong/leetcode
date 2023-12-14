package j.y2023.q105;

import j.com.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, 0, n - 1, inorder, 0, n - 1);
    }

    public TreeNode build(int[] preorder, int preLeft, int preRight, int[] inorder, int inLeft, int inRight) {
        if (preLeft > preRight) {
            return null;
        }
        int root = preorder[preLeft];
        TreeNode rootNode = new TreeNode(root);
        int rootIdx = map.get(root);
        int leftLen = rootIdx - inLeft;
        rootNode.left = build(preorder, preLeft + 1, preLeft + leftLen, inorder, inLeft, rootIdx - 1);
        rootNode.right = build(preorder, preLeft + leftLen + 1, preRight, inorder, rootIdx + 1, inRight);

        return rootNode;
    }

}
