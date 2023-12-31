package j.y2023.q94;

import j.com.TreeNode;
import j.y2023.q94.Solution;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class SolutionTest {

    @Test
    void inorderTraversalTest() {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);;
        root.right = two;
        TreeNode three = new TreeNode(3);
        two.left = three;
        Solution solution = new Solution();
        assertIterableEquals(List.of(1, 3, 2), solution.inorderTraversal(root));
    }
}