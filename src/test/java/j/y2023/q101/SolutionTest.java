package j.y2023.q101;

import j.com.TreeNode;
import j.y2023.q101.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void isSymmetricTrueTest() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        left.left = new TreeNode(3);
        left.right = new TreeNode(4);
        TreeNode right = new TreeNode(2);
        right.left = new TreeNode(4);
        right.right = new TreeNode(3);
        root.left = left;
        root.right = right;
        Solution solution = new Solution();
        assertTrue(solution.isSymmetric(root));
    }

    @Test
    void isSymmetricFalseTest() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        left.right = new TreeNode(3);
        TreeNode right = new TreeNode(2);
        right.right = new TreeNode(3);
        Solution solution = new Solution();
        assertFalse(solution.isSymmetric(root));
    }
}