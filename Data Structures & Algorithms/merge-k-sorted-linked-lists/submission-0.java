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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        int n = lists.length;
        PriorityQueue<ListNode> q = new PriorityQueue<>((a,b) -> a.val - b.val);
        for(int i = 0; i<n; i++){
            if(lists[i] != null) q.offer(lists[i]);
        }

        ListNode res = new ListNode(0);
        ListNode curr = res;
        while(!q.isEmpty()){
            ListNode temp = q.poll();
            curr.next = temp;
            curr = curr.next;

            temp = temp.next;
            if(temp != null){
                q.offer(temp);
            }

        }
        return res.next;

    }
}
/*
[
[4],
[3,5],
[3,6]
]

priority( 5 )
node 1-1-2-3-3-4-5

*/