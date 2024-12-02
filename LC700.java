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
    public TreeNode searchBST(TreeNode root, int val) {
        // if BST is empty 
        if (root == null) {
            return null ;
        }
        // if root is the target val
        if (root.val == val) {
            return root ;
        }
        // if val is further in the tree then recurse 
        return searchHelper(root , val) ;
    }

    public TreeNode searchHelper (TreeNode node , int val) {
        // if the node in this run has the value 
        if (node.val == val) {
            return node ;
        } else {
            // search left subtree 
            if (val < node.val) {
                // if the node has a left child , recurse 
                if (node.left != null) {
                    return searchHelper(node.left , val) ;
                // else it is not found and return null 
                } else {
                    return null ;
                }
            // search right subtree
            } else {
                // if the node has a right child , recurse 
                if (node.right != null) {
                    return searchHelper(node.right , val) ;
                // else value is not found 
                } else {
                    return null ;
                }
            }
        }
    }
}