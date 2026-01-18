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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode pointR = dummy;

        while (true) {
            ListNode kth = findNode(pointR, k);
            if (kth == null) {
                break;
            }
            ListNode pointL = kth.next;

            ListNode curr = pointR.next;
            ListNode prev = kth.next;
            while (curr != pointL) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            ListNode temp = pointR.next;
            pointR.next = kth;
            pointR = temp;

        }
        return dummy.next;
        
    }

    private ListNode findNode(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }
    // if (head == null) {
        //     return head;
        // }
        // ListNode point = head;
        // ListNode curr = head;
        // ListNode prev = null;

        // while (curr != null) {
        //     int i = 0;
        //     while (i < k) {
        //         ListNode temp = curr.next;
        //         curr.next = prev;
        //         prev = curr;
        //         curr = temp;
        //     }
        //     point.next = curr;
            
        // }


        // ListNode point = new ListNode();
        // ListNode h = point;
        // ListNode curr = head;
        // Stack<Integer> bucket = new Stack<>();

        // while (curr != null) {
        //     if (bucket.size() == k) {
        //         while (!bucket.isEmpty()) {
        //             point.next = new ListNode(bucket.pop());
        //         }
        //     }
        //     bucket.push(curr.val);
        //     curr = curr.next;
        // }


        // if (!bucket.isEmpty()) { 
        //     if (bucket.size() == k) {
        //         while (!bucket.isEmpty()) {
        //             point.next = new ListNode(bucket.pop());
        //         }
        //     }
        // }

        // while (!bucket.isEmpty()) {

        // }
        
        // return h.next;
}