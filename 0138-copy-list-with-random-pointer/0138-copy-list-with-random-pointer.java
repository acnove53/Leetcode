/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node curr = head;
        Map<Node, Node> map = new HashMap<>();
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        curr = head;
        Node copyH = map.get(curr);
        Node copy = copyH;
        while (curr != null) {
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);
            copy = copy.next;
            curr = curr.next;
        }
        return copyH;

    }
}