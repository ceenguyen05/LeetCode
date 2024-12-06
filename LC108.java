
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // for BST , always call a recursive helper 
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper (nums , 0 , nums.length - 1) ;
    }
    public TreeNode helper (int [] nums , int low , int high) {
        // base case , return null to indicate a child is null 
        if (low > high) {
            return null ;
        }

        int mid = (low + high) / 2 ;

        TreeNode root = new TreeNode (nums[mid]) ;
        // recursively add the left half of the array and right half 
        root.left = helper (nums , low , mid - 1) ;
        root.right = helper (nums , mid + 1 , high) ;

        return root ;
    }
}
