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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        for (int i = 1; i < lists.length; i++) {
            lists[0] = mergeTwoLists(lists[0], lists[i]);
        }

        return lists[0];


        // for (ListNode node : lists) {
        //     while (node != null) {

        //         while ()
        //     }
        // }
    }

    private ListNode mergeTwoLists(ListNode a, ListNode b) {
        ListNode head = a;
        if (a == null) {
            return b;
        }
        while (b != null) {
            if (a.next == null && a.val < b.val) {
                a.next = b;
                break;
            } else if (a.val >= b.val) {
                ListNode temp = new ListNode(a.val);
                a.val = b.val;
                temp.next = a.next;
                a.next = temp;
                b = b.next;
            } else {
                a = a.next;
            }
        }
        return head;
    }
}