
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0) ; // dummy node 
        ListNode current = result ; // first node 
        // if another reaches double digits when adding (7+7) , result is 14 
        // 4 stays , carry is 1 
        // 9+8 = 17 , 7stays (%) , carry is 1
        int carry = 0 ; 

        // process all nodes and leftover carrys 
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry ; // start with the sloppy seconds 

            if (l1 != null) {
                sum += l1.val ; // add current node to sum 
                l1 = l1.next ;
            }

            if (l2 != null) {
                sum += l2.val ;
                l2 = l2.next ;
            }

            carry = sum / 10 ; // divide by 10 to get carry (sloppy seconds)
            current.next = new ListNode(sum % 10) ; // new node , single digit
            current = current.next ; // move to next node 
        }
        return result.next ;
    }
}
