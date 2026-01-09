/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        Set<ListNode> check = new HashSet<>();

        while (curr != null) {
            check.add(curr);
            curr = curr.next;
            if (check.contains(curr)) {
                return true;
            }
        }
        return false;
    }
}