
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create HashMap 
        HashMap <Integer , Integer> hash = new HashMap <> () ;
        // go through each index of array
        for (int count = 0 ; count < nums.length ; count++) {
            // target - current number gives a matching two sum 
            int compliment = target - nums[count] ;
            // if the compliment is in the hashmap , 
            // return that index and current  index 
            if (hash.containsKey(compliment)) {
                return new int [] {hash.get(compliment) , count} ;
            }
            // else add the number to hash with its index
            // storing the value to see if it is a compliment to a future number 
            // store the count (index) to retrieve the index later if needed
            hash.put(nums[count] , count) ;
        }
        return null ;
    }
}
