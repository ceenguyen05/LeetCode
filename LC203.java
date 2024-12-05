
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
    public ListNode removeElements(ListNode head, int val) {
        // if empty list 
        if (head == null) {
            return null ;
        }

        // for if the head has the target value 
        while (head != null && head.val == val) {
            head = head.next ;
        }

        // check the next node of current. if it is val then 
        // connect current to the next node over 
        // if not then move on to next node 
        ListNode current = head ;
        while (current != null && current.next != null) {
            if (current.next.val == val ) {
                current.next = current.next.next ;
            } else {
                current = current.next ;
            }
        }

        return head ;
    }
}
