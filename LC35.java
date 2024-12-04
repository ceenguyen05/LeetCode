
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0 ;
        int high = nums.length - 1;
        return searchHelper(nums , target , low , high) ;

    }
    // binary search , recursion , O(log n)
    public int searchHelper (int [] nums , int target , int low , int high) {
        int mid = (high + low) / 2 ;
        if (nums[mid] == target) {
            return mid ;
        } else if (low > high) {
            return low ;
        }
        if (nums[mid] < target) {
            return searchHelper(nums , target , mid + 1 , high) ;
        } else {
            return searchHelper(nums , target , low , mid - 1) ;
        }

    }
}
