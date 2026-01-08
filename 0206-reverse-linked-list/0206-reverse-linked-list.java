/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode curr = head;
        ListNode last = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = last;
            last = curr;
            curr = temp;
        }
        return last;

        // Stack<Integer> stack = new Stack<>();
        // ListNode curr = head;
        // while (curr != null) {
        //     stack.push(curr.val);
        //     curr = curr.next;
        // }

        // ListNode res = new ListNode(stack.pop(), null);
        // head = res;
        // while (!stack.isEmpty()) {
        //     res.next = new ListNode(stack.pop(), null);
        //     res = res.next;
        // }
        // return head;
    }
}