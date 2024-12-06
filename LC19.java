
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null ;
        }

        ListNode current = head ; 
        int count = 0 ;
        while (current != null) {
            count++ ;
            current = current.next ;
        }

        if (count == 0) {
            return null ;
        }

        int index = count - n ;

        if (index == 0) {
            head = head.next ;
            return head ;
        }

        current = head ;
        for (count = 0 ; count < index - 1 ; count++) {
            current = current.next ;
        }
        if (current.next.next != null) {
            current.next = current.next.next ;
        } else {
            current.next = null ;
        }
        return head ;
    }
}
