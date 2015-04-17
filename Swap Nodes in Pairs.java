/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) { // use e.g. 1->2->3->4
        if(head==null||head.next==null)
        return head;
        ListNode root=new ListNode(0);
        ListNode cur=root; // Create a new link node (not head) root has val and next
        ListNode cur1=head.next; //1 step ahead pointer
        ListNode cur2=head;//behind cur1 pointer
        while(cur1!=null){
           cur.next=cur1; // root.next points to "2" (jump over "1")
           cur2.next=cur1.next; //assign "1".next to point "3"
           cur1.next=cur2;// assign"2".next point back to "1"
           
           // new array is 2->1->3->4 after first time
           cur=cur2; // create a new condition. cur stop right behind cur2 (stop at "1")
           if(cur2.next==null) break;//checking
           cur2=cur2.next;// cur2 jump to next node ("1"->"3")
           cur1=cur2.next;// cur1 jump one step ahead cur2 "4"
                         // remember cur2 walked a step already 
        }
       
          return root.next; 
    }
}