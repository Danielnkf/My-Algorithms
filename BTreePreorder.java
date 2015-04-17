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
    public List<Integer> preorderTraversal(TreeNode root){
        ArrayList<Integer> list = new ArrayList<Integer>();
        PrintList(root, list);
        return list;
    }
    public void PrintList(TreeNode root, ArrayList<Integer> list){
        if(root==null)
        return;
        list.add(root.val);
        PrintList(root.left, list);
        PrintList(root.right, list);
        }
   
}
    