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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode half = slow.next;
        slow.next = null;
        ListNode prev = null;
        while (half != null) {
            ListNode temp = half.next;
            half.next = prev;
            prev = half;
            half = temp;
        }

        ListNode curr = head;
        half = prev;
        while (half != null) {
            ListNode temp1 = curr.next;
            ListNode temp2 = half.next;
            curr.next = half;
            half.next = temp1;
            curr = temp1;
            half = temp2;

        }

        // ListNode half = head.next;
        // for (int i = 0; i < len / 2; i++) {
        //     half = half.next;
        // }

        // Stack<ListNode> stack = new Stack<>();
        // while (half != null) {
        //     ListNode temp = half.next;
        //     half.next = null;
        //     stack.push(half);
        //     half = temp;
        // }
        // while(!stack.isEmpty()) {
        //     System.out.println(stack.pop().val);
        // }

        // curr = head;
        // while (!stack.isEmpty()) {
        //     ListNode temp = curr.next;
        //     curr.next = stack.pop();
        //     curr = curr.next;
        //     curr.next = temp;
        //     if (curr.next != null) {
        //         curr = curr.next;
        //     }
        // }

        //[1, 2, 3, 4, 5, 6, 7, 8, 9] len = 9
        //[1, 9, 2, 8, 3, 7, 4, 6, 5]

    }
}