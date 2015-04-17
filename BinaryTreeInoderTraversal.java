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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList <Integer>();
        
        if(root==null)
        return result;
        else if(root!=null){
            travel(result, root);
        }return result;
        
    }
    public void travel(ArrayList<Integer> result, TreeNode cur){
        if(cur!=null){
            travel(result, cur.left);
            result.add(cur.val);
            travel(result, cur.right);
        }
    }
}