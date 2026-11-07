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
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow.next;
        ListNode prev = slow.next = null;
        while(curr != null){
            ListNode n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        ListNode first = head;
        curr = prev;
        while(first != null && curr != null){
            ListNode t1 = first.next;
            ListNode t2 = curr.next;
            first.next = curr;
            curr.next = t1;
            first = t1;
            curr = t2;
        }
    }
}
