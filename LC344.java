
class Solution {
    public void reverseString(char[] s) {
        // index
        int start = 0 ;
        int end = s.length - 1 ;
        // keeps going until the whole array is traversed 
        while (start < end) {
            char temp = s[start] ; // stores the leftmost
            s[start] = s[end] ; // switch the start with the end 
            s[end] = temp ; // switch the end with the start
            // in and decrement 
            start++ ;
            end-- ;
        }
    }
}