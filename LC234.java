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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true ;
        }

        // two pointers to find the midpoint 
        ListNode first = head ;
        ListNode second = head ;
        while (second != null && second.next != null) {
            first = first.next ; // will be at the midnpoint or one after 
            second = second.next.next ;
        }

        // get reverse a half of the list 
        ListNode secondHalf = reverse(first) ;

        // compare the two halves 
        ListNode firstHalf = head ;
        boolean palindrome = true ;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                palindrome = false ;
                break ;
            }
            firstHalf = firstHalf.next ;
            secondHalf = secondHalf.next ;
        }
        return palindrome ;
    }

    // reverse function 
    public ListNode reverse (ListNode first) {
        ListNode prev = null ;
        while (first != null) {
            ListNode next = first.next ;
            first.next = prev ;
            prev = first ;
            first = next ;
        }
        return prev ;
    }
}
