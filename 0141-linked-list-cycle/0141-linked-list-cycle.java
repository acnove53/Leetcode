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
//10.17 17.4 
        ListNode slow = head;
        ListNode fast = slow;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast.equals(slow)) {
                return true;
            }
            System.out.println("fast=" + fast + "slow=" + slow);
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