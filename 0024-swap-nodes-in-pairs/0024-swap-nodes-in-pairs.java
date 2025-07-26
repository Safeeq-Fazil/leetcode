/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode tptr1,tptr2,safe,newhead;
        if(head==null || head.next==null)
        {
            return head;
        }
        tptr1=head;
        tptr2=head.next;
        newhead=tptr2;
       while(true)
       {
            safe=tptr2.next;
            tptr2.next=tptr1;
            if(safe==null || safe.next==null)
            {
                tptr1.next=safe;
                break;
            }
            tptr1.next=safe.next;
            tptr1= safe;
            tptr2=safe.next;
       }
       return newhead;
    }
}