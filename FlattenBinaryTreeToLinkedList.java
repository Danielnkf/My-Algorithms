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
    public void flatten(TreeNode root) {
    Stack <TreeNode> s = new Stack<TreeNode>();
    TreeNode p = root;
    if(root==null) return;
    
    while(p!=null||!(s.empty())){ //while p is sth OR item in stack
        if(p.right!=null) //store the right tree
            s.push(p.right);
        
        //Either do replacing or pop right from stack
        
        if(p.left!=null){ 
            p.right=p.left; //replace the right tree with left tree
            p.left=null; //set the left tree null
        }else if(!(s.empty())) //will do when nth in left nodes (parent and children's left nodes)
            p.right=s.pop();//pop the whole right tree 
        
        p=p.right;
    }
    
    }

      
}

/***** Not working yet *****/

        /*TreeNode res = null;
        if(root==null) return ;
        helper(root, res);
        root=res;
    }
    public void helper(TreeNode a, TreeNode b){
    
    if(a.left!=null){
    b.right = a.left;
    helper(a.left, b.right);
    }
    if(a.right!=null){
    b.right = a.left;
    helper(a.left, b.right);  
    }
    */