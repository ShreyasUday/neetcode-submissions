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
    public boolean hasCycle(ListNode head) {
        // if(head.next == null) return false;
        // if(head.)
        ListNode i = head;
        ListNode j = head;
        while(j != null && j.next != null){
            i = i.next;
            j = j.next.next;
            if(i == j) return true;
        }
        return false;
    }
}
