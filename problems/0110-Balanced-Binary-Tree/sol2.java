// ==========================================================
// 110. Balanced Binary Tree
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 1 ms (Beats 75%)
// Memory     : 44.6 MB (Beats 99%)
// Link       : https://leetcode.com/problems/balanced-binary-tree/
// ==========================================================

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
   
   public int height(TreeNode root ){
      if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
         return 1+Math.max(left,right);
   }


    public boolean isBalanced(TreeNode root) {
     
     if(root==null){
        return true;
     }
 int left=height(root.left);
        int right=height(root.right);

        if(Math.abs(left-right)>1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);


      


    
    
    
    }




}