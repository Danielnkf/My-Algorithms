/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode cur=head; //Head is just a pointer with no R and N
        if(head==null) return null;
        
        while (cur!=null){ //insert a new node(A') to each original node (A)
            RandomListNode newNode = new RandomListNode (cur.label);
            newNode.next=cur.next;
            cur.next =newNode;
            cur = newNode.next;
        }
        
        /**********************************************************************/
        
        cur = head;
        while(cur!=null){ //Assign A'.random points to what A.random points to
            if(cur.random!=null)
            cur.next.random= cur.random.next; //eg. A|R|N (R ->C|R|N), then A|R|N->A'|R|N->B|R|N->...->C|R|N->C'|R|N (A'.R->C')
            cur=cur.next.next; //Head->A->A'->B
        }
        
        /**********************************************************************/
        
        RandomListNode copy = head.next; // Fixed head for new list
        RandomListNode first=head;       // Control original list
        RandomListNode second=head.next; // Control new list
        
        while(first!=null){ //Separate the list into two separated lists by assigning the Node.next (eg. A.next)
        first.next= second.next;
        if(second.next!=null){
            second.next= second.next.next;
        }
        first = first.next;
        second = second.next;
        
        }return copy;
        
    }
}