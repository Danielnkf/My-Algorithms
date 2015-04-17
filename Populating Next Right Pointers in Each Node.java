/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root==null)
        return;
        while (root!=null){
            TreeLinkNode cur=root;
            while (cur!=null){
                if(cur.left!=null){     // Link the first triangle (Case1)
                    cur.left.next=cur.right;
                }
                if(cur.right!=null&& cur.next!=null){ //DON'T use else if (Case 2)
                    cur.right.next=cur.next.left;     //Since this is right corner of first triagle
                                                    // linking to the second one (from level 3, 4, 5...)
                }                                   // e.g. Point 5 to 6 in example below
                
                cur=cur.next;
                
            }root = root.left;
        }
        
        
    }
}


/* for this problem, we need two cases 1. create its own triangle, 2. link right corner to next triangle
 root.next is default as null so we don't have to care.
 Use root as outest pointer to move vertically
 Use cur as inner pointer to move horizontally

      1
    2    3
   4 5  6 7
 */