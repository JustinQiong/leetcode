package j.y2023.dec.q559;

import j.com.Node;

/**
 * 559. Maximum Depth of N-ary Tree
 * Depth first depth solution
 * Recursively calculate the depth of node.
 * The depth of current node is the max depth of
 * the child nodes plus one.
 */
public class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int depth = 0;
        for (Node child : root.children) {
            depth = Math.max(depth, maxDepth(child));
        }
        return depth + 1;
    }
}
