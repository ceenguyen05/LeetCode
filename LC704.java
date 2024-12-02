// Binary Search 

class Solution {
    public int search(int[] nums, int target) {
        // get the low and highs of the array , call recursive helper 
        int low = 0 ;
        int high = nums.length - 1 ;
        return searchHelper (nums , target , low , high) ;

    }

    public int searchHelper (int [] nums , int target , int low , int high) {
        // base case , target not found atp 
        if (low > high) {
            return -1 ;
        }
        // O(Log n) is achieved by splitting the array
        int mid = (high + low) / 2 ; 
        // check where the target lies in the array , then recurse 
        if (target == nums[mid]) {
            return mid ;
        } else if (target < nums[mid]) {
            return searchHelper (nums , target , low , mid - 1) ;
        } else {
            return searchHelper (nums , target , mid + 1 , high) ;
        }
    }
}
