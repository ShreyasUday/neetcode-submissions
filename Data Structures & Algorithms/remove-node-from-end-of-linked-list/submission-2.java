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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(0,head);
        ListNode right = head;
        ListNode left = res;

        while(n>0){
            right = right.next;
            n--;
        }
        while(right!=null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return res.next;
    }
}

/*
1. iterate through list using right pointer while(n>0)
2. increment left and right pointer until right is null
3. use dummy and start with 0 node in the list 
        original list : 2->3->6->1
        dummy list    : 0->2->3->6->1
        left pointer points to dummy
*/
