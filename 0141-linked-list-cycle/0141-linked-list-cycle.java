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
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = slow;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }

        return false;

        // Set<ListNode> check = new HashSet<>();

        // while (curr != null) {
        //     check.add(curr);
        //     curr = curr.next;
        //     if (check.contains(curr)) {
        //         return true;
        //     }
        // }
        // return false;
    }
}