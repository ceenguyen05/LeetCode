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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // new node for BST 
        TreeNode newNode = new TreeNode (val) ;
        // for empty list
        if (root == null) {
            root = newNode ;
        // find the right spot recursivly 
        } else {
            insertHelper (root , newNode) ;
        }
        return root ;
    }

    public void insertHelper (TreeNode node , TreeNode newNode) {
        // check which subtree to recurse 
        if (newNode.val < node.val) {
            // if left subtree 
            if (node.left == null) {
                node.left = newNode ;
            } else {
                // else search for the place 
                insertHelper(node.left , newNode) ;
            }
        } else {
            // if right subtree 
            if (node.right == null) {
                node.right = newNode ;
            } else {
                // else search for the place 
                insertHelper(node.right , newNode) ;
            }
        }
    }
}