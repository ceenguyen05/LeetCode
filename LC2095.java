
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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null) {
            return null ;
        }
        ListNode fast = head ;
        int count = 0 ;
        while (fast != null && fast.next != null) {
            fast = fast.next.next ;
            count++ ;
        }
        
        if (count == 0) {
            return null ;
        }

        ListNode current = head ;
        for (int index = 0 ; index < count - 1 ; index++) {
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