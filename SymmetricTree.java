/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * Example:
 *          1
 *         / \
 *        2   2
 *       / \ / \
 *      3  4 4  3
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return helper(root.left, root.right);
    }
    public boolean helper(TreeNode a, TreeNode b){
        if(a==null) return b==null; //return b==null check/compare if b is null, true for b=null
        if(b==null) return false; //since a has been check in previous statement
        
        if(a.val!=b.val) return false;
        
        if(!(helper(a.left, b.right))) return false; //recursive for "3" in example
        if(!(helper(a.right, b.left))) return false; //recursive for "4" in example
    
        return true; // if no if loop has executed, return true
    }
}