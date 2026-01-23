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
        if (height(root) == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    private int height(TreeNode curr) {
        if (curr == null) {
            return -1;
        }

        int l = height(curr.left);
        if (l == Integer.MIN_VALUE) {
            return l;
        }
        int r = height(curr.right);
        if (r == Integer.MIN_VALUE) {
            return r;
        }
        if (Math.abs(l-r) > 1) {
            return Integer.MIN_VALUE;
        }
        return Math.max(l,r) + 1;
    }
}