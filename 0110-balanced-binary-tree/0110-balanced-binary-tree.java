/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (height(root) == -1) {
            return false;
        }
        return true;
    }

    private int height(TreeNode curr) {
        if (curr == null) {
            return 0;
        }

        int l = height(curr.left);
        if (l == -1) {
            return -1;
        }
        int r = height(curr.right);
        if (r == -1) {
            return -1;
        }
        if (Math.abs(l-r) > 1) {
            return -1;
        }
        return Math.max(l,r) + 1;
    }
}