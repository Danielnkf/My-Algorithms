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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur=head;
      
        while (cur!=null&&cur.next!=null){
        if(cur.val==cur.next.val){
            cur.next=cur.next.next;
            continue; // skip cur=cur.next, since the 1st node may equal to the 3rd node
        }
         cur=cur.next;
      
        }
        return head;
    }
}