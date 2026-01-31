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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            List<Integer> temp = new LinkedList<>();
            int len = q.size();
            while (len > 0) {
                TreeNode poll = q.poll();
                if(poll != null) {
                    temp.add(poll.val);
                    q.add(poll.left);
                    q.add(poll.right);
                }
                len--;
            }
            if (temp.size() != 0) {
                System.out.println(temp);
                result.add(temp);
            }
        }
        return result;
    }
}