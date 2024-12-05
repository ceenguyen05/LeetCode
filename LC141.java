
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // empty list cant be cycle 
        if (head == null) {
            return false ;
        }
        // start at the head 
        ListNode slow = head ;
        ListNode fast = head ;
        // tranverse both pointers while there is no null next pointer 
        // move slow .next once while 
        // fast goes two steps ahead 
        // if the meet , then it is a cycle 
        while (fast.next != null) {
            slow = slow.next ;
            // null pointer check 
            if (fast.next.next == null) {
                return false ;
            } else {
                fast = fast.next.next ;
            }
            if (slow == fast) {
                return true ;
            }
        }
        // if loop exits, means there is not a cycle 
        return false ;
    }
}
