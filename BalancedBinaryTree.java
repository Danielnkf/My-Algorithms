/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        
       
        return helper(root)>=0;
   
    }
    public int helper(TreeNode root){
         if (root==null) return 0;
         
         int leftH = helper(root.left); //recursive to search children below this node for root.left
         int rightH = helper(root.right);//recursive to search children below this node for root.right
         
         //check if every node is balanced 
         if(leftH<0||rightH<0|| Math.abs(leftH-rightH)>1) return -1;

         //for recursive loop of helper (leftH&rightH), adding 1 for each loop
         //for isBalanced (1st loop), return the higher number of levels
         //Math.max mainly used for cal the max height of each level
         return 1+Math.max(leftH, rightH); 
         
    }
}