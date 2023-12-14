package j.y2023.q108;

import j.com.TreeNode;

class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums, 0, nums.length - 1);
    }

    private TreeNode bst(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = bst(nums, left, mid - 1);
        root.right = bst(nums, mid + 1, right);
        return root;
    }
}
