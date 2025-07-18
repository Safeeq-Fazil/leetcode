/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode tptr1=head,tptr2=head;
        while(tptr2!=null && tptr2.next!=null)
        {
            tptr1=tptr1.next;
            tptr2=tptr2.next.next;
            if(tptr1 == tptr2)
            {
                return true;
            }

        }
        return false;
    }
}