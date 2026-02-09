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
    public int goodNodes(TreeNode root) {
        return dfs(root, 0, Integer.MIN_VALUE);
    }

    private int dfs(TreeNode root, int count, int max) {
        if (root == null) {
            return count;
        }

        if (root.val >= max) {
            max = root.val;
            count++;
        }
        int l = dfs(root.left, count, max);
        int r = dfs(root.right, count, max);

        return l+r-count;
    }
}