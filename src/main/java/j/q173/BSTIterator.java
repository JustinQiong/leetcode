package j.q173;

import j.com.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class BSTIterator {

    Deque<TreeNode> stack;

    TreeNode curr;

    public BSTIterator(TreeNode root) {
        stack = new LinkedList<>();
        curr = root;
    }

    public int next() {
        while (curr != null) {
            stack.push(curr);
            curr = curr.left;
        }

        curr = stack.pop();
        int val = curr.val;
        curr = curr.right;
        return val;
    }

    public boolean hasNext() {
        return curr != null || !stack.isEmpty();
    }
}
