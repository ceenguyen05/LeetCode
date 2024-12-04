
class Solution {
    public int[] plusOne(int[] digits) {
        // start from the last digit 
        for (int digit = digits.length - 1 ; digit >= 0 ; digit--) {
            // if current number is less than 9
            // increment and done , return new array 
            if (digits[digit] < 9) {
                digits[digit]++ ;
                return digits ;
            }
            // if current number does not return , means it is 9
            // set current index to 0 and carry on (next digit will be incremented)
            digits[digit] = 0 ;
        }

        // edge case if there is all 9s 
        // create new array 
        int [] array = new int [digits.length + 1] ;
        array[0] = 1 ;
        return array ;
    }
}
