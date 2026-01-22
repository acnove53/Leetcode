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
    public int maxDepth(TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode curr, int count) {
        if (curr == null) {
            return count;
        }

        count ++;
        int leftM = helper(curr.left, count);
        int rightM = helper(curr.right, count);

        return leftM > rightM ? leftM : rightM;
    }
}