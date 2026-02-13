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
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
        // if (root == null) {
        //     return true;
        // }
        // boolean l = true;
        // boolean r = true;
        // if (root.left != null) {
        //     if (root.left.val >= root.val) {
        //         return false;
        //     }
        //     l = isValidBST(root.left);
        // }
        // if (root.right != null) {
        //     if (root.right.val <= root.val) {
        //         return false;
        //     }
        //     l = isValidBST(root.right);
        // }

        // return l && r;
    }
    private boolean helper(TreeNode node, long l, long r) {
        if (node == null) {
            return true;
        }
        if (node.val <= l || r <= node.val) {
            return false;
        }

        boolean lcheck = helper(node.left,l,node.val);
        boolean rcheck = helper(node.right,node.val,r);

        return lcheck && rcheck;
    }
}