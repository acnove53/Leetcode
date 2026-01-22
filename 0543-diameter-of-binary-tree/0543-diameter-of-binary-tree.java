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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        int l = helper(root);
        return max;
    }

    private int helper(TreeNode curr) {
        if (curr == null) {
            return 0;
        }

        int left = helper(curr.left);
        int right = helper(curr.right);
        if (left + right > max) {
            max = left + right;
        }
        return Math.max(left, right) + 1;
    }
}