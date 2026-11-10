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
        HashMap<Node , Node> m = new HashMap<>();
        Node curr = head;
        m.put(null , null);
        while(curr != null){
            Node c = new Node(curr.val);
            m.put(curr , c);
            curr = curr.next;
        }
        curr = head;
        while(curr != null){
            Node c = m.get(curr);
            c.next = m.get(curr.next);
            c.random = m.get(curr.random);
            curr = curr.next;
        }
        return m.get(head);
    }
}
