
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
    public ListNode oddEvenList(ListNode head) {
        // if empty or single node 
        if (head == null || head.next == null) {
            return head ;
        }

        // split the linked list into two list
        // create nodes for the current of each 
        // start with the 3rd node in OG list 
        // set flag to odd (3rd node is odd)
        ListNode odd = head ;
        ListNode even = head.next ;
        ListNode currentOdd = odd ;
        ListNode currentEven = even ;
        ListNode current = even.next ;
        boolean isOdd = true ;

        // go through the entire OG list 
        // if it is odd , add to odd list 
        // if it is even , add to even list
        // flip flag afer each go 
        while (current != null) {
            if (isOdd) {
                currentOdd.next = current ;
                currentOdd = currentOdd.next ;
            } else {
                currentEven.next = current ;
                currentEven = currentEven.next ;
            }
            isOdd = !isOdd ;
            current = current.next ;
        }
        // terminate the even list 
        // connect the two list together and return 
        currentEven.next = null ;
        currentOdd.next = even ;
        return odd ;
    }
}

